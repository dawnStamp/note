getQueryString():获取所有的请求参数，只用在get请求

 // 拿到所有的参数，是一“name=value”的形式
	    System.out.println("getQueryString:" + req.getQueryString());
	   // 参数的map
	    Map<String, String[]> paramMap = req.getParameterMap();
	    for(String key : paramMap.keySet())
	    {
	    	System.out.println("key:" + key);
	    	System.out.println("value:" + paramMap.get(key)[0]);
	    }
	    // 所有的参数名
	    Enumeration<String> enumParam = req.getParameterNames();
	    if (enumParam != null)
	    {
	    	// 循环参数名
	    	while(enumParam.hasMoreElements())
	    	{
	    		String keyName = enumParam.nextElement();
	    		System.out.println("keyName:" + keyName);
	    		// 根本某个参数名拿到参数值，值是一个数组，如果参数中含有数字或日期等其他不是字符串的格式，
	    		// 必须要做类型转换
	    		String[] values = req.getParameterValues(keyName);
	    		if (values != null && values.length > 0)
	    		{
	    			for (String strValue : values)
	    			{
	    				System.out.println("strValue:" + strValue);
	    			}
	    		}
	    	}
	    }

页面跳转：
// 将前台页面页面数据显示在提交后的页面上
		    PrintWriter out = resp.getWriter();
		    out.println("注册成功，注册信息如下，3秒后自动跳转到主页面...");
		    out.println("email:" + email);
		    out.println("性别:" + sex);
	    	resp.setHeader("refresh", "3;" + req.getContextPath() + "/index.jsp");

-----------------------------------------------
请求参数：格式：访问路径后面加“？参数名=参数值&参数名2=参数值2”
<%=request.getContextPath() %>/pageTurnServlet?turnType=1


// 页面跳转，转发
		// 浏览器的地址不会改变，还能够传递参数
		if (turnType.equals("1"))
		{
			req.getRequestDispatcher("/index.jsp").forward(req, resp);
		}
		// 重定向 相当于重新打开一个页面，参数无法传递，浏览器地址是新页面的地址
		else if (turnType.equals("2"))
		{
			resp.sendRedirect(req.getContextPath() + "/index.jsp");
		}

// 一个很重要的方法，在项目中用的很多，要学会独立使用
// 给一个Attribute，两个参数，第一个是：key，第二个是value
req.setAttribute("turnParam", "1");
// 从Attribute里取值，如果不存在，就返回null，使用时要注意判断null指针异常
request.getAttribute("turnParam");

//返回请求 URI 指示请求上下文的那一部分。请求 URI 中首先出现的总是上下文路径
String request.getContextPath() 

// 获取请求头
		Enumeration<String> headerEnum = req.getHeaderNames();
		if (headerEnum != null)
		{
			while(headerEnum.hasMoreElements())
			{
				// header名称
				String headerName = headerEnum.nextElement();
				System.out.print("headerName:" + headerName);
				// header值
				System.out.println(":"+req.getHeader(headerName));
			}
		}


// 返回适用于文本数据的响应流 （重点） 
PrintWriter getWriter()


HttpSession是java web对用户进行会话跟踪的一个接口
HttpSession由Servlet容器的提供者实现
HttpSession通过HttpServletRequst的getSession()或getSession(boolean)方法获取

作业：
实现登录功能，从数据库取值验证
将用户信息放到session中
实现一个注销功能

