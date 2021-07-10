package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "multimedia")
public class Multimedia {
	@Id
	@Column(name = "id")
	private int multimediaId;

	@Column(name = "question_id", insertable = false, updatable = false)
	private int questionId;

	@Column(name = "multimedia_number")
	private int multimediaNumber;

	@Column(name = "multimedia_type")
	private String multimediaType;

	@Column(name = "multimedia_content")
	private String multimediaContent;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	public Multimedia() {

	}

	public Multimedia(int multimediaId, int questionId, int multimediaNumber, String multimediaType,
			String multimediaContent, Question question) {
		super();
		this.multimediaId = multimediaId;
		this.questionId = questionId;
		this.multimediaNumber = multimediaNumber;
		this.multimediaType = multimediaType;
		this.multimediaContent = multimediaContent;
		this.question = question;
	}

	public int getMultimediaId() {
		return multimediaId;
	}

	public void setMultimediaId(int multimediaId) {
		this.multimediaId = multimediaId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getMultimediaNumber() {
		return multimediaNumber;
	}

	public void setMultimediaNumber(int multimediaNumber) {
		this.multimediaNumber = multimediaNumber;
	}

	public String getMultimediaType() {
		return multimediaType;
	}

	public void setMultimediaType(String multimediaType) {
		this.multimediaType = multimediaType;
	}

	public String getMultimediaContent() {
		return multimediaContent;
	}

	public void setMultimediaContent(String multimediaContent) {
		this.multimediaContent = multimediaContent;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}
