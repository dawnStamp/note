jsp页面修改后，不用重启Tomcat，直接刷新就可以

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
page:
language:脚本语言
contentType：告诉浏览器使用的页面格式和页面编码，能解决页面乱码
pageEncoding：页面编码
autoFlush：自动刷新，默认值是true
errorPage：错误页面路径（自己设置的），如果页面发生错误，页面就跳转到设置的错误页面
isErrorPage:是否为错误页面，默认值为false，如果要将页面设置为错误页面，此值设置为true
import：如果页面引用了别的包的代码，要使用import导入  
<!-- 如果要导入多个包，可以使用“,”隔开，也可以重新写一个导入标签 -->    
<%@ page import="java.util.*" %>
<%@ page import="com.wangqingbo.servlet.MyDate" %>

isThreadSafe：线程安全，默认是true，代表不安全
session：默认为true，会创建session


<%@ include file="header.jsp" %>
静态包含：不检查内容，直接把页面放进来，有可能会产生重复的html标签，
使用时注意，尽量不要写完整的html
在主页面中设置要引用的css，js等，子页面中就不用引用了。

// jsp中的声明:语法和Java代码没有区别，只是要在前面加英文“!”
要使用英文“!”，不推荐使用
<%!
   public String getStringId()
    {
	  System.out.println("sss");
	  return "ss";
    }
%>

// 表达式:在页面上输出Java变量
<%= age %>
注意：
要使用“=”
后面不要使用“;”

// 小脚本
Java代码在jsp页面中使用，语法和Java语法一致
但是要写在<% %> 中间

//例子：
从数据库中取用户列表,
注意：jsp中html标签和Java代码嵌套时，要分离
<table border="1px" cellspacing="0">
  <!-- 表头 -->
  <tr >
   <td>用户id</td>
   <td>用户名</td>
   <td>电子邮件</td>
   <td>所属省份</td>
   <td>所属城市</td>
  </tr>
  <!-- 用户数据列表 -->
  <%
     // 从后台获取用户信息列表
     Object userObj = request.getAttribute("userList");
  // 防止空异常，要做处理   
  if (userObj  != null)
     {
    	 List<UserInfo> userList = (List<UserInfo>)userObj;
    	 // 循环列表
    	 for (UserInfo user : userList)
    	 { %>
    		<tr>
			   <td><%=user.getUserId() %></td>
			   <td><%=user.getUserName() %></td>
			   <td><%=user.getEmail() %></td>
			   <td><%=user.getProvince() %></td>
			   <td><%=user.getCity() %></td>
			  </tr> 
    	<%  
    	 }
     }
  %>
</table>


// jsp内置对象
out ： javax.servlt.jsp.JspWriter:输出
config ： javax.servlet.ServletConfig：配置信息，使用不多
exception ：java.lang.Throwable ：页面异常，要在错误页面中使用，设置页面中isErrorPage="true"
response:javax.servlet.http.HttpServletResponse
page:java.lang.Object:当前页面对象
pageContext:javax.servlet.jsp.PageConext
request:javax.servlet.http.HttpRequest
session:javax.servlet.http.HttpSession
application:javax.servlet.ServletContext

//
隐式(内置)对象的说明
out
继承至java.io.Writer，可以通过page指令指定其缓冲区大小
方法：clear、clearBuffer、close、flush、getBufferSize、getRemaining、isAutoFlush
config
获取jsp初始化数据（在web.xml中使用servlet标签对jsp页面进行配置）
exception
对jsp页面产生的异常进行处理（只有在错误页面中才成使用）
response（和Servlet中使用方式一样）
page
当前jsp转换成Servlet后的示例，很少直接使用

pageContext
提供获取其它隐式对象的方法（getRequest、getOut等）
作用域设为page时，数据保存在pageContext中（setAttribute）
request
使用同Servlet
作用域设为request时，数据保存于request中
session
使用同Servlet
作用域设为session时，数据保存于sessoin中
application
作用域设为application时，数据保存于application中（整个运用共享）



九大内置对象和四大作用域一定要记住

jsp动作：
jsp:include :将子页面转换成servlet再包含进来
<%@ include %>：不用转换

转发：
<jsp:forward page="/index.jsp">
 <jsp:param value="zhangsan" name="username"/>
</jsp:forward>

/xxServlet?username=xxx

JSP解决：Attempt to clear a buffer that&#39;s already been flushed错误（jsp:forward标签跳转空白）
 解决办法，在jsp开头加入缓冲区设置语句
 <%@ page autoFlush="true" buffer="1094kb"%>


<jsp:useBean id="userInfo" class="com.dangdang.entity.UserInfo"></jsp:useBean>
<jsp:setProperty property="userName" name="userInfo" value="lisi"/>
<jsp:getProperty property="userName" name="userInfo"/>

jsp:useBean
id:给bean一个名称，自己来取
class：bean的定义，包含包名和类名

jsp:setProperty
property：bean中的一个属性
name：jsp:useBean中定义的id
value：给property一个值

jsp:getProperty
property：bean中的一个属性
name：jsp:useBean中定义的id


作业：
记住九大内置对象和四大作用域
使用jsp脚本从后台数据库取数据，显示在页面上（使用Java代码和html代码嵌套）
练习jsp动作，jsp:include，
<jsp:useBean id="userInfo" class="com.dangdang.entity.UserInfo"></jsp:useBean>
<jsp:setProperty property="userName" name="userInfo" value="lisi"/>
<jsp:getProperty property="userName" name="userInfo"/>













