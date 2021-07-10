package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mcq_answer")
public class MCQAnswer {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "question_id", insertable = false, updatable = false)
	private int questionId;
	@Column(name = "answer_number")
	private int answerNumber;
	@Column(name = "answer_value")
	private String answerValue;
	@Column(name = "is_correct_ans")
	private int isCorrectAns;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	public MCQAnswer() {

	}

	public MCQAnswer(int id, int questionId, int answerNumber, String answerValue, int isCorrectAns) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.answerNumber = answerNumber;
		this.answerValue = answerValue;
		this.isCorrectAns = isCorrectAns;

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

	public int getAnswerNumber() {
		return answerNumber;
	}

	public void setAnswerNumber(int answerNumber) {
		this.answerNumber = answerNumber;
	}

	public String getAnswerValue() {
		return answerValue;
	}

	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}

	public int getIsCorrectAns() {
		return isCorrectAns;
	}

	public void setIsCorrectAns(int isCorrectAns) {
		this.isCorrectAns = isCorrectAns;
	}

}
