package com.genkwiz.starter.Entity;

import java.sql.Time;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "performance")
public class Performance {

	@Column(name = "id")
	@Id
	private int id;
	@Column(name = "quiz_id")
	private UUID quizId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "no_of_attempted")
	private int noOfAttempted;
	@Column(name = "no_of_correct_ans")
	private int noOfCorrectAns;
	@Column(name = "final_score")
	private int finalScore;
	@Column(name = "start_time")
	private Time startTime;
	@Column(name = "end_time")
	private Time endTime;
	@Column(name = "total_time_taken")
	private int totalTimeTaken;

	public Performance() {

	}

	public Performance(int id, UUID quizId, int userId, int noOfAttempted, int noOfCorrectAns, int finalScore,
			Time startTime, Time endTime, int totalTimeTaken) {
		super();
		this.id = id;
		this.quizId = quizId;
		this.userId = userId;
		this.noOfAttempted = noOfAttempted;
		this.noOfCorrectAns = noOfCorrectAns;
		this.finalScore = finalScore;
		this.startTime = startTime;
		this.endTime = endTime;
		this.totalTimeTaken = totalTimeTaken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UUID getQuizId() {
		return quizId;
	}

	public void setQuizId(UUID quizId) {
		this.quizId = quizId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getNoOfAttempted() {
		return noOfAttempted;
	}

	public void setNoOfAttempted(int noOfAttempted) {
		this.noOfAttempted = noOfAttempted;
	}

	public int getNoOfCorrectAns() {
		return noOfCorrectAns;
	}

	public void setNoOfCorrectAns(int noOfCorrectAns) {
		this.noOfCorrectAns = noOfCorrectAns;
	}

	public int getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public int getTotalTimeTaken() {
		return totalTimeTaken;
	}

	public void setTotalTimeTaken(int totalTimeTaken) {
		this.totalTimeTaken = totalTimeTaken;
	}

}
