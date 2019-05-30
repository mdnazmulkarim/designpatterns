package com.nazmul.dp.designpattern.adapter;

import java.util.Random;

/*
 * This is the target call that we want to adapt with our interface
 * Thus this class has methods with some different names.
 * */
public class EnemyRobot{

	Random generator = new Random();
	
	public void smashWithHands() {
		
		int attackDamage = generator.nextInt(10) + 1;		
		System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");		
	}

	public void walkForward() {
		
		int movement = generator.nextInt(5) + 1;		
		System.out.println("Enemy Robot Walks Forward " + movement + " spaces");		
	}

	public void reactToHuman(String driverName) {
		
		System.out.println("Enemy Robot Tramps on " + driverName);		
	}
	
	
	
}
