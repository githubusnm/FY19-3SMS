package com.neuedu.test2;

public class Student {

	private String name;

	private Integer age;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	Integer getAge() {
		return age;
	}

	void setAge(Integer age) {
		this.age = age;
	}

}
