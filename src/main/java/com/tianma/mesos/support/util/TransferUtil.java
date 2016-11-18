package com.tianma.mesos.support.util;

import com.google.gson.JsonNull;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by ASUS on 2016/5/9.
 */
public class TransferUtil {
    /**
     * 受时区影响
     * Input: "yyyy-[m]m-[d]dThh:mm:ss[.f...]Z"  ISO 8601
     * The Z on the end, spoken as "Zulu", means no time zone offset from UTC.
     * Output: Timestamp
     * if input is null , output is null.
     * @return
     */
    public static Timestamp stringToTimestamp(String time){
        String normalTime = jsonStringToString(time);
        if(normalTime == null) {
            return null;
        }
        try {
                TimeZone tz = TimeZone.getTimeZone("UTC");
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX");
                df.setTimeZone(tz);
            Date ans = df.parse(normalTime);
            return new Timestamp(ans.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String jsonStringToString(String jsonString) {
        return (jsonString == null? null :jsonString.replaceAll("\""," ").trim());
    }

    /**
     * Add the null control
     * @param json
     * @return
     */
    public static Double jsonObjectToDouble(Object json) {
        String str = jsonObjectToString(json);
        return  str == null ? null:Double.valueOf(str);
    }
    /**
     * Add the null control
     * @param json
     * @return
     */
    public static Integer jsonObjectToInteger(Object json) {
        String str = jsonObjectToString(json);
        return str == null ? null : Integer.valueOf(str);
    }

    /**
     * Maybe return null or "null"
     * @param json
     * @return
     */
    public static String jsonObjectToString(Object json)
    {
        if(JsonNull.INSTANCE.equals(json)|| json == null) {
            return  null;
        }
        else{
            return jsonStringToString(String.valueOf(json));
        }
    }

    public static Boolean jsonObjectToBoolean(Object json){
        String str = jsonObjectToString(json);
        return str == null ? null : Boolean.valueOf(str);
    }
}
