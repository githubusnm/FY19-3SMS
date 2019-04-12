package com.neuedu.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String[] singleoptions = { "1.刘德华", "2.王英库", "3.吴彦祖" };
		int[] singlerightanswers = { 1 };// 正确答案
		int[] singleuseranswers = { 1 };// 用户答案
		SingleChoice singleChoice = new SingleChoice("谁是世界上最帅的人？", singleoptions, singlerightanswers[0]);
		singleChoice.showQuestion();
		if (true == (singleChoice.check(singleuseranswers))) {
			System.out.println("答对");
		} else {
			System.out.println("答错");
		}

		String[] multioptions = { "1.李小龙", "2.成龙", "3.释小龙" };
		int[] multianswers = { 1, 2 };// 正确答案
		int[] multiuseranswers = { 1, 5 };
		MultiCHoice multiCHoices = new MultiCHoice("我的问题是什么？", multioptions, multianswers);
		multiCHoices.showQuestion();
		if (multiCHoices.check(multiuseranswers) == true) {
			System.out.println("答对");
		} else {
			System.out.println("答错");
		}

		char[] c = {};
		System.out.println(c);

	}
}

class Question {
	String test;

	public boolean check(int[] useranswers) {
		return false;
	}

	public void showQuestion() {

	}
}

class SingleChoice extends Question {
	String[] options;
	int rightanswer;

	public SingleChoice() {
		// TODO Auto-generated constructor stub
	}

	public SingleChoice(String test, String[] options, int rightanswer) {
		super.test = test;
		this.options = options;
		this.rightanswer = rightanswer;
	}

	@Override
	public boolean check(int[] useranswers) {
		for (int i : useranswers) {
			if (rightanswer == i) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void showQuestion() {
		System.out.println("题目是：" + test + "\n" + "选项：" + Arrays.toString(options) + "\n");
	}
}

class MultiCHoice extends Question {
	String[] options;
	int[] rightanswers;

	public MultiCHoice() {
		// TODO Auto-generated constructor stub
	}

	public MultiCHoice(String test, String[] options, int[] rightanswers) {
		super.test = test;
		this.options = options;
		this.rightanswers = rightanswers;
	}

//	@Override
//	public boolean check(int[] useranswers) {
//		for (int i : useranswers) {
//			for (int j = 0; j < rightanswers.length - 1; j++) {
//				if (rightanswers[j] == i) {
//					return true;
//				}
//			}
//		}
//		return false;
//	}

	@Override
	public boolean check(int[] useranswers) {
		int q = 1;
		while (q == 1) {
			if (useranswers.length == rightanswers.length) {
				for (int i : useranswers) {
					for (int j = 0; j < rightanswers.length - 1; j++) {
						if (rightanswers[j] == i) {
							q = 2;
							System.out.println(q);
							return true;
						}
					}
				}
			}
			q =2;
		}
		return false;
	}

	@Override
	public void showQuestion() {
		System.out.println("题目是：" + test + "\n" + "选项是：" + Arrays.toString(options));
	}
}

abstract class Test {

}