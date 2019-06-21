使用内联样式(行内样式)
直接在标签上写样式，要使用style属性

使用内部样式(内嵌样式)
直接写在html页面上
在html页面上写样式时，最好把样式写在head标签中
样式一定要写在style标签中
<style type="text/css">
 span{
	 font-size:60px;
	 }
</style>

/**/ 注释样式

外部文件引入样式
<link rel="stylesheet" type="text/css" href="css/css.css" />

外部文件导入，要写在style标签内
@import url(css/css.css);


优先级顺序：内联>内部>import>link
一般情况下，正式项目中，样式要写在css文件中
如果有特殊的样式，并且这样个样式只会用在一个地方，使用某个标签的style属性来定义样式



提示：虽然各种CSS样式加入页面的方式有先后的优先级，但在设计网站的时候，
最好只使用其1-2种，这样既有利于后期的维护和管理，
也不会出现各种样式的“撞车”的情况，便于设计者理顺设计的整体思路。

定义css的格式：
Selector{
    property:value1;
    property:value2;
}

Selector(选择器):选择器决定该样式定义对哪些元素起作用
{property:value1;property:value2}
(属性定义):属性定义部分决定这些样式起怎样的作用（字体、颜色、布局等）

/* 定义类选择器，要使用.name的格式*/	 
.one{
	font-size:50px;
	
	}
	
调用类选择器的样式时，使用class="one two"
class中可以加载多个类选择器，中间使用空格隔开，
后面加载的样式会覆盖前面的样式

id选择器，定义是使用#name的格式
#divcss{
	height:300px;
	width:200px;
	border:1px solid red;
	}

如果只针对某一种标签做样式，直接在样式前加标签就可以，如下只对div起作用	
div#divcss{
	height:300px;
	width:200px;
	border:1px solid red;
	}

样式的嵌套定义，如果多个标签使用同样的样式，可以在一起定义，中间用“,”隔开
类选择器和id选择器嵌套也是这样定义
span,p{
	 font-size:60px;
	 color:green;
	 font-style:italic;
	 text-decoration:underline;
	 }

标签的嵌套使用，span的样式只能作用在div的结构中
div span{
	font-size:20px;
	}

