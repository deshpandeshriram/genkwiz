package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subjective_answer")
public class SubjectiveAnswer {

	@Id
	@Column(name="id")
	private int id;
	@Column(name="question_id")
	private int questionId;
	@Column(name="answer_value")
	private String answerValue;
	
	public SubjectiveAnswer() {
		
	}
	
	public SubjectiveAnswer(int id, int questionId, String answerValue) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.answerValue = answerValue;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getAnswerValue() {
		return answerValue;
	}
	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}
	
}
