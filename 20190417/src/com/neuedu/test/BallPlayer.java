package com.neuedu.test;

public class BallPlayer {

	static int count = 0;

	public BallPlayer() {

	}

	public void newPlayer() {
		count++;
		if (count > 11) {
			System.out.println("����������");
		} else {
			System.out.println("��������Ա"+count);
			new BallPlayer();
		}
	}

}
