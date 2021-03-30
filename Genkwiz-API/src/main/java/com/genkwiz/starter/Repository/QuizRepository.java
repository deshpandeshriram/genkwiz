package com.genkwiz.starter.Repository;


import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.genkwiz.starter.Entity.Quiz;

public interface QuizRepository extends CrudRepository<Quiz,Integer>{
	//@Query("select qb,qu from question_bank qb,quiz qu where qb.q_id=qu.q_id")
	 List<Quiz> findByQuizId(int quizId) ;
     
	 
	 @Transactional
	 @Modifying
	 @Query(value="insert into quiz(question_id)select id from question_bank where genre=:genre and mode_id=:modeId limit :noOfQuestions ;"+"update quiz set id=:uuid where id is null", nativeQuery=true )
	 int createQuiz(@Param("genre")String genre,@Param("modeId") int mode,@Param("noOfQuestions") int noOfQuestions,@Param("uuid")UUID uuid);

	
	 
		


	
}
