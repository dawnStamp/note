在Eclipse中配置svn插件

Help-->Install New SoftWare...
String name=new String(request.getParameter("name").getBytes("ISO-8859-1"),"utf-8"); //获取用户填写的用户名

javaweb项目的目录结构：

Java Resources
  src : java代码

build:Java代码编译后存放的目录
WebContent:放html，jsp，js，css等代码
  META-INF/MANIFEST.MF : 存放版本号信息
  WEB-INF/lib：放jar包
  WEB-INF/web.xml:web项目的配置信息

public class MyFirstServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		System.out.println("我请求了get方法");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		doGet(req,resp);
	}

  
}

<!-- 注册servlet -->
  <servlet>
    <!-- 给servlet取名字 -->
    <servlet-name>myFirstServlet</servlet-name>
    <!-- servlet的类存放的位置 ，包含包名和类名-->
    <servlet-class>com.oaec.servlet.MyFirstServlet</servlet-class>
  </servlet>
  
  <!-- 配置访问路径 -->
  <servlet-mapping>
    <!-- 前面配置好的servlet名字 -->
    <servlet-name>myFirstServlet</servlet-name>
    <!-- 访问路径 ，访问路径名称自己来定义，但是尽量不要使用数字，不要使用中文-->
    <url-pattern>/myFirstServlet</url-pattern>
  </servlet-mapping>



