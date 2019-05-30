package com.nazmul.dp.designpattern.factory;

public class ShapeFactory {
	
	public Shape createShape(String shapeType) {
		Shape  shape = null;
		
		if(shapeType.equalsIgnoreCase("C")) {
			shape = new Circle();
		}
		else if(shapeType.equalsIgnoreCase("S")) {
			shape = new Square();
		}
		else {
			shape = null;
		}
		
		return shape;
	}
	

}
