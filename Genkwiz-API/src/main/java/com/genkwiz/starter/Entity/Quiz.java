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

@Entity
@Table(name="quiz")
/*@SecondaryTables({
	@SecondaryTable(name="question_bank",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="que_hint",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="que_mode",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id")),
	@SecondaryTable(name="multimedia",pkJoinColumns=@PrimaryKeyJoinColumn(name="q_id"))
	
})*/
@IdClass(QuizId.class)
public class Quiz {
		
		@Id
		@Column(name="id")		
		private UUID quizId;
		
		@Id
		@Column(name="question_id")
		private int qId;
		
		@Column(name="time_taken_by_user")
		private Time userTime;
		
		@Column(name="hints_used")
		private int numberofHints;
		
		@Column(name="score_per_question")
		private int scorePerQuestion;
		

	    @Enumerated(EnumType.STRING)
		@Column(name="current_status")
		Status status;
		
		//@OneToOne(mappedBy="quiz")
	    @OneToOne
		private Question questions;
		
		public Quiz() {
			
		}
		
		public Quiz(UUID quizId, int qId,Time userTime, int numberofHints, int scorePerQuestion, Status status,Question questions) {
			super();
			this.quizId = quizId;
			this.qId=qId;
			this.userTime = userTime;
			this.numberofHints = numberofHints;
			this.scorePerQuestion = scorePerQuestion;
			this.status = status;
			this.questions = questions;
			
		}
		
		

		public UUID getQuizId() {
			return quizId;
		}

		
		public void  setQuizId(UUID quizId) {
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

		
	

		public Status getStatus() {
			return status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public Question getQuestions() {
			return questions;
		}

		public void setQuestions(Question questions) {
			this.questions = questions;
		}

		public int getqId() {
			return qId;
		}

		public void setqId(int qId) {
			this.qId = qId;
		}
		
		@Override
		  public String toString() {
		      return "Quiz [Quiz Id=" + this.quizId + ", usertime=" + this.userTime + ", QuestionId=" + this.qId + ", Attempted or not=" +this.status + "]";
		  }
		
}
