package com.tianma.mesos.support.util;

import com.google.gson.*;

import java.util.*;

public class JsonUtil {

    public static final Gson GSON = new GsonBuilder().setPrettyPrinting()
            .disableHtmlEscaping().create();

    /**
     *
     * @param json
     * @return
     */
    public static JsonObject parseJson(String json) {
        JsonParser parser = new JsonParser();
        return parser.parse(json).getAsJsonObject();
    }

    /**
     *
     * @param json
     * @return
     */
    public static Map<String,Object> toMap(String json) {
        return JsonUtil.toMap(JsonUtil.parseJson(json));
    }

    /**
     *
     * @param json
     * @return
     */
    public static Map<String,Object> toMap(JsonObject json) {
        Map<String, Object> map = new HashMap<String, Object>();
        Set<Map.Entry<String, JsonElement>> entrySet = json.entrySet();

        for (Iterator<Map.Entry<String, JsonElement>> iter = entrySet.iterator(); iter.hasNext(); ){
            Map.Entry<String, JsonElement> entry = iter.next();
            String key = entry.getKey();
            Object value = entry.getValue();
            if(value instanceof JsonArray) {
                map.put((String) key, toList((JsonArray) value));
            }
            else if(value instanceof JsonObject) {
                map.put((String) key, toMap((JsonObject) value));
            }
            else {
                map.put((String) key, value);
            }
        }
        return map;
    }

    /**
     *
     * @param json
     * @return
     */
    public static List<Object> toList(JsonArray json){
        List<Object> list = new ArrayList<Object>();
        for (int i=0; i<json.size(); i++){
            Object value = json.get(i);
            if(value instanceof JsonArray){
                list.add(toList((JsonArray) value));
            }
            else if(value instanceof JsonObject){
                list.add(toMap((JsonObject) value));
            }
            else{
                list.add(value);
            }
        }
        return list;
    }

    /**
     *
     * @param jsonObj
     * @return
     */
    public static Object filterJsonNull(Object jsonObj){
        if(JsonNull.INSTANCE.equals(jsonObj)) {
            return null;
        }
        else {
            return jsonObj;
        }
    }

    /**
     *
     * @param object
     * @return
     */
    public static String toString(Object object) {
        return GSON.toJson(object);
    }
}
