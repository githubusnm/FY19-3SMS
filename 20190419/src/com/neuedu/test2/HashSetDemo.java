package com.neuedu.test2;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Student> hashSet = new HashSet<>();
		hashSet.add(new Student("����", 11));
		hashSet.add(new Student("����", 12));
		hashSet.add(new Student("����", 12));
		hashSet.add(new Student("����", 12));
		hashSet.add(new Student("����", 12));
		System.out.println(hashSet);
		
		boolean contains = hashSet.contains(new Student("����", 11));
		System.out.println(contains);
	}
}
