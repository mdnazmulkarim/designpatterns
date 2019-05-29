package com.nazmul.dp.designpattern.prototype;

public class Square extends Shape{

	public Square(String id) {
		super.setId(id);
		super.setType("Square");
	}
	
	@Override
	public void draw() {
		System.out.println(this.getId()+" :Shape type:"+this.getType());
		
	}

}
