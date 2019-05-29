package com.nazmul.dp.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
	private String name;
	
	private List<Book> books  ;
	
	public BookShop()
	{
		books = new ArrayList<Book>();	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData()
	{
		for(int i=0; i<10; i++) {
			Book book = new Book(i);
			books.add(book);
		}
	}

	@Override
	public String toString() {
		return "BookShop [name=" + name + ", books=" + books + "]";
	}
	
	@Override
	public BookShop clone() throws CloneNotSupportedException
	{
		BookShop shop = new BookShop();
		
		for(Book book : this.getBooks()) {
			shop.getBooks().add(book);
		}
		
		return shop;
		
	}

	
}
