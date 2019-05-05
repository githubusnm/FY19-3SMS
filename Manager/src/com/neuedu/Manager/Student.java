package com.neuedu.Manager;

public class Student {

	private int student_id;
	private String student_name;
	private int course_id;
	int getStudent_id() {
		return student_id;
	}
	void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	String getStudent_name() {
		return student_name;
	}
	void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	int getCourse_id() {
		return course_id;
	}
	void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + course_id;
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
		if (course_id != other.course_id)
			return false;
		if (student_id != other.student_id)
			return false;
		if (student_name == null) {
			if (other.student_name != null)
				return false;
		} else if (!student_name.equals(other.student_name))
			return false;
		return true;
	}
	public Student(int student_id, String student_name, int course_id) {
		this.student_id = student_id;
		this.student_name = student_name;
		this.course_id = course_id;
	}
	public Student() {

	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", course_id=" + course_id
				+ "]";
	}
	
}
