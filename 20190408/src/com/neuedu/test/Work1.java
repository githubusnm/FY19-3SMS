package com.neuedu.test;

public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.pages=2500;
		book.name="�ú�ѧϰ����������";
		book.price=100;
		book.ISBN="1234567891234";
		book.type="Ұ��ð����";
		book.bookstore="�����Ľ���";
		System.out.println("���ҳ���ǣ�"+book.pages);
		System.out.println("��������ǣ�"+book.name);
		System.out.println("��ļ۸��ǣ�"+book.price);
		System.out.println("���ISBN�ǣ�"+book.ISBN);
		System.out.println("��������ǣ�"+book.type);
		System.out.println("��ĳ������ǣ�"+book.bookstore);
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
		System.out.println("���ڿ��飡");
	}
	public void sell() {
		System.out.println("����������");
	}

}
