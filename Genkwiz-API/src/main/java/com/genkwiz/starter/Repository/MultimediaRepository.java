package com.genkwiz.starter.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genkwiz.starter.Entity.Multimedia;

public interface MultimediaRepository extends CrudRepository<Multimedia, Integer> {

	List<Multimedia> findByQId(int qId);

	

	

}
