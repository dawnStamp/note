package 封装;

public class Demo {
	//第二题
	/*private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<22){
			this.age = 22;
		}else{
			this.age = age;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/
	
	
	private int age;
	private int money;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(10<=age&&age<20){
			if(money>=3000){
				this.money = money;
			}else{
				this.money = 3000;
			}			
		}
		else if(20<=age&&age<30){
			if(money>=5000){
				this.money = money;
			}else{
				this.money = 5000;
			}
		}	
		
		else if(30<=age&&age<50){
			if(money>=8000){
				this.money = money;
			}else{
				this.money = 8000;
			}
		}
		else{
			this.money = money;
		}
	
	}
}
