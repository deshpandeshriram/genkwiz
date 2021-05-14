package com.genkwiz.starter.Entity;

import java.io.Serializable;
import java.util.UUID;

public class QuizId implements Serializable {
private UUID quizId;

private int qId;

QuizId(){
	
}

public QuizId(UUID quizId, int qId) {
	super();
	this.quizId = quizId;
	this.qId = qId;
}
	
	
}

