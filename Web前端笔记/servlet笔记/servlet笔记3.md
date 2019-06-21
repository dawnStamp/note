Cookie简介
Cookie是Servlet发送到Web浏览器的少量信息，这些信息由浏览器保存，然后发送回服务器。Cookie一般用来保存会话ID来实现会话跟踪（jsessionid=xxxxxxxxxxxxx）
一个Cookie拥有一个名称、一个值和一些可选属性，比如注释、路径和域限定符、最大生存时间和版本号

// 创建cookie 两个参数，第一个是name，第二个是value
		Cookie cook = new Cookie("pwd","123456");
		// 设置cookie的参数 
		// 秒为单位
		cook.setMaxAge(Integer.MAX_VALUE);
		// 设置路径
		cook.setPath("/");
		// 写回客户端
		response.addCookie(cook);
		// 拿到所有的cookie
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0)
		{
			for (Cookie cookie : cookies)
			{
				System.out.println(cookie.getName() + ":" + cookie.getValue());
			}
		}
		
		
		// 清空Cookie
		Cookie cook1 = new Cookie("pwd","");
		cook1.setPath("/");
		cook1.setMaxAge(0);
		response.addCookie(cook1);


过滤器
创建过滤器，实现Filter接口
public class MyFilter implements Filter
{

	/**
	 * 初始化
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		System.out.println("过滤器被执行了");
		// 拦截所有的请求，没有登录的请求要强制去登录
		HttpServletRequest req  = (HttpServletRequest)request;
		// 如果是第一进来的登录页面，不能拦截  login.jsp   loginServlet
		String url = req.getRequestURL().toString();
		if (url.endsWith("login.jsp") || url.endsWith("loginServlet") || url.endsWith("regUser.jsp"))
		{
			// 放行
			chain.doFilter(request, response);
		}
		else
		{
			Object user = req.getSession().getAttribute("userInfo");
			// 没有登录，要强制登录
			if (user == null)
			{
				((HttpServletResponse)response).sendRedirect(req.getContextPath() + "/login.jsp");
			}
			// 放行
			chain.doFilter(request, response);
		}
		
	}

	/**
	 * 销毁
	 */
	@Override
	public void destroy()
	{
		
		
	}

}

配置过滤器(web.xml)
<!-- 配置过滤器 注册-->
 <filter>
   <filter-name>myFilter</filter-name>
   <filter-class>com.oaec.filter.MyFilter</filter-class>
 </filter>
 
 <!-- 配置过滤路径 -->
 <filter-mapping>
   <filter-name>myFilter</filter-name>
   <url-pattern>/*</url-pattern>
 </filter-mapping>


// 字符编码过滤器
public class EncodingFilter implements Filter
{

	private FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException
	{
		this.filterConfig = filterConfig;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		// 通过初始化配置，拿到配置文件中配置的编码格式
		String encoding = filterConfig.getInitParameter("encoding");
		request.setCharacterEncoding(encoding);
		response.setCharacterEncoding(encoding);
		// 放行
		chain.doFilter(request, response);
	}

	@Override
	public void destroy()
	{
		
	}

}

// 配置过滤器
<!-- 编码过滤器 -->
  <filter>
   <filter-name>encodingFilter</filter-name>
   <filter-class>com.oaec.filter.EncodingFilter</filter-class>
   <!-- 初始化参数 -->
   <init-param>
    <!-- 编码格式 -->
    <param-name>encoding</param-name>
    <param-value>UTF-8</param-value>
   </init-param>
  </filter>
  <!-- 执行过滤器 -->
  <filter-mapping>
   <filter-name>encodingFilter</filter-name>
   <url-pattern>/*</url-pattern>
  </filter-mapping>


// 监听器
public class MyHttpSessionListener implements HttpSessionListener
{

	/**
	 * session创建
	 */
	@Override
	public void sessionCreated(HttpSessionEvent se)
	{
		System.out.println("session创建了....");
		
	}

	/**
	 * session销毁
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent se)
	{
		System.out.println("session销毁了....");
	}

}

// 配置监听器
<listener>
  <listener-class>com.oaec.listener.MyHttpSessionListener</listener-class>
 </listener>


监听器分类：

按监听的对象划分，可以分为
ServletContext对象监听器
HttpSession对象监听器
ServletRequest对象监听器
 
按监听的事件划分
对象自身的创建和销毁的监听器
对象中属性的创建和消除的监听器
session中的某个对象的状态变化的监听器

其他监听器：
HttpSessionAttributeListener ：监听session属性的增加、移除以及属性值改变
ServletContextListener：监听web上下文的初始化（服务器已准备好接收请求）与销毁
ServletContextAttributeListener：监听web上下文属性的增加、删除、属性值变化
ServletRequestListener：监听request的创建与销毁
ServletRequestAttributeListener：监听request的属性的增加、删除、属性值变化



servlet注解：
版本为3.0以上的才可以使用注解
@WebServlet("/cookieServlet")  等于 @WebServlet(value = "/cookieServlet")
有其他属性要配置的，在后面使用“,”隔开
@WebServlet(value = "/cookieServlet",loadOnStartup = 0)

