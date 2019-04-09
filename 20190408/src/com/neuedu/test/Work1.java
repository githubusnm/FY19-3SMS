package com.neuedu.test;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.pages=2500;
		book.name="好好学习，天天向上";
		book.price=100;
		book.ISBN="1234567891234";
		book.type="野外冒险类";
		book.bookstore="进步的阶梯";
		System.out.println("书的页数是："+book.pages);
		System.out.println("书的名字是："+book.name);
		System.out.println("书的价格是："+book.price);
		System.out.println("书的ISBN是："+book.ISBN);
		System.out.println("书的类型是："+book.type);
		System.out.println("书的出版社是："+book.bookstore);
		book.watch();
		book.sell();
	}
}
class Book{
	int pages;
	String name;
	double price;
	String author;
	String ISBN;
	String type;
	String bookstore;
	public void watch() {
		System.out.println("正在看书！");
	}
	public void sell() {
		System.out.println("把书卖啦！");
	}

}
