package com.nazmul.dp.designpattern.prototype;

public class App {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bookShop1 = new BookShop();
		bookShop1.setName("Book Shop Ultima");
		bookShop1.loadData();
				
		
		BookShop bookShop2 = bookShop1.clone();
		bookShop2.setName("Early Reader");
		
		System.out.println(bookShop1);
		bookShop1.getBooks().remove(1);
		System.out.println(bookShop2);

	}

}
