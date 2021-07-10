package com.genkwiz.starter.Entity;

import java.sql.Time;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import com.vladmihalcea.hibernate.type.array.EnumArrayType;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;

@Entity
@Table(name = "quiz")
@IdClass(QuizId.class)
public class Quiz {

	@Id
	@Column(name = "id")
	private UUID quizId;

	@Id
	@Column(name = "question_id")
	private int questionId;

	@Column(name = "time_taken_by_user")
	private Time userTime;

	@Column(name = "hints_used")
	private int numberOfHints;

	@Column(name = "score_per_question")
	private int scorePerQuestion;

	@Enumerated(EnumType.STRING)
	@Column(name = "current_status", columnDefinition = "status")
	Status status;

	@Column(name = "serial_number")
	private int serialNumber;

	@Column(name = "user_answer")
	private String userAnswer;

	@Column(name = "is_correct")
	private boolean isCorrect;

	public Quiz() {

	}

	public Quiz(UUID quizId, int questionId, Time userTime, int numberOfHints, int scorePerQuestion, Status status,
			int serialNumber, String userAnswer, boolean isCorrect) {
		super();
		this.quizId = quizId;
		this.questionId = questionId;
		this.userTime = userTime;
		this.numberOfHints = numberOfHints;
		this.scorePerQuestion = scorePerQuestion;
		this.status = status;
		this.serialNumber = serialNumber;
		this.userAnswer = userAnswer;
		this.isCorrect = isCorrect;
	}

	public UUID getQuizId() {
		return quizId;
	}

	public void setQuizId(UUID quizId) {
		this.quizId = quizId;
	}

	public Time getUserTime() {
		return userTime;
	}

	public void setUserTime(Time userTime) {
		this.userTime = userTime;
	}

	public int getNumberofHints() {
		return numberOfHints;
	}

	public void setNumberofHints(int numberofHints) {
		this.numberOfHints = numberofHints;
	}

	public int getScorePerQuestion() {
		return scorePerQuestion;
	}

	public void setScorePerQuestion(int scorePerQuestion) {
		this.scorePerQuestion = scorePerQuestion;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

}
