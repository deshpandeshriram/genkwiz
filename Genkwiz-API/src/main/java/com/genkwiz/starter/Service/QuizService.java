package com.genkwiz.starter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Quiz;
import com.genkwiz.starter.Repository.QuizRepository;

@Service
public class QuizService {

		@Autowired
		QuizRepository quizRepository;

		public List<Quiz> getQuiz(int quizId) {

			return quizRepository.findByQuizId(quizId);
		}
}
