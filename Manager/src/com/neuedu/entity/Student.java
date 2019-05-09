package com.neuedu.entity;

public class Student {

	private int student_id;
	private String student_name;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Student() {

	}
	public Student(int student_id, String student_name) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + student_id;
		result = prime * result + ((student_name == null) ? 0 : student_name.hashCode());
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
		if (student_id != other.student_id)
			return false;
		if (student_name == null) {
			if (other.student_name != null)
				return false;
		} else if (!student_name.equals(other.student_name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + "]";
	}
	
	
}
