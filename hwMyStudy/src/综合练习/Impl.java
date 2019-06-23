package 综合练习;

public class Impl {

	public String find(int num){
		Dao d = new Dao();
		int res = d.findByArray(num);
		
		if(res==-1){
			return "对不起，您查找的数字不存在";
		}else{
			return "您要查找的数字在第"+res+"个位置";
		}
		
	}
}
