# AwTestFrame
一个UI自动化测试关键字驱动框架，采用Excel管理测试数据，支持WEB/Android/iOS，支持多设备并行
## 运行
 将工程打包（pom.xml已提供打包配置）后放到一个文件夹内，例如：AwTestFrame，文件夹目录如下：

目录结构|描述
---|---
devices|存放移动设备参数
lib|引用的jar包
testCase|测试用例存放
testCase/163WebMail|测试用例
testCase/163WebMail/apps|存放被测应用
testCase/163WebMail/picture|存放测试脚本调用的图片
testCase/163WebMail/script|存放被调用的外部脚本
testCase/163WebMail/main.xlsx|测试脚本步骤
testCase/163WebMail/module.xlsx|测试脚本模块
AwTestFrame-2.0.jar|工程打包生成文件
### 图形界面执行（只支持Win系统）
关于图形界面 [点我](https://github.com/xiaoMGitHub/AwTestFrameClient)

下载地址：[传送门](https://pan.baidu.com/s/12s-EhC25uGaStv6s7tB5cQ) 密码: juey

![image](https://github.com/xiaoMGitHub/home/blob/master/picture/AwTestFrame.png)
### 命令行运行（支持Win/OSX/Linux系统）
传入参数|描述|示例
---|---|---
-testcase|需要执行的测试用例|-testcase 163WebMail
-type|测试类型（APP/WAP/WEB）|-type web
-browser|WEB测试指定浏览器|-browser chrome
-thread|开启线程数 | -thread 2
-device|APP/WAP测试指定测试设备 | -device 小米5
-os|测试设备的系统（Android/iOS）|-os Android （默认为android）
-bundleid|iOSApp测试须添加该参数 |-bundleid com.xiaom.test
-norest|不清除缓存不重置应用 |-norest true （默认为false）
-appname|Android测试应用（须将应用放在测试用例文件夹下的apps文件夹内）|-appname 163mail.apk
-packagename|Android应用的包名|-packagename com.netease.mail
-activity|Android应用的Activity|-activity com.netease.mobimail.activity.LaunchActivity
-debug|移动端测试调试模式（True/False）| -debug true（默认为false）

#### 例子：
##### 执行iOS端的wap测试
```
java -jar AwTestFrame-2.0.jar -testcase 163AppMail -type wap -os ios -thread 1
```
##### 执行WEB测试
```
java -jar AwTestFrame-2.0.jar -testcase 163WebMail -type WEB -browser chrome -thread 1
```
### 测试报告
![image](https://github.com/xiaoMGitHub/home/blob/master/picture/AwTestFrame2.png)
# 关键字说明
## 通用关键字
编号|关键字 |描述
---|---|---
1|SetParam|设置参数
2|GetElement|获取控件
3|GetElementText|获取控件文本
4|GetElementSize|获取控件尺寸
5|GetElementSize|获取控件尺寸
6|GetElementPicture|获取控件截图
7|GetElementPictureText|获取控件截图的文本
8|GetElementAttribute|获取控件属性
9|ClickElement|点击控件
10|ClickCoordinate|点击坐标
11|ClickPicture|图片识别点击
12|LongPressElement|长按控件
13|LongPressCoordinate|长按坐标
14|WaitByTime|时间等待
15|WaitByPictureAppear|等待目标图片出现
16|SelectByIndex|下拉框选择（index）
17|SelectByValue|下拉框选择（value）
18|SelectByText|下拉框选择（Text）
19|JavaScript|执行js脚本
20|CheckElementNotNull|检查控件不为空
21|CheckElementIsNull|检查控件为空
22|CheckTextByString|文本校验（String）
23|CheckTextByInt|文本校验（int）
24|CheckTextByDouble|文本校验（double）
25|CheckPictureByOpencv|图片校验（OpenCV模板匹配）
26|CheckPictureByHash|图片校验（Hash算法）
27|DatabaseUpdata|数据库Updata
28|DatabaseQuery|数据库查询
29|Script|调用外部脚本
30|SwitchToWebview|切换到Webview
31|SwitchToNative|切换到Native
32|SwitchToFrame|切换到Frame
32|SwitchToParentFrame|切换到ParentFrame
33|SwitchToDefaultContent|切换到默认Frame
34|ElementSendkeys|控件输入内容
35|Module|调用模块

## 手机端专有关键字
编号|关键字 |描述
---|---|---
1|AdbSendkeys|ADB输入内容
2|SwipeUp|屏幕向上划
3|SwipeDown|屏幕向下滑
4|SwipeLeft|屏幕向左滑
5|SwipeRight|屏幕向右滑
6|RestartApp|重启APP
7|RemoveAPP|删除APP
8|ResetAPP|重置APP
9|InstallAPP|安装APP
10|PressAndroidKeycode|模拟Android键盘输入

## WEB端专有关键字
编号|关键字 |描述
---|---|---
1|DobuleClickElement|鼠标双击控件
2|RightClickElement|鼠标右击控件
3|Open|打开网址
4|WindowMaxSize|窗口最大化
5|WindowSetSize|设置窗口大小
6|SwitchToLastWindow|切换到最后的窗口
7|SwitchToWindow|切换到指定的窗口
8|WindowRefresh|刷新页面
9|WindowBack|页面后退
10|WindowForward|页面前进
11|AcceptAlert|确定Alert弹窗
12|DismissAlert|解散Alert弹窗
13|AlertGetText|获取Alert弹窗内容
14|AlertInputText|向Alert输入内容
