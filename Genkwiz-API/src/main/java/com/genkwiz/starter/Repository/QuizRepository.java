package com.genkwiz.starter.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz,Integer>{
	//@Query("select qb,qu from question_bank qb,quiz qu where qb.q_id=qu.q_id")
	 List<Quiz> findByQuizId(int quizId) ;
	

	
}