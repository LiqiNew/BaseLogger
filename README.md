# BaseLogger
Android中BaseLog工具
### 使用方法
```java 
/**
* 设置调试Log是否显示和显示级别
*<p>
*建议放到Application中去设置
*</>
* @param loggerState
*/
Logger.setDebugLog(LoggerState loggerState);
/**
*Log.i级别展示
*@param tag log展示的log
*@param content log打印的内容
*/
Logger.i(String tag, String content);
/**
*Log.v级别展示
*@param tag log展示的log
*@param content log打印的内容
*/
Logger.v(String tag, String content);
/**
*Log.d级别展示
*@param tag log展示的log
*@param content log打印的内容
*/
Logger.d(String tag, String content);
/**
*Log.e级别展示
*@param tag log展示的log
*@param content log打印的内容
*/
Logger.e(String tag, String content);
/**
*Log.w级别展示
*@param tag log展示的log
*@param content log打印的内容
*/
Logger.w(String tag, String content);
```
### Log显示状态LoggerState对象对应的状态码
```java
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
```
