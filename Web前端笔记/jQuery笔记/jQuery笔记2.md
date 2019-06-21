
// attr(name|properties|key,value|fn)
// 设置或返回被选元素的属性值。
// 两种语法，添加单个属性
//$("input").attr("type","button");
//$("input").attr("value","提交");
// 添加多个属性
$("input").attr({"value":"提交","type":"button"});

// 给style追加样式
	$("input").css({"font-size":"50px","background-color":"green"});
	// 重新给style赋值
	$("input").attr({"value":"提交","type":"button","style":"background-color:red;"});
	$("input").addClass("inputCss");


//toggleClass(class|fn[,sw])
// 如果存在（不存在）就删除（添加）一个类。
$("input").toggleClass("inputCss");

// 取得第一个匹配元素的html内容。这个函数不能用于XML文档。但可以用于XHTML文档
	// 用于设定HTML内容的值
	$("div").html("<input type='button' value='我是被添加进来的按钮'>");

// text([val|fn])
	// val用于设置元素内容的文本
	//  不加参数就是取值，加了参数就是设置值
	alert($("span").text());
	$("span").text("spanValue");

//val([val|fn|arr])
//获得匹配元素的当前值。
$("input").val();
$("input").val("hello world!");

// next([expr])
	// 取得一个包含匹配的元素集合中每一个元素紧邻的后面同辈元素的元素集合
	alert($("div").next().text());


// 克隆一个元素 克隆匹配的DOM元素并且选中这些克隆的副本。
//一个布尔值（true 或者 false）指示事件处理函数是否会被复制。V1.5以上版本默认值是：false
// boolean 值只对处理事件起作用，其他的东西全部给
$("span:last").clone().appendTo("div");


 // 给绑定事件调用已经定义好的函数时，不要写()，直接写函数名
 $("input[type='button']").bind("click",btnClick);

// 推荐使用on
$("input:last").on("click",function(){
		// $("input:first").toggle("slow");
		$("input:first").hide();
		});
