package com.genkwiz.starter.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.genkwiz.starter.Entity.Performance;
import com.genkwiz.starter.Service.PerformanceService;

@RestController
public class PerformanceController {

	@Autowired
	PerformanceService performanceService;
	
	
	
	//@PostMapping("/quizzes/questions")
	//public Performance calculateScoreperQuestion(@RequestParam(name="quizId") UUID quizId,@RequestParam(name="questionId") int questionId,@RequestBody Performance performance) {
	//	return performanceService.calculateScorePerQuestion();
	//}
	
}
