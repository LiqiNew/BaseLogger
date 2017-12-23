package com.liqi;

/**Log状态枚举
 * Created by LiQi on 2017/12/23.
 */

public enum LoggerState {
    /**
     * 全部显示
     */
    LEVEL_ALL_SHOW(0),
    /**
     * 除了I级别的全部都显示，
     */
    LEVEL_I_SHOW(1),
    /**
     * 除了I级,V级别的全部都显示
     */
    LEVEL_V_SHOW(2),
    /**
     * 除了I级,V级,D级别的全部都显示，
     */
    LEVEL_D_SHOW(3),
    /**
     * 除了IVDE级别的全部都显示
     */
    LEVEL_E_SHOW(4),
    /**
     * 关闭log显示
     */
    LEVEL_NO_SHOW(5);
    private int mLogState;

    LoggerState(int logState) {
        mLogState = logState;
    }

    public int value() {
        return mLogState;
    }
}
