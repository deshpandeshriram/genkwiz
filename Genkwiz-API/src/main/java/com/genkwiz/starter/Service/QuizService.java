package com.genkwiz.starter.Service;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.persistence.PrePersist;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Entity.QuizResponse;
import com.genkwiz.starter.Entity.SessionManagement;
import com.genkwiz.starter.Entity.Status;
import com.genkwiz.starter.Repository.QuestionRepository;
import com.genkwiz.starter.Repository.QuizRepository;
import com.genkwiz.starter.Repository.SessionRepository;

@Service
public class QuizService {

		@Autowired
		QuizRepository quizRepository;
		@Autowired
		private QuestionRepository questionRepo;
		
		@Autowired
		private SessionRepository sessionrepo;
		
		
		public List<Quiz> getQuiz(UUID quizId) {

			return quizRepository.findByQuizId(quizId);
		}
		
		@Transactional
		public List<QuizResponse> createQuiz(String genre, int mode, int noOfQuestions,UUID SessionId) {
			UUID uniqueId=UUID.randomUUID();
			
			List<Question> allQuestions,randomQuestions = new ArrayList<>();
			allQuestions=questionRepo.getQuestions(genre,mode,noOfQuestions);
			//Quiz quiz1=new Quiz();
			 

			/*SecureRandom rand = new SecureRandom();
			    for (int i = 0; i < Math.min(noOfQuestions, allQuestions.size()); i++) {
			        randomQuestions.add( allQuestions.remove( rand.nextInt( allQuestions.size() ) ));
			    }*/
			    
			//List<Integer> questionIds=randomQuestions.stream().map(Question::getqId).collect(Collectors.toList());  
			
			List<Integer> questionIds=allQuestions.stream().map(Question::getqId).collect(Collectors.toList());  
			
		
			
			 List<Quiz> quiz = new ArrayList<>();
			 List<QuizResponse> qr=new ArrayList<QuizResponse>();
			    for (int i = 0; i < noOfQuestions; i++) {
			        Quiz question = new Quiz();
			        question.setQuizId(uniqueId);
			        //question.setStatus();
			       Question ques=new Question();
			       ques=questionRepo.findByQId(questionIds.get(i));
			       
			      
			        
			        question.setqId(questionIds.get(i));
			        question.setStatus(Status.NOT_ATTEMPTED);
			       // question.setQuestion(quizRepository.findByQuestionId(questionIds.get(i)));
			        
			        quiz.add(i,question);
			      //quizRepository.save(question);
			        //quizRepository.addQuiz(question); 
			        
			        QuizResponse qr1=new QuizResponse();
			      
			        qr1.setQuestion(ques);
			        qr1.setQuiz(quiz.get(i));
			        qr.add(i,qr1);
			        
			    }
			    
			    
				
			    			 //   quizRepository.save(q);
			    
			    //return ((Quiz) quiz).getQuizId();*/
			  quizRepository.save(quiz);
			 List<SessionManagement> sm1= new ArrayList<SessionManagement>();
			
			 for(SessionManagement sm:sm1)
			 {
				 sm=sessionrepo.findBySessionIdEquals(SessionId);
			  if(sm.getQuizId()==null) {
				  sm.setQuizId(uniqueId);
			  }
			 }
			// sm1.setQuizId(uniqueId);
			  
			  
			return qr;
		    
			//return quizRepository.createQuiz(genre,mode,noOfQuestions,uniqueId);
			}
	
	    
}
			
 

		

