package com.neuedu.test;

public class RelecDemo {

	private Integer id;
	private String name;
	Integer getId() {
		return id;
	}
	void setId(Integer id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public RelecDemo(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "RelecDemo [id=" + id + ", name=" + name + "]";
	}
	
}
