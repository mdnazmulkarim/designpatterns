package com.nazmul.dp.designpattern.adapter;

/*
 * This the interface the client wants
 * */
public interface EnemyAttacker {
	
	public void fireWeapon();
	
	public void driveForward();
	
	public void assignDriver(String driverName);

}
