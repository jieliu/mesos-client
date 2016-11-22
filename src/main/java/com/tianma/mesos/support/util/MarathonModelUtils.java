package com.tianma.mesos.support.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MarathonModelUtils {
	public static final Gson GSON = new GsonBuilder().setPrettyPrinting()
			.disableHtmlEscaping().create();

	public static String toString(Object o) {
		return GSON.toJson(o);
	}
}
