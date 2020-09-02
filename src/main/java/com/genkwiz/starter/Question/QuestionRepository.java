package com.genkwiz.starter.Question;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface QuestionRepository extends CrudRepository<Question,Integer>{

	List<Question> findByhint2(String hint2);

	void deleteByhint2(String hint2);

	

}
