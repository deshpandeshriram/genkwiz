package com.genkwiz.starter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Hint;
import com.genkwiz.starter.Service.HintService;


@RestController
public class HintController {

	@Autowired
	private HintService hintservice;
	
	
	public Hint getMode(@PathVariable Integer qId) {
		return hintservice.getHint(qId);
	}
	
	
	
}
