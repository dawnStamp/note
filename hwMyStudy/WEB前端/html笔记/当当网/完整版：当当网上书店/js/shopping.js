
$(function($){
    //根据您挑选的商品，当当为您推荐部分的显示和隐藏
    $("#shopping_commend_arrow").click(function(){
        if($("#shopping_commend_sort").css("display")=="none"){
            $(this).attr("src","images/shopping_arrow_up.gif");
        }else{
            $(this).attr("src","images/shopping_arrow_down.gif");
        }
        $("#shopping_commend_sort").toggle();
    });
    //商品隔行变色
    $("#myTableProduct").find("tr:odd").css("backgroundColor","#ffebcd");
    //商品变色
    $("#myTableProduct").find("tr").mouseover(function(){
        $(this).css("backgroundColor","#fff");
    }).mouseout(function(){
        if($("#myTableProduct").find("tr").index($(this))%2==1) {//判断是否奇数行
            $(this).css("backgroundColor","#ffebcd");
        }else{
            $(this).css("backgroundColor","#fefbf2");
        }
    });
    //计算总价
    function totalPrice(){
        var percents= 0,prePrices= 0,prices=0;//积分，原价，现价
        $("#myTableProduct").find("tr").each(function(i,ele){
            var num=$(ele).find(".shopping_product_list_5").find("input").val();//数量
            percents+=parseInt($(ele).find(".shopping_product_list_2").text())*num;
            //解决下js中浮点数的bug问题，因此建议浮点数的运算不要放在前台，这里是指粗略的解决了一下
            var price=parseInt($(ele).find(".shopping_product_list_4").find("label").text().replace(".",""))*num;
            prices+=price;
            var prePrice=parseInt($(ele).find(".shopping_product_list_3").find("label").text().replace(".",""))*num;
            prePrices+=prePrice;
        });
        $("#product_integral").text(percents);
        $("#product_total").text(prices/100);
        $("#product_save").text((prePrices-prices)/100);
        return prices/100;
    }
    totalPrice();
    //删除商品
    $("#myTableProduct").find(".shopping_product_list_6").children("a").click(function(){
        if(confirm("您确定要删除商品么？")){
            $(this).parent().parent().remove();
            totalPrice();
        }
    });
    //修改数量
    $("#myTableProduct").find(".shopping_product_list_5").children("input").change(function(){
        var value=$(this).val();
        if((value == "")||!(/^[0-9]*[1-9][0-9]*$/.test(value))){
            alert("数量不能为空，且只能为正整数");
            $(this).val(1);
        }
        var t =totalPrice();
        alert("修改成功！，您的商品总金额是"+t+"元");
    });
	
	// 购买商品
	$(".shopping_yellow").click(function(){
		// 商品对象的ul
		var ulEle = $(this).parent().parent().children();
		// 商品名称
		var proName = $(ulEle[0]).children("a").text();
		// 市场价
		var marketPrice = $(ulEle[1]).text();
		// 去掉价格前面的"￥"
		var marketPrice1 = marketPrice.substring(1);
		// 当当价
		var ddPriect = $(ulEle[2]).text();
		// 去掉价格前面的"￥"
		var ddPriect1 = ddPriect.substring(1);
		// 商品折扣
		var zhekou = (ddPriect1 / marketPrice1).toFixed(2) * 100;
		// 商品积分
		var jifen = parseInt(parseFloat(ddPriect1) * 10);
		// 构造一个tr，从购物车中克隆一个商品行，clone函数中使用参数true，可以将事件也克隆进来
		var proTrCopy = $("#myTableProduct").find("tr:first").clone(true);
		// 给克隆的数据行重新赋值
		// 商品名称
		proTrCopy.find("td:first").children("a").text(proName);
		// 积分
		proTrCopy.find("td:eq(1)").children("label").text(jifen);
		// 市场价
		proTrCopy.find("td:eq(2)").children("label").text(marketPrice1);
		// 当当价
		proTrCopy.find("td:eq(3)").html("￥<label>" + ddPriect1 + "</label> (" + zhekou + "折)");
		// 将克隆的数据行添加到购物车的第一行来
		$("#myTableProduct").find("tr:first").before(proTrCopy);
		//alert(proTrCopy);
		
		/*
		alert("商品名称：" + proName + "，市场价：" + marketPrice1 + "，当当价：" + ddPriect1 + "，折扣：" + zhekou + "，积分：" + jifen);
		*/
	});
	
    //清空购物车
    $("#removeAllProduct").click(function(){
        //注意清除的先后顺序
        //$("#myTableProduct").next().remove();
        //$("#myTableProduct").remove();
		// 判断购物车中是否有数据，如果没有，就给出提示，不让清空
		var proNum = $("#myTableProduct").find("tr").length;
		if (proNum > 0)
			{
			if(confirm("你确定要清空购物车吗？"))
				{
					// 只删除表格下的tr
				   $("#myTableProduct").find("tr").remove();
				   // 重新计算总价
				   totalPrice();
				}
			}
		else
			{
				alert("购物车中没有商品，不能做清空操作");
			}
		
		/*
        $(".shopping_list_border").append("<div class='empty_product'><div>您还没有挑选商品，<a href='index.html'>去挑选看看>></a></div></div>");
		*/

    });
});