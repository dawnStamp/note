
使用<script.../>标签来包含JavaScript代码
第一个javaScript程序
<script type="text/javascript" language="javascript">
alert("sss");
</script>

函数：弹窗
alert();

<a onClick="alert('sss')">点击</a>

外部文件引用：
<script type="text/javascript" src="js.js"></script>

定义变量，可以定义重复的变量（不建议定义重复变量）
<script type="text/javascript" language="javascript">
	 // 变量赋值，不用提前声明，直接使用
	 tempStr = "ss";
	 // 先声明再使用，声明时使用关键字 var
	 var tempNumber = 10;
	 // 同时定义两个变量
	 var tempNumber = 15,tempNumber2;
	 tempNumber2 = 20;
	alert(tempNumber+","+tempNumber2);
</script>

变量的名称需要遵循以下规则
首字母必须是字母(大小写均可)、下划线(_)、或者美元符号($)
余下的字母可以是下划线、美元符号、任意字母或者是数字字符
变量名不能使关键字



在页面上打印内容：
document.write("123");

NaN:不是数字

parseInt:
转换int数字，"123" : 123
如果是数字和字母结合，并且以数字开头，就返回数字 "123sdf":123
如果以字母开头，就返回NaN "sdfs":NaN
如果是小数，直接截取小数点前的数字 "12.3":12   , "12.8": 12

字符串操作：
// 长度
document.writeln("<br> tempStr的长度："+tempStr.length);

indexOf() 方法可返回某个指定的字符串值在字符串中首次出现的位置。
两个参数
searchvalue 必需。规定需检索的字符串值，区分大小写
fromindex 可选的整数参数。规定在字符串中开始检索的位置。
它的合法取值是 0 到 stringObject.length - 1。如省略该参数，则将从字符串的首字符开始检索。 

substr() 方法可在字符串中抽取从 start 下标开始的指定数目的字符。
start 必需。要抽取的子串的起始下标。必须是数值。如果是负数，那么该参数声明从字符串的尾部开始算起的位置。也就是说，-1 指字符串中最后一个字符，-2 指倒数第二个字符，以此类推。 
length 可选。子串中的字符数。必须是数值。如果省略了该参数，那么返回从 stringObject 的开始位置到结尾的字串。 


substring() 方法用于提取字符串中介于两个指定下标之间的字符。
start 必需。一个非负的整数，规定要提取的子串的第一个字符在 stringObject 中的位置。 
stop 
可选。一个非负的整数，比要提取的子串的最后一个字符在 stringObject 中的位置多 1。

如果省略该参数，那么返回的子串会一直到字符串的结尾。
 

JavaScript数组特点：
数组长度可变。总长度等于数组的最大索引值+1
同一数组中的元素类型可以互不相同
当访问未赋值的数组元素时，该元素值为undefined，不会数组越界
// 数组定义1
var arr1 = [12,34];
arr1[7] = 20;
arr1[6] = "ss";
document.writeln("<br> arr1："+arr1[5]);
document.writeln("<br> arr1长度："+arr1.length);
// 数组定义2
var arr2 = [];
arr2[0] = arr1;
arr2[1] = "abcd";
document.writeln("<br> arr2："+arr2[0]);
// 数组定义3
var arr3 = new Array();
arr3[0] = 0;
document.writeln("<br> arr3："+arr3[0]);



  if(条件){
    要执行的语句块;
  }else if(条件){
     要执行的语句块;
  }else{
      要执行的语句块;
  }

注意：不要忘记break
switch(表达式){
   case 值1：执行的语句块;break;
   case 值2：执行的语句块;break;
   case 值3：执行的语句块;break;
   …
   default:执行的语句块；
 }


   while(循环条件){
    循环体语句块;
  }

do{
     循环体语句块;
  }while(循环条件);

while先判断后执行、循环体语句可能一次都不执行,
do while是先执行后判断，所以循环体语句至少执行一次。

for(表达式1;表达式2;表达式3){
     循环体语句;
   }
// 判断数据类型
if (arr2[0] instanceof Array)
		{
			alert("shuzu");
			
			}

for(i=0;i<arr2.length;i++)
{
	if (i==0)
	{
		var tempArr = arr2[0];
		
		for (j=0;j<tempArr.length;j++)
		{
			document.writeln("<br> 循环arr20："+tempArr[j]);
			}
		}
	document.writeln("<br> 循环arr2："+arr2[i]);
}


增强for循环
1、遍历数组中的所有数组元素的索引。
2、遍历JavaScript对象的所有属性。
   
   for(变量 in 对象){
     执行的语句块;
   }

js里面的注释：
使用“//”和使用“ /**/   ”


函数
function 函数名(参数列表)
 {
}

匿名函数
function(参数列表)
{
   函数体
}
匿名函数例子：
var f = function(name)
{
	alert("匿名函数" + name);
}
f("nihao");

// 第三种定义
new Function(参数列表,函数体);
例子：
var f3 = new Function('name',"alert('f3' + name)");
f3("nihao");

注意：
函数名不能使用关键字，命名规则和变量命名规则一致

浏览器对象bom
confirm() 方法用于显示一个带有指定消息和 OK 及取消按钮的对话框。
if (confirm("你确定要删除吗？"))
	{
		alert("删除成功！");
	}
	else
	{
		alert("你取消了删除操作！");
	}


  var name=prompt("Please enter your name","")
  if (name!=null && name!="")
    {
    document.write("Hello " + name + "!")
    }

使用这两个函数时，一定要保证窗口变量在同一个页面中
moveBy(500,500);
moveTo(100,100);







