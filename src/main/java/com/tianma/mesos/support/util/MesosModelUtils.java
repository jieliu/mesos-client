package com.tianma.mesos.support.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by jie on 16-11-18.
 * 驼峰格式转换为下划线格式
 */
public class MesosModelUtils {
    public static final Gson GSON = new GsonBuilder().disableHtmlEscaping().create();

    public static String toString(Object o) {
        return GSON.toJson(o);
    }
}
