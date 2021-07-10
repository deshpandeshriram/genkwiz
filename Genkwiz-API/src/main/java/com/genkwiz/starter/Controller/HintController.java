package com.genkwiz.starter.Controller;

import java.util.List;

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

	public List<Hint> getMode(@PathVariable Integer questionId) {
		return hintservice.getHint(questionId);
	}

}
