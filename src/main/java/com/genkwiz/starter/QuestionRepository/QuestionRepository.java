package com.genkwiz.starter.QuestionRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Question.Question;

public interface QuestionRepository extends CrudRepository<Question,Integer>{

	List<Question> findByhint2(String hint2);

	void deleteByhint2(String hint2);

	

}
