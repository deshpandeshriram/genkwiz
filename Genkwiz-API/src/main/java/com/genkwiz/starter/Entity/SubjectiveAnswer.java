package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subjective_answer")
public class SubjectiveAnswer {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "question_id", insertable = false, updatable = false)
	private int questionId;

	@Column(name = "answer_value")
	private String answerValue;

	@Column(name = "answer_multimedia")
	private String answerMultimedia;

	@OneToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	public SubjectiveAnswer() {

	}

	public SubjectiveAnswer(int id, int questionId, String answerValue, String answerMultimedia, Question question) {
		super();
		this.id = id;
		this.questionId = questionId;
		this.answerValue = answerValue;
		this.answerMultimedia = answerMultimedia;
		this.question = question;
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

	public String getAnswerMultimedia() {
		return answerMultimedia;
	}

	public void setAnswerMultimedia(String answerMultimedia) {
		this.answerMultimedia = answerMultimedia;
	}

}
