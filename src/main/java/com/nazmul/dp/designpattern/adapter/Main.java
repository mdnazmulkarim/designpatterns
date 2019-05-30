package com.nazmul.dp.designpattern.adapter;

public class Main {
	
	public static void main(String[] args) {
		
		EnemyTank enemyTank = new EnemyTank();
		enemyTank.assignDriver("Alex");
		enemyTank.driveForward();
		enemyTank.fireWeapon();
		
		EnemyRobot  enemyRobot = new EnemyRobot();
		enemyRobot.reactToHuman("Ewe");
		enemyRobot.walkForward();
		enemyRobot.smashWithHands();
		
		EnemyRobotAdapter adapter = new EnemyRobotAdapter(enemyRobot);
		
		adapter.driveForward();
		adapter.fireWeapon();
	}

}
