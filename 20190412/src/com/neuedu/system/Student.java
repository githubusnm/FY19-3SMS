package com.neuedu.system;

public class Student {

	public Student(int id, String stuName, char stusex, short stuAge, String stuGrade, String stuAddress, int stuTel,
			String email) {
		this.id = id;
		this.stuName = stuName;
		this.stusex = stusex;
		this.stuAge = stuAge;
		this.stuGrade = stuGrade;
		this.stuAddress = stuAddress;
		this.stuTel = stuTel;
		this.stuEmail = email;
	}

	int id;

	String stuName;

	char stusex;

	short stuAge;

	String stuGrade;

	String stuAddress;

	int stuTel;

	String stuEmail;

	@Override
	public String toString() {
		return "Student [id=" + id + ", stuName=" + stuName + ", stusex=" + stusex + ", stuAge=" + stuAge
				+ ", stuGrade=" + stuGrade + ", stuAddress=" + stuAddress + ", stuTel=" + stuTel + ", stuEmail="
				+ stuEmail + "]";
	}

	

	
	
}
