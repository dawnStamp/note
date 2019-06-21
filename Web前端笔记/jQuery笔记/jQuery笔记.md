使用：
引入jQuery框架
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>


一个页面中可以加载多个js文件，格式如下：
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<script type="text/javascript" src="js/js.js"></script>
注意：
在引用js文件的script标签中不要写js代码

$(function(){})：页面加载完成后执行，相当于window的 onload函数

命名规则：
id不要重复
class可以重复
input中的name值不要和函数名重复（重要）

// id选择器  根据给定的ID匹配一个元素。
	var ditu = $("#ditu").text();
	//alert(ditu);
	// class选择器 根据给定的类匹配元素。
	var xinwen = $(".newsclass").text();
	alert(xinwen);

each(callback):以每一个匹配的元素作为上下文来执行一个函数。
callback:对于每个匹配的元素所要执行的函数
// 多个class
	var liClasses = $(".liclass");
	//alert("选择的calss个数：" + liClasses.length);
	
	liClasses.each(function(i, liItem) {
		// liItem是一个js对象
        //alert(i+":"+liItem.innerText);
		// 转换成jQuery对象
		alert(i+":"+$(liItem).text());
    });
	
	liClasses.each(function(i) {
		// 一个参数，对象的下标
        alert(i);
    });
	
	liClasses.each(function() {
		// 当前循环体的对象，是一个jQuery对象
       // alert($(this).text());
    });

// 选择页面元素
	var lis = $("li");
	lis.each(function(index, element) {
        alert(index);
    });
	
	var uls = $("ul");
	alert(uls);

// 在给定的父元素下匹配所有的子元素  父子关系
	// parent > child
	// parent:任何有效选择器
	// child:用以匹配元素的选择器，并且它是第一个选择器的子元素
	var inputs = $("form > input");
	//alert(">:" + inputs.length);
	
	// 在给定的祖先元素下匹配所有的后代元素
	// ancestor 任何有效选择器
	// descendant 用以匹配元素的选择器，并且它是第一个选择器的后代元素
	// 
	var inputkongge = $("form input");
	//alert("空格：" + inputkongge.length);
	
	// prev + next  平行关系 匹配所有紧接在 prev 元素后的 next 元素
	// prev 任何有效选择器
	// next 一个有效选择器并且紧接着第一个选择器
	var inputsjia = $("form + input");
	alert("+:" + inputsjia.length);
	// 匹配 prev 元素之后的所有 siblings 元素
	//prev  任何有效选择器
	// siblings 一个选择器，并且它作为第一个选择器的同辈
	var inputsbolang = $("form ~ input");
	alert("波浪线：" + inputsbolang.length);

// 属性 [attribute]
	//var inputNames = $("input[name]");
	// [attribute=value] 
	// attribute 属性
   // value属性值。引号在大多数情况下是可选的。但在遇到诸如属性值包含"]"时，用以避免冲突
	var inputNames = $("input[name='ss']");
	//alert("包含name属性的input：" + inputNames.length);
	var inputbuttonNames = $("input[type='button']");
	alert(inputbuttonNames.val());



// 在li元素后追加h1
	// 向每个匹配的元素内部追加内容。
	//$("li").append("<h1>你好</h1>");
	
	// appendTo(content)
	// 把所有匹配的元素追加到另一个指定的元素元素集合中。
	//$("ul").appendTo("div[id='templateDiv']");
	
	// wrap(html|element|fn)
	// 把所有匹配的元素用其他元素的结构化标记包裹起来
	//$("input[id='ss3']").wrap("div[id='templateDiv']");
	
	// empty(): 删除匹配的元素集合中所有的子节点。
	//$("ul").empty();
	
	// 从DOM中删除所有匹配的元素。
	//$("ul").remove();
	// 删除id为xinwen 的li
	//$("li").remove("#xinwen");
	
	// 访问匹配元素的样式属性。 添加一个css样式 
	$("li").css("color","red");
	// 访问匹配元素的样式属性。 添加多个css样式
	$("li").css({"color":"red","font-size":"50px"});






