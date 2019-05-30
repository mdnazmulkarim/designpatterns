package com.nazmul.dp.designpattern.factory;

import java.util.Scanner;

public class ShapeFactoryDemo {
	
	public static void main(String[] args) {
	
		System.out.println("Whay type of shape you want to create? (C/S) ");
		
		Scanner scanner = new Scanner(System.in);
		
		ShapeFactory shapeFactory = new ShapeFactory();
		
		String shapeType = "";
		if(scanner.hasNext()) {
			shapeType = scanner.nextLine();
		}
		
		Shape newShape = shapeFactory.createShape(shapeType);
		newShape.draw();
		
		
		
	}

}
