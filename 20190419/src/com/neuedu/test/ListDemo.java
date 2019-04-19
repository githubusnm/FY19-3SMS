package com.neuedu.test;

import java.util.*;

public class ListDemo {

	public static void main(String[] args) {
		
		//创建一个线性集合
		List<Object> list = new ArrayList<>();
		
		//add(object)
		list.add(1);
		list.add("hello");
		list.add(true);
		list.add(false);
		list.add(0.0);
		list.add('a');
		list.add(1);
		
		//add(index,object)
		list.add(1, "3");
		
		//用的是equals
		boolean contains = list.contains(1);
		System.out.println(contains);
		
		//get(index)
		Object object = list.get(2);
		System.out.println(object);
		
		//判断是否为String类型
		Object string = list.get(1);
		if(string instanceof String) {
			String str = (String)string;
			System.out.println(str);
		}
		
		//list.indexOf()
		int indexOf = list.indexOf(true);
		System.out.println(indexOf);
		
		//isEmpty()
		boolean empty = list.isEmpty();
		System.out.println(empty);
		
		//remove
//		Object remove = list.removeAll(list);
//		System.out.println(remove);
		
		
		System.out.println(list);
	}
	
	
	
	
	
	
}
class T{
	T t;
	int it = 1;
	public T t() {
		return it == 0 ? this : t;
	}
}
