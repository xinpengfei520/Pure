package com.xpf.android.pure.utils;

import android.util.Log;

import com.xpf.android.pure.BuildConfig;


public class LogUtils {

    private static final boolean DEBUG = BuildConfig.DEBUG;

    public static void v(String tag, Object... message) {
        if (DEBUG) {
            Log.v(tag, getLogcat(message));
        }
    }

    public static void d(String tag, Object... message) {
        if (DEBUG) {
            Log.d(tag, getLogcat(message));
        }
    }

    public static void i(String tag, Object... message) {
        if (DEBUG) {
            Log.i(tag, getLogcat(message));
        }
    }

    public static void w(String tag, Object... message) {
        if (DEBUG) {
            Log.w(tag, getLogcat(message));
        }
    }

    public static void e(String tag, Object... message) {
        if (DEBUG) {
            Log.e(tag, getLogcat(message));
        }
    }

    private static String getLogcat(Object... message) {
        StringBuilder sb = new StringBuilder();

        try {
            if (message != null && message.length > 0) {
                for (int i = 0; i < message.length; i++) {
                    sb.append(message[i]);
                    if (i < (message.length - 1)) {
                        sb.append(" ## ");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
