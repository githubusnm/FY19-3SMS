package com.neuedu.test;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<>();
		linkedlist.add("hello2");
		linkedlist.add("hello");
		
		linkedlist.addFirst("you");
		linkedlist.addLast("sup");
		
		int hashCode = linkedlist.hashCode();
		System.out.println(hashCode);
		
		System.out.println(linkedlist);
		
		
		
		
		
		
		
	}
	
}
