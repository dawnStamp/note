package �ۺ���ϰ;

public class Dao {

	/**
	 * numΪ�û����������
	 * 
	 * @param num
	 */
	public int findByArray(int num){
		int[] arr = {1,3,5,7,9};
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num){
				return i+1;
			}
		}
		return -1;
	}
}
