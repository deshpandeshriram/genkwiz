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
@Table(name = "question_bank")

public class Question {

	@Column(name = "id")
	@Id
	private int questionId;

	@NaturalId
	@Column(name = "mode_id", insertable = false, updatable = false)
	private int modeId;
	@Column(name = "ratings")
	private float questionRatings;
	@Column(name = "question")
	private String questionText;
	@Column(name = "genre")
	private String questionGenre;
	@Column(name = "type")
	private String questionType;

	@OneToMany(mappedBy = "question")
	private Set<Hint> hints;

	@OneToMany(mappedBy = "question")
	private Set<Multimedia> multimedia;

	@OneToOne
	private Mode mode;

	@OneToOne(mappedBy = "question")
	private SubjectiveAnswer subjectiveAnswer;

	@OneToMany(mappedBy = "question")
	private Set<MCQAnswer> mcqOptions;


	public Question() {

	}

	public Question(int questionId, int modeId, float questionRatings, String questionText, String questionGenre,
			String questionType, Set<Hint> hints, Set<Multimedia> multimedia, Mode mode,
			SubjectiveAnswer subjectiveAnswer, Set<MCQAnswer> mcqOptions) {
		super();
		this.questionId = questionId;
		this.modeId = modeId;
		this.questionRatings = questionRatings;
		this.questionText = questionText;
		this.questionGenre = questionGenre;
		this.questionType = questionType;
		this.hints = hints;
		this.multimedia = multimedia;
		this.mode = mode;
		this.subjectiveAnswer = subjectiveAnswer;
		this.mcqOptions = mcqOptions;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getModeId() {
		return modeId;
	}

	public void setModeId(int modeId) {
		this.modeId = modeId;
	}

	public float getQuestionRatings() {
		return questionRatings;
	}

	public void setQuestionRatings(float questionRatings) {
		this.questionRatings = questionRatings;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public String getQuestionGenre() {
		return questionGenre;
	}

	public void setQuestionGenre(String questionGenre) {
		this.questionGenre = questionGenre;
	}

	public String getQuestionType() {
		return questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
	}

	public Set<Hint> getHints() {
		return hints;
	}

	public void setHints(Set<Hint> hints) {
		this.hints = hints;
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

	public SubjectiveAnswer getSubjectiveAnswer() {
		return subjectiveAnswer;
	}

	public void setSubjectiveAnswer(SubjectiveAnswer subjectiveAnswer) {
		this.subjectiveAnswer = subjectiveAnswer;
	}

	public Set<MCQAnswer> getMcqOptions() {
		return mcqOptions;
	}

	public void setMcqOptions(Set<MCQAnswer> mcqOptions) {
		this.mcqOptions = mcqOptions;
	}

}