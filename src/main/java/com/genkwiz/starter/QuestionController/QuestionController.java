package com.genkwiz.starter.QuestionController;

import com.genkwiz.starter.QuestionService.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.genkwiz.starter.Question.*;
import com.genkwiz.starter.QuestionService.QuestionService;

import io.swagger.annotations.ApiOperation;

@RestController

public class QuestionController {
	
	@Autowired
	private QuestionService questionservice;
	
	@ApiOperation(value="Get all Questions",notes="",response=Question.class)
	@GetMapping("/questions/all")
	public List<Question> getAllQuestions(){
		return questionservice.getAllQuestions() ;
				
				
	}
	
	@ApiOperation(value="Get all Questions of particular genre",notes="Type in the genre and get all questions of the genre entered",response=Question.class)
	@GetMapping("/questions/{hint2}")
	public List<Question> getQuestion(@PathVariable String hint2) {
		return questionservice.getQuestion(hint2);
	}
	
	@ApiOperation(value="Post new Questions",notes="Post new questions to db",response=Question.class)
	@PostMapping("/questions/post")
	public void addQuestion(@RequestBody Question q) {
		questionservice.addQuestion(q);
	}
	
	@ApiOperation(value="Update the questions of particular type",notes="",response=Question.class)
	@PutMapping("/questions/{hint2}")
	public void updateQuestion(@RequestBody Question q,@PathVariable String hint2) {
		questionservice.updateQuestion(q,hint2);
	}
	
	@ApiOperation(value="Delete Questions of particular type",notes="",response=Question.class)
	@DeleteMapping("/questions/{hint2}")
	public void deleteQuestion(@PathVariable String hint2) {
		questionservice.deleteQuestion(hint2);
	}
	
}
