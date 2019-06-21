html:标记语言必须以html开始，并且要有结束，结束使用</html>
在一个html页面中，所有的内容必须在<html></html>里面
<html>
</html>

正文内容要写在body标签中
<body></body>

注意：在整个的html标记语言中，标签是不区分大小写的，可以随便写
<BoDy></bOdy>
<BODY></BODY>
但是为了代码的美观和可读，编写时尽量统一大小写格式

文档格式：
html4的标准
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

html5的标准：
<!doctype html>


head标签
写一些标题，加载js和css样式，设置页面的特殊属性
<head>
<title>这是我的第一个html页面</title>
</head>

设置页面标题，写在head标签中
<title>这是我的第一个html页面</title>

h标签一共有6级，从h1到h6，字体显示从大到小

p标签，是一个块级标签，段落完成后会换行

<br /> 换行
<hr /> 分割线

有序列表：
<ol start="30">
 <li>填写信息</li>
 <li>接收电子邮件</li>
 <li>注册成功</li>
</ol>

嵌套非常重要，要灵活应用
无序列表：
<ul>
  <li>学生</li>
  <li>老师</li>
</ul>

<h4>一个嵌套列表：</h4>
<ul>
  <li>咖啡</li>
  <li>茶
    <ul>
    <li>红茶</li>
    <li>绿茶</li>
    </ul>
  </li>
  <li>牛奶</li>
</ul>

div块级元素，用于布局，非常重要

span:行级元素，不会换行
<span>span2</span>


<a href=“链接地址” target=“目标窗口”> 链接文本或图片</a>

a标签的target属性：
指定框架集中的哪个框架来装载另一个资源，
该属性可以是_self、_blank、_top、_parent四个值，
分别代表使用自身、新窗口、顶层框架、父框架来装载新资源

超链接：<br>
href:<br>
1.要链接的页面和本页面在同一级目录，就直接写页面名称<br>
<a href="html常用标签.html" target="_blank">html常用标签</a><br>
2.要链接的页面在本页面的下一级目录，要添加目录名称<br>
<a href="childPage/下一级目录.html" target="_blank">下一级目录</a><br>
3.要链接的页面在本页面的上一级目录，要使用绝对路径（不推荐）或使用“../”返回上一级目录（推荐），要往上返回多级目录的话，就要使用多级../,比如"../../../"<br>
<a href="../parent/上一级目录.html" target="_blank">上一级目录</a><br>
4.外部链接，要使用域名，比如“http://www.sina.com.cn”<br>
<a href="http://www.sina.com.cn" target="_blank">新浪网</a>

图片标签：显示图片用
<img  src= "图片地址"  alt="提示文字" />
src：图片存放的路径，可以是绝对路径，也可以是相对路径，建议使用相对路径
在相对路径中，使用“../”返回本页面所在的上一级
<img src="img/a.png" title="我的图片" height="200px" width="200px"/>
空格：&nbsp;
> :&gt;
< :&lt; 
版权号：&copy;

form表单：
输入类型：text
<input type="text"> 定义供文本输入的单行输入字段
size:控制输入框的宽度，不限制输入的内容
maxLength:控制输入的最大长度，超过以后，就不能输入
<form>
 First name:<br>
<input type="text" name="firstname">
<br>
 Last name:<br>
<input type="text" name="lastname">
</form> 


输入类型：password
<input type="password"> 定义密码字段
<form>
 User name:<br>
<input type="text" name="username">
<br>
 User password:<br>
<input type="password" name="psw">
</form> 



输入类型：submit
<input type="submit"> 定义提交表单数据至表单处理程序的按钮。
表单处理程序（form-handler）通常是包含处理输入数据的脚本的服务器页面。
在表单的 action 属性中规定表单处理程序（form-handler）
<form action="action_page.php">
First name:<br>
<input type="text" name="firstname" value="Mickey">
<br>
Last name:<br>
<input type="text" name="lastname" value="Mouse">
<br><br>
<input type="submit">
</form> 


Input Type: radio
一组单选选项中，name要一样
<input type="radio"> 定义单选按钮。
<form>
<input type="radio" name="sex" value="male" checked>Male
<br>
<input type="radio" name="sex" value="female">Female
</form> 



Input Type: checkbox
<input type="checkbox"> 定义复选框
<form>
<input type="checkbox" name="vehicle" value="Bike">I have a bike
<br>
<input type="checkbox" name="vehicle" value="Car">I have a car 
</form> 

Input Type: button
<input type="button> 定义按钮。
<input type="button" onclick="alert('Hello World!')" value="Click Me!">

多行文本框语法
<textarea  name=“…"  cols="列宽"  rows="行宽"> 
    文本内容 
</textarea>
cols：指定文本框的宽度，该属性必填
rows：指定文本框的高度，该属性必填
readonly：指定该文本框只读。该属性值只能是readonly或省略

下拉选：
selected：默认选中
value：被选中的值
毕业学校：<select name="school">
	    <option value="blank">请选择毕业学校</option>
		<option value="beijing">北京大学</option>
		<option value="qinghua">清华大学</option>
		<option value="nanchang">南昌大学</option>
	</select><br>
	出生城市：<select>
		<optgroup label="一线城市">
			<option>北京</option>
			<option>上海</option>
			<option>广州</option>
		</optgroup>
		<optgroup label="二线城市">
			<option>武汉</option>
			<option>杭州</option>
			<option>苏州</option>
		</optgroup>
		<optgroup label="三线城市">
			<option selected>南昌</option>
			<option>九江</option>
			<option>徐州</option>
		</optgroup>
	</select>

HTML5 输入类型
HTML5 增加了多个新的输入类型：
•color
•date
•datetime
•datetime-local
•email
•month
•number
•range
•search
•tel
•time
•url
•week
注释：老式 web 浏览器不支持的输入类型，会被视为输入类型 text。
