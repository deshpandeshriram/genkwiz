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

public interface QuizRepository extends CrudRepository<Quiz, QuizId> {

	List<Quiz> findByQuizId(UUID quizId);

	Quiz findByQuizIdAndSerialNumber(UUID quizId, int startingAt);

}