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

		@ApiResponse(code = 500, message = "Internal Server Error")

})
public class QuestionController {

	@Autowired
	private QuestionService questionservice;

	@ApiOperation(value = "Get all Questions of particular genre", notes = "Type in the genre and get all questions of the genre entered", response = Question.class, responseContainer = "List")
	@GetMapping("/questions/{questionGenre}/{modeId}/{noOfQuestions}")
	public List<Question> getQuestion(@PathVariable String questionGenre, @PathVariable int modeId,
			@PathVariable int noOfQuestions) {
		return questionservice.getQuestions(questionGenre, modeId, noOfQuestions);
	}

	@GetMapping("/question/total/{questionId}")
	public Question getEntireQuestion(@PathVariable int questionId) {

		return questionservice.getEntireQuestion(questionId);
	}

}
