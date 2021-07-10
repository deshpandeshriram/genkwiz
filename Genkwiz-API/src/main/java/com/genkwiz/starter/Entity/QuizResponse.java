package com.genkwiz.starter.Entity;

public class QuizResponse {

	private Quiz quiz;

	private Question question;

	public QuizResponse() {

	}

	public QuizResponse(Quiz quiz, Question question) {
		super();
		this.quiz = quiz;
		this.question = question;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
