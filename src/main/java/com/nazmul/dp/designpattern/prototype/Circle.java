package com.nazmul.dp.designpattern.prototype;

public class Circle extends Shape{

	public Circle(String id) {
		super.setId(id);
		super.setType("Circle");
	}
	
	@Override
	public void draw() {
		System.out.println(this.getId()+" :Shape type:"+this.getType());
		
	}

}
