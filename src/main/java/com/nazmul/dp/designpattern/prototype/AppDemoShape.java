package com.nazmul.dp.designpattern.prototype;

public class AppDemoShape {

	public static void main(String[] args) {
		
		ShapeCache.loadData();
		
		Shape newShape = (Shape)ShapeCache.getShape("1");
		newShape.draw();
		
		Shape newShape2 = (Shape)ShapeCache.getShape("2");
		newShape2.draw();

	}

}
