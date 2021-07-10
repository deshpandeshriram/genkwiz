package com.genkwiz.starter.Entity;

import java.io.Serializable;
import java.util.UUID;

public class QuizId implements Serializable {
	private UUID quizId;

	private int questionId;

	QuizId() {

	}

	public QuizId(UUID quizId, int questionId) {
		super();
		this.quizId = quizId;
		this.questionId = questionId;
	}

}
