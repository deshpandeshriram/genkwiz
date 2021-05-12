package com.genkwiz.starter.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.NaturalId;



@Entity
@Table(name="question_bank")

public class Question {
	
	@Column(name="id",insertable=false,updatable=false)
	@Id
	private int qId;
	
	
	
	@NaturalId
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
	
	@OneToMany(mappedBy="question")
	   private Set<Hint> hint;
	
	@OneToMany(mappedBy="question")
	private Set<Multimedia> multimedia;
	
	@OneToOne(mappedBy="question")
	private Mode mode;
	
	@OneToOne(mappedBy="question")
	private SubjectiveAnswer subAnswer;
	
	@OneToMany(mappedBy="question")
	private Set<MCQAnswer> mcqoptions;
	
	 @ManyToOne
	 @JoinColumn(name="id", nullable=false)
	 private Quiz quiz;
	
	public Question() {
		
	}
	
	

	public Question(int qId, int modeId, float qRatings, String qQuestion, String qGenre, String qType, Set<Hint> hint,
			Set<Multimedia> multimedia, Mode mode, SubjectiveAnswer subAnswer, Set<MCQAnswer> mcqoptions) {
		super();
		this.qId = qId;
		this.modeId = modeId;
		this.qRatings = qRatings;
		this.qQuestion = qQuestion;
		this.qGenre = qGenre;
		this.qType = qType;
		this.hint = hint;
		this.multimedia = multimedia;
		this.mode = mode;
		this.subAnswer = subAnswer;
		this.mcqoptions = mcqoptions;
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

	public Set<Hint> getHint() {
		return hint;
	}

	public void setHint(Set<Hint> hint) {
		this.hint = hint;
	}

	public Set<Multimedia> getMultimedia() {
		return multimedia;
	}

	public void setMultimedia(Set<Multimedia> multimedia) {
		this.multimedia = multimedia;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}


	public SubjectiveAnswer getSubAnswer() {
		return subAnswer;
	}

	public void setSubAnswer(SubjectiveAnswer subAnswer) {
		this.subAnswer = subAnswer;
	}

	public Set<MCQAnswer> getMcqoptions() {
		return mcqoptions;
	}

	public void setMcqoptions(Set<MCQAnswer> mcqoptions) {
		this.mcqoptions = mcqoptions;
	}


	
}
