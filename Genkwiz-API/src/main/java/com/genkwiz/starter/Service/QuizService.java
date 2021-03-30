package com.genkwiz.starter.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Repository.QuestionRepository;
import com.genkwiz.starter.Repository.QuizRepository;

@Service
public class QuizService {

		@Autowired
		QuizRepository quizRepository;
		/*@Autowired
		private QuestionRepository questionRepo;*/
		
		public List<Quiz> getQuiz(UUID quizId) {

			return quizRepository.findByQuizId(quizId);
		}
		
		public int createQuiz(String genre, int mode, int noOfQuestions) {
			UUID uniqueId=UUID.randomUUID();
			
			/*List<Question> allQuestions,randomQuestions = new ArrayList<>();
			allQuestions=questionRepo.findByQGenreAndModeId(genre,mode);
			//Quiz quiz1=new Quiz();
			
			
			SecureRandom rand = new SecureRandom();
			    for (int i = 0; i < Math.min(noOfQuestions, allQuestions.size()); i++) {
			        randomQuestions.add( allQuestions.remove( rand.nextInt( allQuestions.size() ) ));
			    }
			    
			List<Integer> questionIds=randomQuestions.stream().map(Question::getqId).collect(Collectors.toList());  
			
			 List<Quiz> quiz = new ArrayList<>();

			    for (int i = 0; i < noOfQuestions; i++) {
			        Quiz question = new Quiz();
			        question.setQuizId(uniqueId);
			        question.setqId(questionIds.get(i));
			       

			        quiz.add(question);
			    }


			    quizRepository.save(quiz);
			    return ((Quiz) quiz).getQuizId();*/
			
			
		    
			return quizRepository.createQuiz(genre,mode,noOfQuestions,uniqueId);
			}
	
	    
}
			
 

		

