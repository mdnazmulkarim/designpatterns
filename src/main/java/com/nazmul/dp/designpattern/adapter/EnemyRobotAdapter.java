package com.nazmul.dp.designpattern.adapter;

public class EnemyRobotAdapter implements EnemyAttacker{

	EnemyRobot enemyRobot;
	
	public EnemyRobotAdapter(EnemyRobot en) {
		this.enemyRobot = en;
	}
	
	public void fireWeapon() {

		enemyRobot.smashWithHands();
		
	}

	public void driveForward() {
		
		this.enemyRobot.walkForward();
	}

	public void assignDriver(String driverName) {
		
		this.enemyRobot.reactToHuman(driverName);
	}

}
