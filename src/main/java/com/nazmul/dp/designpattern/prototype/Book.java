package com.nazmul.dp.designpattern.prototype;

public class Book {
   
	private int id;
    private String name;
    
    public Book(int id)
    {
    	this.id = id;
    	this.name = "Book "+id;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
