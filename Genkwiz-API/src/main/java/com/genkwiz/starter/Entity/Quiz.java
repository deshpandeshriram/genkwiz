package com.genkwiz.starter.Entity;

import java.sql.Time;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="quiz")
/*@SecondaryTables({
	@SecondaryTable(name="question_bank",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="que_hint",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="que_mode",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="multimedia",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id"))
	
})*/
public class Quiz {
		
		@Id
		@Column(name="id")
		private UUID quizId;
		
		@Column(name="question_id")
		private int qId;
		
		@Column(name="time_taken_by_user")
		private Time userTime;
		
		@Column(name="hints_used")
		private int numberofHints;
		
		@Column(name="score_per_question")
		private int scorePerQuestion;
		
		@Column(name="is_attempted")
		boolean isAttempted;
		
		@Transient
		Question question;
		@Transient
		Hint hint;
		@Transient
		Mode mode;
		@Transient
		Multimedia multimedia;
		
		public Quiz() {
			
		}
		
		public Quiz(UUID quizId, int qId,Time userTime, int numberofHints, int scorePerQuestion, boolean isAttempted,
				Question question, Hint hint, Mode mode, Multimedia multimedia) {
			super();
			this.quizId = quizId;
			this.qId=qId;
			this.userTime = userTime;
			this.numberofHints = numberofHints;
			this.scorePerQuestion = scorePerQuestion;
			this.isAttempted = isAttempted;
			this.question = question;
			this.hint = hint;
			this.mode = mode;
			this.multimedia = multimedia;
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
			return numberofHints;
		}

		public void setNumberofHints(int numberofHints) {
			this.numberofHints = numberofHints;
		}

		public int getScorePerQuestion() {
			return scorePerQuestion;
		}

		public void setScorePerQuestion(int scorePerQuestion) {
			this.scorePerQuestion = scorePerQuestion;
		}

		public boolean isAttempted() {
			return isAttempted;
		}

		public void setAttempted(boolean isAttempted) {
			this.isAttempted = isAttempted;
		}

		public Question getQuestion() {
			return question;
		}

		public void setQuestion(Question question) {
			this.question = question;
		}

		public Hint getHint() {
			return hint;
		}

		public void setHint(Hint hint) {
			this.hint = hint;
		}

		public Mode getMode() {
			return mode;
		}

		public void setMode(Mode mode) {
			this.mode = mode;
		}

		public Multimedia getMultimedia() {
			return multimedia;
		}

		public void setMultimedia(Multimedia multimedia) {
			this.multimedia = multimedia;
		}

		public int getqId() {
			return qId;
		}

		public void setqId(int qId) {
			this.qId = qId;
		}
		
		
		
}
