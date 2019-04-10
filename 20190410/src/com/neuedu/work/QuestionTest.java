package com.neuedu.work;

import java.util.Arrays;

public class QuestionTest {
	public static void main(String[] args) {
		String[] options = { "王英坤", "刘德华", "吴彦祖", "张家辉" };
//		SingleQuestion singleQuestion = new SingleQuestion(1, "谁是世界上最帅的人？", options, "王英坤");
//		singleQuestion.showQuestion();
		
		String[] rightAnswer = new String[] {"王英坤"};
		SingleQuestion singleQuestion = new SingleQuestion(1, "谁是世界上最帅的人？", options, rightAnswer);
		
		String[] userAnswers = new String[] {"王英坤"};
		singleQuestion.checkAnswer(userAnswers);
		
		if(singleQuestion.checkAnswer(userAnswers) == true) {
			System.out.println("恭喜你答对啦！");
		}else {
			System.out.println("你错了！还有比王英坤更帅的人吗？？");
		}
		
		
//		if(singleQuestion.checkAnswer("王英坤") == true) {
//			System.out.println("恭喜你答对啦！");
//		}else {
//			System.out.println("你错了！还有比王英坤更帅的人吗？？");
//		}
	}
}

class Question {
	int id;// 题号
	String QuestionTest;// 题目
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
		System.out.println("题号：" + id + "\t" + "题目：" + QuestionTest + "选项：" + Arrays.toString(options));
	}
}