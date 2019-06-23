package cn.封装.练习1;

/**
 * 面向过程OPP
 * 面向对象(OOP)的三大特性：
 * 		1.封装
 * 		2.继承
 * 		3.多态
 * 
 * 封装
 * 		1.将东西装在一起，然后以新的完整形式呈现出来
 * 		2.信息隐藏，隐藏对象的实现细节，不让外部直接访问到
 * 				将方法和字段一起包装到一个单元中，单元以类的形式出现
 * 		3.定义类、定义其属性、方法的过程称为封装类
 * 
 * 信息隐藏是OOP最重要的功能之一，也是使用访问修饰符的原因	
 * 信息隐藏的原因包括：
 * 		1.对模块的任何实现细节所作的更改不会影响使用该模块的代码		
 * 		2.防止用户意外修改数据
 * 		3.使用模块易于使用和维护
 * 
 * 访问修饰符：
 * 		1.private
 * 		2.protected
 * 		3.默认
 * 		4.public
 * 
 * 包的作用：
 * 		1.将java文件分门别类的放好，方便后期查找以及管理
 * 		2.
 * 
 * 类、方法、全局变量
 * 
 * 类只能用public和默认
 * 
 * 字段封装的实现：
 * 		1.修改字段的可见性来限制对字段的访问
 * 		2.为每个字段创建一对赋值(setter)方法和取值(getter)方法，用于公开对这些字段的访问接口
 * 		3.除非必须公开底层实现细节，否则所有的字段都应该用private封装
 * 
 * this关键字
 * 		本类中的某一个东西
 * 		this.xx   即为   本类中的xx变量
 * 
 * 题目1：
 * 		age				年龄最小应为22岁，如果不符合要求，默认保存最低年龄
 * 
 */
public class Demo {
	private int age;
	private int salary;
	
/*	public int getAge() {
		return age;
	}*/
	public void setAge(int age) {
		this.age = age;
	}
	/*public int getSalary() {
		return salary;
	}*/
	public void setSalary(int salary) {
		if(age>=30&&age<50){//当年龄在30到50岁之间
			if(salary>=8000){//当工资大于8000
				this.salary = salary;
			}else{
				this.salary = 8000;
			}
		}
		
		if(age>=20&&age<30){
			if(salary>=5000){
				this.salary = salary;
			}else{
				this.salary = 5000;
			}
		}
		
		if(age>=10&&age<20){
			if(salary>=3000){
				this.salary = salary;
			}else{
				this.salary = 3000;
			}
		}
	}
}
