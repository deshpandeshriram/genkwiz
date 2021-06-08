package com.genkwiz.starter.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Entity.QuizResponse;
import com.genkwiz.starter.Service.QuizService;

@RestController
public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	int modeID;
	
	@GetMapping("/quizzes/{quizId}/status")
	public List<Quiz> getQuiz(@PathVariable UUID quizId) {
	
			return quizService.getQuiz(quizId) ;
    }
	
	@GetMapping("/quizzes/{quizId}/{startingAt}")
	public List<Question> getQuizStaticDetails(@PathVariable UUID quizId,@PathVariable int startingAt){
		return quizService.getQuizStaticDetails(quizId,startingAt);
		
	}
	
	
	@PostMapping("/quizzes")
	public UUID createQuiz(@RequestParam(name="genre") String genre,@RequestParam(name="mode_name") String mode,@RequestParam(name="noOfQuestions") int noOfQuestions,@RequestParam(name="SessionId") UUID SessionId) {
		if(mode.equalsIgnoreCase("hard")) {
			modeID=3;
		}
		else if(mode.equalsIgnoreCase("medium")){
			modeID=2;
		}
		else if(mode.equalsIgnoreCase("easy")){
			modeID=1;
		}
		
		
		return quizService.createQuiz( genre, modeID, noOfQuestions,SessionId);
		
	}
	
	/*@PutMapping("/quizzes")
	public void createQuiz() {
		 quizService.createQuiz();
	}*/
	
}
