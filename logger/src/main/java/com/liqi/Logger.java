package com.liqi;

import android.util.Log;

/**
 * App Debug Log管理工具类
 */
public class Logger {


    private static int mLevel;

    /**
     * 设置调试Log是否显示和显示级别
     *
     * @param loggerState
     */
    public static void setLogLevel(LoggerState loggerState) {
        mLevel = loggerState.value();
    }

    public static void i(String tag, String content) {
        if (LoggerState.LEVEL_I_SHOW.value() > mLevel) {
            Log.i(tag, content == null ? "" : content);
        }
    }

    public static void v(String tag, String content) {
        if (LoggerState.LEVEL_V_SHOW.value() > mLevel) {
            Log.v(tag, content == null ? "" : content);
        }
    }

    public static void d(String tag, String content) {
        if (LoggerState.LEVEL_D_SHOW.value() > mLevel) {
            Log.d(tag, content == null ? "" : content);
        }
    }

    public static void e(String tag, String content) {
        if (LoggerState.LEVEL_E_SHOW.value() > mLevel) {
            Log.e(tag, content == null ? "" : content);
        }
    }

    public static void w(String tag, String content) {
        if (LoggerState.LEVEL_NO_SHOW.value() > mLevel) {
            Log.w(tag, content == null ? "" : content);
        }
    }

}
