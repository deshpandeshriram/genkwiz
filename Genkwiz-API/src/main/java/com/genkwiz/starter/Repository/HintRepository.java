package com.genkwiz.starter.Repository;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Hint;

public interface HintRepository extends CrudRepository<Hint,Integer >  {

	Hint findByQId(Integer qId); 

}
