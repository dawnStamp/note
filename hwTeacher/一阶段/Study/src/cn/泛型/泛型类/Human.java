package cn.∑∫–Õ.∑∫–Õ¿‡;

import java.util.Collection;

//extends Shengwu<T>
// implements Demo<T>
public class Human<T extends Object>{

	private String name;
	private T age;
	private T sex;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	public T getSex() {
		return sex;
	}
	public void setSex(T sex) {
		this.sex = sex;
	}
}
