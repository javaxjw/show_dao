package cn.jugame.showList_web.bean;

public class Person {
	private String name;
	private String pass;
	
	public Person() {
		// TODO 自动生成的构造函数存根
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "Person[name="+name+ ",pass="+ pass+ "]";
	}
}
