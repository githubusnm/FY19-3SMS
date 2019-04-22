package com.neuedu.test;

public class Test1 {

	public static void main(String[] args) {
    	String f = f("We Are Happy");
        System.out.println(f);
    }
    public static String f(String string){
        String replace = string.replace(" ","%20");
        return replace ;
    }
}
