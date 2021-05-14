package com.genkwiz.starter.Controller;

import com.genkwiz.starter.Entity.*;
import com.genkwiz.starter.Service.*;

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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(tags = "GenKwiz", description = "REST API for GenKwiz")
@ApiResponses(value = {
        
        @ApiResponse(code=500, message = "Internal Server Error")
        
 })
public class QuestionController {
	
	@Autowired
	private QuestionService questionservice;
	
	@ApiOperation(value="Get Questions",notes="",response=Question.class,responseContainer="List")
	@GetMapping("/questions")
	public List<Question> getQuestions(){
		return questionservice.getQuestions() ;
				
				
	}
	
	@ApiOperation(value="Get all Questions of particular genre",notes="Type in the genre and get all questions of the genre entered",response=Question.class,responseContainer="List")
	@GetMapping("/questions/{qGenre}/{modeId}/{noOfQuestions}")
	public List<Question> getQuestion(@PathVariable String qGenre,@PathVariable int modeId,@PathVariable int noOfQuestions) {
		return questionservice.getQuestion(qGenre,modeId,noOfQuestions);
	}
	
	//@ApiOperation(value="Post Answers",notes="Submit Answer",response=Question.class)
	//@PostMapping("/answer")
	//public void addQuestion(@RequestBody Question q) {
	//	questionservice.addQuestion(q);
	//}
	
	@ApiOperation(value="Submit Answers",notes="Submit Answer",response=Question.class,responseContainer="List")
	@PostMapping("/answer")
	public void addQuestion(@RequestBody String answer) {
		questionservice.submitAnswer(answer);
	}
	
	@ApiOperation(value="Update the questions of particular type",notes="",response=Question.class,responseContainer="List")
	@PutMapping("/questions/{qGenre}")
	public void updateQuestion(@RequestBody Question question,@PathVariable String qGenre) {
		questionservice.updateQuestion(question,qGenre);
	}
	
	@ApiOperation(value="Delete Questions of particular type",notes="",response=Question.class,responseContainer="List")
	@DeleteMapping("/questions/{qGenre}")
	public void deleteQuestion(@PathVariable String qGenre) {
		questionservice.deleteQuestion(qGenre);
	}
	
	@GetMapping("/question/total/{qId}")
	public Question getEntireQuestion(@PathVariable int qId) {
		
		return questionservice.getEntireQuestion(qId);
	}
	
	
	
}
