
后退：back 后退到上一个浏览的页面，如果该页面是第一个打开的，则无效果

function goBackWin()
{
  window.history.back();
}

// 前进 前进到下一个浏览页面，如果该页面是第一个打开的，则无效果

function goForward()
  {
  window.history.forward()
  }

// go 该方法可指定前进或后退多少个页面，正前进，负后退。

function goTest()
{
  window.history.go(-1);
}


// 实现页面跳转 location对象(重要)
// 可以自己去练习location对象的其他属性
function locationHref()
{
  // 文档所在地址的URL地址
  window.location.href="js.html";	
}

document.write("可用宽度：" + screen.availWidth);
// 浏览器的一些信息
document.write("appName:" + window.navigator.appName + ",version:" + window.navigator.appVersion);


// 根据id取得一个元素
var ditu = document.getElementById("ditu");

parentNode：返回当前节点的父节点
previousSibling：返回当前节点的前一个兄弟节点。
nextSibling:返回当前节点的后一个兄弟节点
childNodes:返回当前节点的所有子节点
firstChild:返回当前节点的第一个子节点
lastChild:返回当前节点的最后一个子节点
getElementsByTagName(tagName):返回当前节点的具有指定标签名的所有元素节点
参数：html中的标签
例子：
var allLi = document.getElementsByTagName("li");

form中取值
function tijiao()
 {
	 // 首先拿到form的名称，跟form中name属性一致
	 // 使用form的名称下的input的name属性拿到用户名
    var username = myForm.username.value;
	// 判断用户名不能为空
	if (username == null || username == "" || username.length==0)
	{
		alert("用户名不能为空！");
		// 让焦点停留在用户名的输入框
		myForm.username.focus();
		return;
		}
	// 密码
	var pwd = myForm.pwd.value;
	// 判断密码不能为空
	if (pwd == null || pwd == "" || pwd.length==0)
	{
		alert("密码不能为空！");
		// 让焦点停留在用户名的输入框
		myForm.pwd.focus();
		return;
		}
	alert(username + "," + pwd);
	// 给form的action赋值
	myForm.action="jsDom.html";
	// 提交form
	myForm.submit();
}

<form name="myForm" action="#">
 用户名：<input name="username" type="text" /><br>
 密码：<input name="pwd" type="password" /><br>
 <input type="button"  value="提交" onClick="tijiao()"/>
</form>

鼠标事件：
onclick:单击鼠标左键触发(常用)
ondbclick:双击鼠标左键触发(常用)
onmousedown:单击任意一个鼠标按键时触发
onmouseout:鼠标指针移出一个元素边界时触发
onmousemove:鼠标在某个元素上移动时持续触发
onmouseup:松开鼠标任意一个按键时触发
onmouseover:鼠标指针移到一个元素上时触发

键盘事件：
onkeydown:按下键盘上某个按键时触发，一直按会持续触发
onkeyup:释放某个按键时触发
onkeypress:按下某个按键并产生字符时触发，忽略shift等功能键

html事件：
onload：页面完全加载后在window对象上触发
onunload:页面完全卸载后在window对象上触发
onselect:选择了文本框的一个或多个字符时触发
onchange:文本框失去焦点时，并且在它获取焦点后内容发生过改变时触发(常用)
onsubmit:单击“提交”按钮时在表单form上触发
onfocus:任何元素或窗口获得焦点时触发(常用)
onblur:任何元素或窗口失去焦点时触发(常用)




























