package com.genkwiz.starter.Service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Repository.QuestionRepository;
import com.genkwiz.starter.Repository.QuizRepository;

@Service
public class QuizService {

		@Autowired
		QuizRepository quizRepository;
		@Autowired
		private QuestionRepository questionRepo;
		
		public List<Quiz> getQuiz(int quizId) {

			return quizRepository.findByQuizId(quizId);
		}
		
		public int createQuiz(String genre, int mode, int noOfQuestions) {
			
			
			return quizRepository.createQuiz(genre,mode,noOfQuestions);
			
		}
 
		public void createQuiz() {
			// TODO Auto-generated method stub
			 quizRepository.createQuiz();
		}
}
