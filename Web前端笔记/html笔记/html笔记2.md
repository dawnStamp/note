表格使用标签table
表格中的行使用 标签tr
align:左右方向的对齐方式，left：左，right：右，center：中
valign：垂直方向的对齐方式，bottom：底部，top：顶部，middle：中部
列使用标签td
td要嵌套在tr标签中

rowspan：合并行，值是数字
colspan：合并列，值是数字


<frameset rows="20%,*" border="1" >
  <frame src="top.html" />
  <frame src="leftrightframeset.html" />
</frameset>

cols:左右分割，可以使用pixels、%、*定义大小
rows：上下分割，可以使用pixels、%、*定义大小

定义frameset中要加载的页面，使用frame标签
<frame src="top.html" />

iframe中name值很重要，可以和超链接的target对应使用，使超链接的对应页面显示在iframe中
 <iframe name="mainFrame" src="div.html" frameborder="1" height="480px" width="780px" />
