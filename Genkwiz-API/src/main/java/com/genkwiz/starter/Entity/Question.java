package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="question_bank")

public class Question {
	
	@Column(name="id")
	@Id
	private int qId;
	
	@Column(name="mode_id")
	private int modeId;
	@Column(name="ratings")
	private float qRatings;
	@Column(name="question")
	private String qQuestion;
	@Column(name="genre")
	private String qGenre;
	@Column(name="type")
	private String qType;
	

	
	public Question() {
		
	}
	
	
	public Question(int qId, int modeId, float qRatings, String qQuestion, String qGenre, String qType) {
		super();
		this.qId = qId;
		this.modeId = modeId;
		this.qRatings = qRatings;
		this.qQuestion = qQuestion;
		this.qGenre = qGenre;
		this.qType = qType;
	}


	public int getqId() {
		return qId;
	}


	public void setqId(int qId) {
		this.qId = qId;
	}


	public int getModeId() {
		return modeId;
	}


	public void setModeId(int modeId) {
		this.modeId = modeId;
	}


	public float getqRatings() {
		return qRatings;
	}


	public void setqRatings(float qRatings) {
		this.qRatings = qRatings;
	}


	public String getqQuestion() {
		return qQuestion;
	}


	public void setqQuestion(String qQuestion) {
		this.qQuestion = qQuestion;
	}


	public String getqGenre() {
		return qGenre;
	}


	public void setqGenre(String qGenre) {
		this.qGenre = qGenre;
	}


	public String getqType() {
		return qType;
	}


	public void setqType(String qType) {
		this.qType = qType;
	}

	
}