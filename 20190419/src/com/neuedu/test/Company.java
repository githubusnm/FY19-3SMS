package com.neuedu.test;

public class Company {
	public static void main(String[] args) {
		HourlyEmployee hourlyEmployee = new HourlyEmployee();
		hourlyEmployee.setHour(170);// 工作时间
		hourlyEmployee.setBirthdaymounth(2);// 员工生日月
		hourlyEmployee.setHoursalary(10);// 每小时工资
		System.out.println(hourlyEmployee.getBirthdaymounth());
		double salary = hourlyEmployee.getSalary(2);// 当前月份
		System.out.println(salary);
		
	}
}

class ColaEmployee {
	String name;
	int birthdaymounth;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthdaymounth() {
		return birthdaymounth;
	}

	public void setBirthdaymounth(int birthdaymounth) {
		this.birthdaymounth = birthdaymounth;
	}

	public double getSalary(int month) {
		if(birthdaymounth == month) {
			return 100;
		}else {
			return 0;
		}
	}
}

class SalarledEmployee extends ColaEmployee {
	private double salary = 200;// 基础工资
	
	public double getSalary() {
		return salary;
	}
}

class HourlyEmployee extends ColaEmployee {
	private int hoursalary;
	private int hour;

	public int getHoursalary() {
		return hoursalary;
	}

	public void setHoursalary(int hoursalary) {
		this.hoursalary = hoursalary;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public double getSalary(int month) {
		SalarledEmployee salarledEmployee = new SalarledEmployee();
		double salary = salarledEmployee.getSalary();
		if(hour > 160 && birthdaymounth == month) {
			return salary + (hour - 160) * hoursalary * 1.5 + 100;
		}else {
			return 0.0;
		}
		
	}

}

class SalesEmployee extends ColaEmployee {
	double monthsell;
	double tichenglv;

	public double getMonthsell() {
		return monthsell;
	}

	public void setMonthsell(double monthsell) {
		this.monthsell = monthsell;
	}

	public double getTichenglv() {
		return tichenglv;
	}

	public void setTichenglv(double tichenglv) {
		this.tichenglv = tichenglv;
	}
}