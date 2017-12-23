[![](https://jitpack.io/v/liqinew/baselogger.svg)](https://jitpack.io/#liqinew/baselogger)
[![](https://img.shields.io/badge/%E4%BD%9C%E8%80%85-%E6%9D%8E%E5%A5%87-orange.svg)](https://github.com/LiqiNew)
# BaseLogger
Android中BaseLog工具
#### Gradle远程依赖
**1：在项目根目录build.gradley**	<br>

```gradle
allprojects {
　　repositories {
  　　//依赖仓库
　　　maven { url 'https://jitpack.io' }
　　}
}
```

**2：依赖HandlerFrame框架**<br>

```gradle
compile 'com.github.liqinew:baselogger:V.1.0.0'
```
### 代码使用方法
```java 
/**
* 设置调试Log是否显示和显示级别
*<p>
*建议放到Application中去设置。
*<p>
*如果没有设置，默认是全部显示。
*</p>
* @param loggerState Log级别
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
