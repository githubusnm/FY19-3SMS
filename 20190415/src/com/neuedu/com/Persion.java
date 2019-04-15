package com.neuedu.com;

public class Persion {

	private int age;
	private int name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Persion [age=" + age + ", name=" + name + "]";
	}
	public Persion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persion(int age, int name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + name;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persion other = (Persion) obj;
		if (age != other.age)
			return false;
		if (name != other.name)
			return false;
		return true;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}

	
	
	
}
