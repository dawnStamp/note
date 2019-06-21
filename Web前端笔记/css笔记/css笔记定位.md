
如果要在页面中给标签使用样式，
尽量使用class或id选择器定义自己的样式

样式嵌套：
两个名字之间使用空格，表示标签的嵌套，如下
/*标签的嵌套使用，span的样式只能作用在div的结构中*/	
div span{
	font-size:20px;
	}
使用：
<div>sss
<span>divSpan</span>
</div>

不加空格：
/* 如果只针对某一种标签做样式，直接在样式前加标签就可以，如下只对div起作用	*/	
div#divcss{
	height:300px;
	width:200px;
	border:1px solid red;
	}
使用：
<div id="divcss">sss

</div>

带“,”表示几个样式是同样的：
.two,.three{
	  font-size:100px;
	}

字体的样式中要记住：
color:颜色
text-align:对齐方式


改变超链接的样式：
/* 未被访问的链接 */
a:link {
	color:red;
	font-size:20px;
	}	
/* 已被访问的链接 */		
a:visited {color:blue;
font-size:30px;
}	
/* 鼠标指针移动到链接上 */
a:hover {color:green;
font-size:40px;}	
/* 正在被点击的链接 */
a:active {color:black;
font-size:50px;}	


当为链接的不同状态设置样式时，请按照以下次序规则：
•a:hover 必须位于 a:link 和 a:visited 之后
•a:active 必须位于 a:hover 之后



padding用于控制content与border之间的距离。,可以同时给四个边设值，
也可以单独给某个边设值,只能是正值
四个值，顺序为 上右下左
如果只写一个值，就是四个边都是一样的
如果写两个值，第一个上下，第二个左右
padding:20px 10px 5px 1px;
padding-left:50px;

margin指的是元素与元素之间的距离,可以同时给四个边设值，
也可以单独给某个边设值，可以为负值
四个值，顺序为 上右下左
如果只写一个值，就是四个边都是一样的
如果写两个值，第一个上下，第二个左右
margin:20px 10px 5px 1px;
margin-left:10px;


float定位是CSS排版中重要的手段。
属性float的值很简单，可以设置为left、right或者默认值none，
当设置了元素向左或向右浮动时，元素会向其父元素的左侧或右侧靠紧

绝对定位：
.pos{
	/* 绝对定位，要给出定位的坐标*/
	position:absolute;
	top:300px;
	left:300px;
	border:1px solid red;
	width:50px;
	height:60px;
	}
	


当将块的position参数设置为relative时，与将其设置为absolute时完全不同，
这时子块是相对于自身在父块的原先位置来进行定位的

z-index属性用于调整定位时重叠块的上下位置，
当块设置了position属性时，该值便可设置各块之间的重叠高低关系。默认值为0