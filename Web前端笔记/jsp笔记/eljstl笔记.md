EL（Expressoin Language）
EL是一种表达式语言（对不同的表达式进行解析并运算）
jsp2.0后作为jsp规范的一部分（早期包含在jstl中）
语法${expr}。如：${user.name} 或${user['name']}
保留字
and、or、not
eq、ne、gt、ge、lt、le
true、false
Instanceof、empty、null
mod、div


==（eq）
!=（ne）
>（gt）
>=（ge）
<（lt）
<=（le）
注意：
在el表达式中，要参与运算的两个变量，一定写在一个{}中
比如 ${4>3}  不能写成${4} > ${3}

${user}:
从四个作用域中去寻找Attribute的名称为"user"的属性
从小到大来搜索，如果找到，就不往大的方向再找，直接返回
如果都没找到，直接返回""

// 从实体对象中取值
直接使用“.”或“[]”来取值，“.”后面或“[]”的里面写对象的属性名
// 从List中取值，直接写List的下标
// map取值，直接通过map的key来取，如果出现不规范的key值
要使用“[]”来取值
// map
   Map<String,Object> map = new HashMap<String,Object>();
   map.put("pwd","123456");
   map.put("uname","nihao");
   map.put("111","123");
   request.setAttribute("map",map);

   Map取值：<br>
${map["111"]}


pageContext
通过pageConext获取ServletContext、Request、Response、Session等对象
格式  ${pageContext.request.requestURL}
获取request中用户请求的值  ${param.name}
获取请求头信息  ${header['Context-Type']}
获取cookie值  ${cookie.cookeName.value}
获取context-param  ${initParam.name}
获取隐式作用域对象中保存的属性
${user.name}  按照pageScope、requestScope、sessionScope、applicationScope的顺序查找
${pageScope.user.name}  只在pageContext中查找


jstl标签库
1、将jstl的jar包放到项目的WEN-INF/lib目录下
2、在jsp页面上，将jstl的标签库引入，使用taglib标签
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
uri:标签库的路径，如果不知道该怎么写，就到jstl的jar包下META-INF\c.tld
文件中找到<uri>http://java.sun.com/jsp/jstl/core</uri>，直接复制过来
prefix：前缀名

<c:out
名称	说明	EL支持	必须	默认值
value	转出的值	是	是	无
escapeXml	是否转义特殊字符和编译html标签	否	否	true
default	默认输出的值	否	否	无
// 重点掌握
<c:if test="testCondition" [var="varName"] [scope="{page|request|session|application}"]>条件成立时的输出内容</c:if>  
<c:if test="${userName ne 'page' }">
  ${userName }
</c:if> 
名称	说明	               EL支持	  必须	    默认值
test	判断条件	        是	    是	       无
var	判断结果存储的变量名	否	    否	       无
scope	变量的存储范围		否	     否	        page

scope:page,request,session,application

// 重点掌握
c:choose、when、otherwise标签（嵌套使用相当于if-elseif-else）
<c:choose>  
    <c:when test="">  
        前面的条件都不成立但此条件成立时输出  
    </c:when>  
    <c:when test="">  
        前面的条件都不成立但此条件成立时输出  
    </c:when>  
    ......  
    <c:otherwise>  
        前面的条件都不成立时才输出  
    </c:otherwise>  
</c:choose> 

<c:choose>
  <c:when test="${num > 70 }">优秀</c:when>
  <c:when test="${num == 70 }">一般</c:when>
  <c:otherwise>太菜了</c:otherwise>
</c:choose>

// 重点掌握
forEach标签（循环遍历）
语法1：遍历集合，类似(String s : new String[]{"a","b"})
<c:forEach items="collection" [var="varName"] [varStatus="varStatusName"] [begin="begin"] [end="end"] [step="step"]>  
    输出内容  
</c:forEach> 

forEach参数说明
名称	 说明			EL支持	必须	默认值
items	遍历的集合对象		是	否	无
var	每次遍历的对象		否	否	无
varStatus 遍历的相关信息	否	否	无
begin	开始的位置（正数）	是	否	0
end	结束的位置（正数）	是	否	集合长度
step	遍历的步长（正数）	是	否	1


forTokens标签（字符串拆分，相当于String的split方法）
<c:forTokens items="str" delims="selStr" [var="varName"]  
[varStatus="varStatusName"] [begin="begin"] [end="end"] [step="step"]>  
输出内容  
</c:forTokens>  

参数说明
名称	说明			EL支持	必须	默认值
items	要被拆分的字符串的	是	是	无
delims	用来拆分的字符串	否	是	无
var	保存每次拆分的字符串	否	否	无
varStatus 第次拆分的相关信息	否	否	无
begin	起始位置		是	否	0
end	终止位置		是	否	被拆分后的长度
step	步长			是	否	1注：var、varStatus、begin、end、step和forEach的参数作用相同

