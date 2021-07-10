package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "question_hint")
public class Hint {

	@Id
	@Column(name = "id")
	private int hintId;

	@Column(name = "question_id", insertable = false, updatable = false)
	private int questionId;

	@Column(name = "hint_number")
	private int hintNumber;

	@Column(name = "value")
	private String hintValue;

	@Column(name = "marks_deduction")
	private int marksDeduction;

	@Column(name = "multimedia_content")
	private String hintMedia;

	@Column(name = "multimedia_type")
	private String hintMediaType;

	@ManyToOne
	@JoinColumn(name = "question_id", nullable = false)
	private Question question;

	public Hint() {

	}

	public Hint(int hintId, int questionId, int hintNumber, String hintValue, int marksDeduction, String hintMedia,
			String hintMediaType) {
		super();
		this.hintId = hintId;
		this.questionId = questionId;
		this.hintNumber = hintNumber;
		this.hintValue = hintValue;
		this.marksDeduction = marksDeduction;
		this.hintMedia = hintMedia;
		this.hintMediaType = hintMediaType;
	}

	public int getHintId() {
		return hintId;
	}

	public void setHintId(int hintId) {
		this.hintId = hintId;
	}

	public int getquestionId() {
		return questionId;
	}

	public void setquestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getHintNumber() {
		return hintNumber;
	}

	public void setHintNumber(int hintNumber) {
		this.hintNumber = hintNumber;
	}

	public String getHintValue() {
		return hintValue;
	}

	public void setHintValue(String hintValue) {
		this.hintValue = hintValue;
	}

	public int getMarksDeduction() {
		return marksDeduction;
	}

	public void setMarksDeduction(int marksDeduction) {
		this.marksDeduction = marksDeduction;
	}

	public String getHintMedia() {
		return hintMedia;
	}

	public void setHintMedia(String hintMedia) {
		this.hintMedia = hintMedia;
	}

	public String getHintMediaType() {
		return hintMediaType;
	}

	public void setHintMediaType(String hintMediaType) {
		this.hintMediaType = hintMediaType;
	}

}
