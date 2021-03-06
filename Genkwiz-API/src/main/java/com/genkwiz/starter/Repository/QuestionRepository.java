package com.genkwiz.starter.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Question;

public interface QuestionRepository extends CrudRepository<Question,Integer>{

	List<Question> findByQGenreAndModeId(String qGenre,int modeId);

	void deleteByQGenre(String q_genre);

	

}
