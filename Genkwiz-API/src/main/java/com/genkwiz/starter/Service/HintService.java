package com.genkwiz.starter.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Hint;
import com.genkwiz.starter.Repository.HintRepository;

@Service
public class HintService {

	@Autowired
	HintRepository hintRepository;
	
	public Hint getHint(Integer qId) {

		return hintRepository.findByQId(qId) ;
	}

}
