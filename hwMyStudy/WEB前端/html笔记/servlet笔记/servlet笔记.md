MVC架构：
M：Model 业务逻辑
V：View 视图
C：Controller 控制器（Servlet）

一个web项目里只存在一个web.xml文件
在一个web.xml文件中可以配置多个servlet
<!-- 注册servlet -->
  <servlet>
    <!-- 给servlet取名字 -->
    <servlet-name>myFirstServlet</servlet-name>
    <!-- servlet的类存放的位置 ，包含包名和类名-->
    <servlet-class>com.oaec.servlet.MyFirstServlet</servlet-class>
    <init-param>
     <param-name>username</param-name>
     <param-value>wangqingbo</param-value>
    </init-param>
  </servlet>
  
  <!-- 配置访问路径 -->
  <servlet-mapping>
    <!-- 前面配置好的servlet名字 -->
    <servlet-name>myFirstServlet</servlet-name>
    <!-- 访问路径 ，访问路径名称自己来定义，但是尽量不要使用数字，不要使用中文-->
    <url-pattern>/myFirstServlet</url-pattern>
  </servlet-mapping>


<servlet>
   <servlet-name>sss</servlet-name>
   <servlet-class>sss所在的位置，包含包名和类名</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>sss</servlet-name>
    <url-pattern>/sss</url-pattern>
  </servlet-mapping>

访问路径：
http://localhost:8080/MyServletProject/myFirstServlet
http://localhost:8080 ： 服务器部署路径
MyServletProject ：项目名称
myFirstServlet ： 配置文件中配置的servlet的访问路径

Tomcat目录结构：
bin：存放Tomcat操作的一些文件，主要操作启动和关闭
conf：配置文件，可以手动修改，经常修改server.xml文件，来修改端口号
lib：Tomcat依赖的jar包，不要修改任何文件
logs：Tomcat运行过程中产生的日志文件，以天为单位，可以查看项目的运行情况
temp：Tomcat运行过程中产生的临时文件，可以删除
webapps：项目的部署目录，web项目发布后，是一个.war文件，直接将.war文件放到Tomcat的webapps目录下，
         Tomcat启动后，会加载和解压.war文件，启动项目

work：相当于一个缓存文件，清理Tomcat缓存时，要将次目录清空

Servlet 生命周期：
从创建直到毁灭的整个过程。
Servlet 遵循的过程：
1)Servlet 通过调用 init () 方法进行初始化，在整个Servlet的运行过程中，只执行一次。
  可以在Tomcat启动时初始化，
  <load-on-startup>0</load-on-startup>
  也可以在访问前初始化
2)Servlet 调用 service() 方法来处理客户端的请求，可以执行多次。 
3)Servlet 通过调用 destroy() 方法终止（结束），在整个Servlet的运行过程中，只执行一次。 
最后Servlet 是由 JVM 的垃圾回收器进行垃圾回收的。

servlet的初始化参数：
配置初始化参数
在servlet标签中配置参数：
 <!-- 初始化参数 第一个 -->
    <init-param>
     <!-- 参数名称 -->
     <param-name>username</param-name>
     <!--  参数的值 -->
     <param-value>jxnc</param-value>
    </init-param>
    <!-- 初始化参数 第二个 -->
    <init-param>
      <param-name>pwd</param-name>
      <param-value>123456</param-value>
    </init-param>

// 在servlet取初始化参数：

// 对应配置文件<param-name>username</param-name>中的 username
		String userName = this.getInitParameter("username");
		System.out.println("初始化参数：" + userName);
		// 第二种
		String userName1 = this.getServletConfig().getInitParameter("pwd");
		System.out.println("初始化参数1：" + userName1);
		// 全部参数
		Enumeration<String> params = this.getInitParameterNames();
		// 循环枚举
		while(params.hasMoreElements())
		{
			String paramName = params.nextElement();
			System.out.println("paramName:" + paramName + ":" + this.getInitParameter(paramName));
		}



// 创建新项目的一些目录结构
在WebContent目录下创建公用目录 
css：放公用的样式文件
js：放公用的js文件
img：放公用的图片


request.getContextPath():项目的访问路径


从form中把数据传递到后台时，
<input name="email">
在后台获取时，使用req.getParameter("email");
input的name要和req.getParameter("email")中参数名保持一致

乱码：
Tomcat提交请求时，使用默认编码格式为“ISO-8859-1”,这个编码格式不识别中文
在中文数据传输过程中会出现乱码
解决办法：
1.重新设置编码格式 （适合小范围的修改）
String newSex = new String(sex.getBytes("iso-8859-1"),"utf-8");

2.设置request的编码格式 （适合在过滤器中使用）
req.setCharacterEncoding("UTF-8");
resp.setCharacterEncoding("UTF-8");

3.修改Tomcat的编码格式 （不经常使用，如果Tomcat下部署很多项目，会影响其他项目的）

修改TOMCAT_HOME\conf\server.xml文件，找到访问端口号，添加属性
URIEcoding="UTF-8"

 <Connector port="8080" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" URIEncoding="UTF-8"/>


作业：
使用Servlet完成当当网的登录功能
指定默认用户（账号=zhangsan，密码=123456）
只有此用户能登录，其他用户不能登录
登录成功后，给出登录成功的页面


