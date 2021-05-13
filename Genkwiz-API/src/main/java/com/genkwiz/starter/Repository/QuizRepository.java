package com.genkwiz.starter.Repository;


import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Entity.QuizId;

public interface QuizRepository extends CrudRepository<Quiz,QuizId>{
	
	//@Query("select qb,qu from question_bank qb,quiz qu where qb.q_id=qu.q_id")
	 List<Quiz> findByQuizId(UUID quizId) ;

	
	// Question findByQuestionId(int questionId);

	//UUID saveAll(List<Quiz> quiz);
     
	/* @Transactional
	 @Modifying
	// @Query(value="insert into quiz(id) values(:uuid);"+"insert into quiz(question_id) select id from question_bank where question_bank.genre = :genre and question_bank.mode_id = :modeId", nativeQuery=true )
	 //@Query("with data (id) as (  select uuid_generate_v4())update quiz  set id=d.id from data d;")
	/* @Query(value="insert into quiz(question_id)select id from question_bank where genre=:genre and mode_id=:modeId order by random() limit :noOfQuestions ;"
	 +"update quiz set id=:uuid where id is null", nativeQuery=true )
	 int createQuiz(@Param("genre")String genre,@Param("modeId") int mode,@Param("noOfQuestions") int noOfQuestions,@Param("uuid")UUID uuid);*/

	/* @Transactional
	 @Modifying
     @Query(value="with data (id) as (  select uuid_generate_v4())update quiz  set id=d.id from data d", nativeQuery=true)
	 void createQuiz();*/

//Query:"insert into quiz (id) values(:uuid);"+"insert into quiz(question_id) select id from question_bank where question_bank.genre = :genre and question_bank.mode_id = :modeId"
}
