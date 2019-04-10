package com.neuedu.work;

import java.util.Arrays;

public class QuestionTest {
	public static void main(String[] args) {
		String[] options = { "��Ӣ��", "���»�", "������", "�żһ�" };
//		SingleQuestion singleQuestion = new SingleQuestion(1, "˭����������˧���ˣ�", options, "��Ӣ��");
//		singleQuestion.showQuestion();
		
		String[] rightAnswer = new String[] {"��Ӣ��"};
		SingleQuestion singleQuestion = new SingleQuestion(1, "˭����������˧���ˣ�", options, rightAnswer);
		
		String[] userAnswers = new String[] {"��Ӣ��"};
		singleQuestion.checkAnswer(userAnswers);
		
		if(singleQuestion.checkAnswer(userAnswers) == true) {
			System.out.println("��ϲ��������");
		}else {
			System.out.println("����ˣ����б���Ӣ����˧�����𣿣�");
		}
		
		
//		if(singleQuestion.checkAnswer("��Ӣ��") == true) {
//			System.out.println("��ϲ��������");
//		}else {
//			System.out.println("����ˣ����б���Ӣ����˧�����𣿣�");
//		}
	}
}

class Question {
	int id;// ���
	String QuestionTest;// ��Ŀ
	String[] options;
	String[] rightAnswers;

	public boolean checkAnswer(String userAnswer) {
		return false;
	}

	public Question() {

	}

}

class SingleQuestion extends Question {

	@Override
	public boolean checkAnswer(String userAnswer) {
		for (String string : options) {
			if (userAnswer == string) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	public boolean checkAnswer(String[] userAnswers) {
		for (String string : rightAnswers) {
			if (string == userAnswers[userAnswers.length-1]) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	public SingleQuestion(int id, String QuestionTest, String[] options, String[] rightAnswer) {
		this.id = id;
		this.QuestionTest = QuestionTest;
		this.options = options;
		this.rightAnswers = rightAnswer;
	}

	public SingleQuestion(int id, String QuestionTest, String[] options, String userAnswer) {
		this.id = id;
		this.QuestionTest = QuestionTest;
		this.options = options;
	}

	public void showQuestion() {
		System.out.println("��ţ�" + id + "\t" + "��Ŀ��" + QuestionTest + "ѡ�" + Arrays.toString(options));
	}
}