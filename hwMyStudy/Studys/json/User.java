package json;

public class User {

	private String name;
	private String sex;
	private String age;
	private String height;
	
	public User(){
		
	}
	
	public User(String name,String sex,String age,String height){
		this.name=name;
		this.sex= sex;
		this.age=age;
		this.height=height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	
}
