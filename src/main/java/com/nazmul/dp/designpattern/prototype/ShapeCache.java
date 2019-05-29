package com.nazmul.dp.designpattern.prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class ShapeCache {
	
	private static Hashtable<String , Shape> shapeMap = new Hashtable<String,Shape>();
	
	public static Shape getShape(String id) {
		Shape newShape = shapeMap.get(id);
		return (Shape)newShape.clone();
	}
	
	public static  void loadData() {
		Circle circle = new Circle("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square("2");		
		shapeMap.put(square.getId(), square);
	}

}
