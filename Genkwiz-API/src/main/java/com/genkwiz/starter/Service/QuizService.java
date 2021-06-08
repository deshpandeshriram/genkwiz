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
		public UUID createQuiz(String genre, int mode, int noOfQuestions,UUID SessionId) {
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
			        question.setSerialNumber(i+1);
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
			  
			  
			//return qr;
		    
			 return uniqueId;
			 //return quizRepository.createQuiz(genre,mode,noOfQuestions,uniqueId);
			}

		public List<Question> getQuizStaticDetails(UUID quizId, int startingAt) {
			/*List<Quiz> quiz=new ArrayList<Quiz>();
			quiz=quizRepository.findByQuizId(quizId);
			List<Integer> quesIds=new ArrayList<Integer>();*/
			//int k=0;
			List<Quiz> quiz=new ArrayList<Quiz>();
			Quiz qu=new Quiz();
		
			int size=quizRepository.findByQuizId(quizId).size();
			for(int j=startingAt;j<=size;j++) {
			 
				qu=quizRepository.findByQuizIdAndSerialNumber(quizId,j);
				quiz.add(qu);
			}
			List<Integer> quesIds=quiz.stream().map(Quiz::getqId).collect(Collectors.toList());  
			List<Question> quesStaticDetails=new ArrayList<Question>();
			
			for(int i=0;i<quesIds.size();i++)
			{ 
				Question ques=new Question();
				 ques= questionRepo.findByQId(quesIds.get(i));
				quesStaticDetails.add(ques);
			}
			return quesStaticDetails;
		}
	
	   
}
			
 

		

