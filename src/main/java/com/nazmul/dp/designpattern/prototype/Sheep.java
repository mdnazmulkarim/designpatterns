package com.nazmul.dp.designpattern.prototype;

public class Sheep implements Animal {

	public Sheep(){		
		System.out.println("Sheep object created");
	}
	
	public Animal makeCopy() {
		
		System.out.println("Cloning Sheep.");
		
		Sheep sheepObject = null;		
		try {
			sheepObject = (Sheep) super.clone();			
		}
		catch (CloneNotSupportedException e) {			  
			e.printStackTrace();			  
		 }		
		return sheepObject;
	}
	
	public String toString(){		
		return "This is a Sheep.";		
	}
	
}