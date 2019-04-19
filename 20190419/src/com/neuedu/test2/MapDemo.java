package com.neuedu.test2;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, Student> hashMap = new HashMap<>();
		hashMap.put("001", new Student("张三", 11));
		hashMap.put("002", new Student("李四", 12));
		System.out.println(hashMap);
		Set<String> keySet = hashMap.keySet();
		System.out.println(keySet);
		HashMap<Integer, String> hashMap2 = new HashMap<>();
		hashMap2.put(1, "yi");
		hashMap2.put(2, "er");
		String string = hashMap2.get(2);
		Set<Integer> keySet2 = hashMap2.keySet();
		System.out.println(string);
		System.out.println(keySet2);

	}

}
