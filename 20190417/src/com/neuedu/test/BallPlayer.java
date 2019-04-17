package com.neuedu.test;

public class BallPlayer {

	static int count = 0;

	public BallPlayer() {

	}

	public void newPlayer() {
		count++;
		if (count > 11) {
			System.out.println("不允许创建了");
		} else {
			System.out.println("创建了球员"+count);
			new BallPlayer();
		}
	}

}
