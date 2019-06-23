package cn.io流.打印输出流;

public class Abc {

	private String firstName;
	private String lastName;
	
	public Abc(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Abc [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
