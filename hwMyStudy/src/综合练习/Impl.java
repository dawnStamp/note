package �ۺ���ϰ;

public class Impl {

	public String find(int num){
		Dao d = new Dao();
		int res = d.findByArray(num);
		
		if(res==-1){
			return "�Բ��������ҵ����ֲ�����";
		}else{
			return "��Ҫ���ҵ������ڵ�"+res+"��λ��";
		}
		
	}
}
