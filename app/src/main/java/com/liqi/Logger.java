package com.liqi;

import android.util.Log;

/**
 * App Debug Log管理工具类
 */
public class Logger {

    private static final int LEVEL_I = 1;
    private static final int LEVEL_V = 2;
    private static final int LEVEL_D = 3;
    private static final int LEVEL_E = 4;
    private static final int LEVEL_W = 5;
    private static int mLevel = 0;

    /**
     * 设置调试Log是否显示和显示级别
     *
     * @param debugTag 0全部显示，1是处了I级别的全部都显示，
     *                 2是处了IV级别的全部都显示，3是处了IVD级别的全部都显示，
     *                 4是处了IVDE级别的全部都显示，5以上就是全部不显示
     */
    public static void setDebugLog(int debugTag) {
        mLevel = debugTag;
    }

    public static void i(String TAG, String content) {
        if (LEVEL_I > mLevel) {
            Log.i(TAG, content == null ? "" : content);
        }
    }

    public static void v(String TAG, String content) {
        if (LEVEL_V > mLevel) {
            Log.v(TAG, content == null ? "" : content);
        }
    }

    public static void d(String TAG, String content) {
        if (LEVEL_D > mLevel) {
            Log.d(TAG, content == null ? "" : content);
        }
    }

    public static void e(String TAG, String content) {
        if (LEVEL_E > mLevel) {
            Log.e(TAG, content == null ? "" : content);
        }
    }

    public static void w(String TAG, String content) {
        if (LEVEL_W > mLevel) {
            Log.w(TAG, content == null ? "" : content);
        }
    }

}
