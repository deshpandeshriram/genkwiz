package com.genkwiz.starter.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Hint;

public interface HintRepository extends CrudRepository<Hint, Integer> {

	List<Hint> findByQuestionId(Integer qId);

}
