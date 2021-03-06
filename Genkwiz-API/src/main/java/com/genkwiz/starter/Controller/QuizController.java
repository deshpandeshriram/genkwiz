package com.genkwiz.starter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Service.QuizService;

@RestController
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@GetMapping("/quiz/{quizId}")
	public List<Quiz> getQuiz(@PathVariable int quizId) {
	
			return quizService.getQuiz(quizId) ;
	}
	
}
