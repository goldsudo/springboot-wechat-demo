## 项目介绍
这个项目是学习了慕课网教程[《SpringBoot+MyBatis搭建迷你小程序》](https://www.imooc.com/learn/945)后的实践。<br>
之前一直没用过springboot，只是大概知道是一套完整的开发体系，不仅仅是spring全家桶，甚至还包括了server，开发完成后打成jar包直接在服务器上运行就可以上线。<br>
于是就想着借着这门课程尝试一下springboot的开发流程，而且正好我也对微信小程序挺感兴趣，也借这次机会试试手。
## 项目环境搭建
本项目依赖于mysql，因此需要先在本地安装mysql的server。
### 服务端
1. clone或者直接下载项目代码到本地
2. 在数据库创建名为wechatpro的数据库
3. 找到sql文件：本项目目录/src/main/resources/sql/schema.sql，在数据库的shell中执行其中的建表语句以及数据初始化语句
4. 使用IDE（建议使用idea）以maven项目的方式导入该项目
5. 找到springboot的配置文件：本项目目录/src/main/resources/application.properties，将其中的jdbc相关的属性改为你本地的配置
6. 运行 本项目目录/src/main/java/com/goldsudo/WechatProDemoApplication.java 文件
7. 访问127.0.0.1:8088/superadmin/area 如果返回如下json数组则代表服务端环境搭建成功：

![image](https://github.com/goldsudo/springboot-wechat-demo/blob/master/SNAP-SHOT/api.png)

### 微信小程序
至此服务端已经搭建完毕，接下来需要进行微信小程序的环境搭建
1. 下载并安装最新版本微信开发者工具：https://developers.weixin.qq.com/miniprogram/dev/devtools/devtools.html
2. 打开开发者工具：（没登陆的话需要使用微信进行扫码登陆）

![image](https://github.com/goldsudo/springboot-wechat-demo/blob/master/SNAP-SHOT/wechat-tool.png)

3. 点击小程序项目，创建一个新的小程序：（项目目录选一个空目录即可，appID选小程序测试号，项目名称填写area-manager，也可以改成其他名称）

![image](https://github.com/goldsudo/springboot-wechat-demo/blob/master/SNAP-SHOT/wechat-project.png)

4. 将 本项目目录/area-manager 目录下的所有内容（除了project.config.json）外全部复制到上一步中创建小程序项目的目录中去，覆盖所有相同文件：

![image](https://github.com/goldsudo/springboot-wechat-demo/blob/master/SNAP-SHOT/res.png)

5. 进入微信小程序项目，看到如下界面则代表小程序已经成功启动：

![image](https://github.com/goldsudo/springboot-wechat-demo/blob/master/SNAP-SHOT/result.png)
