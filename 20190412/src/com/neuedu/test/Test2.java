package com.neuedu.test;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		String[] singleoptions = { "1.���»�", "2.��Ӣ��", "3.������" };
		int[] singlerightanswers = { 1 };// ��ȷ��
		int[] singleuseranswers = { 1 };// �û���
		SingleChoice singleChoice = new SingleChoice("˭����������˧���ˣ�", singleoptions, singlerightanswers[0]);
		singleChoice.showQuestion();
		if (true == (singleChoice.check(singleuseranswers))) {
			System.out.println("���");
		} else {
			System.out.println("���");
		}

		String[] multioptions = { "1.��С��", "2.����", "3.��С��" };
		int[] multianswers = { 1, 2 };// ��ȷ��
		int[] multiuseranswers = { 1, 5 };
		MultiCHoice multiCHoices = new MultiCHoice("�ҵ�������ʲô��", multioptions, multianswers);
		multiCHoices.showQuestion();
		if (multiCHoices.check(multiuseranswers) == true) {
			System.out.println("���");
		} else {
			System.out.println("���");
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
		System.out.println("��Ŀ�ǣ�" + test + "\n" + "ѡ�" + Arrays.toString(options) + "\n");
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
		System.out.println("��Ŀ�ǣ�" + test + "\n" + "ѡ���ǣ�" + Arrays.toString(options));
	}
}

abstract class Test {

}