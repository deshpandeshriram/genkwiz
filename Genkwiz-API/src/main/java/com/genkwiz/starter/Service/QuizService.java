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
	private QuestionRepository questionRepository;

	@Autowired
	private SessionRepository sessionRepository;

	public List<Quiz> getQuiz(UUID quizId) {

		return quizRepository.findByQuizId(quizId);
	}

	@Transactional
	public UUID createQuiz(String genre, int mode, int noOfQuestions, UUID SessionId) {
		UUID uniqueQuizId = UUID.randomUUID();

		List<Question> questions = new ArrayList<>();
		questions = questionRepository.getQuestions(genre, mode, noOfQuestions);

		List<Integer> questionIds = questions.stream()
				.map(Question::getQuestionId)
				.collect(Collectors.toList());

		List<Quiz> quizzes = new ArrayList<>();
		
		for (int i = 0; i < noOfQuestions; i++) {
			Quiz quiz = new Quiz();
			quiz.setQuizId(uniqueQuizId);

			quiz.setSerialNumber(i + 1);
			Question question = new Question();
			question = questionRepository.findByQuestionId(questionIds.get(i));

			quiz.setQuestionId(questionIds.get(i));
			quiz.setStatus(Status.NOT_ATTEMPTED);

			quizzes.add(i, quiz);

		}

		quizRepository.save(quizzes);
		List<SessionManagement> sessionMgmt = new ArrayList<SessionManagement>();

		for (SessionManagement s : sessionMgmt) {
			s = sessionRepository.findBySessionIdEquals(SessionId);
			if (s.getQuizId() == null) {
				s.setQuizId(uniqueQuizId);
			}
		}

		return uniqueQuizId;

	}

	public List<Question> getQuizStaticDetails(UUID quizId, int startingAt) {

		List<Quiz> quizzes = new ArrayList<Quiz>();
		Quiz quiz = new Quiz();
		int size = quizRepository.findByQuizId(quizId)
				.size();
		for (int j = startingAt; j <= size; j++) {

			quiz = quizRepository.findByQuizIdAndSerialNumber(quizId, j);
			quizzes.add(quiz);
		}
		List<Integer> questionIds = quizzes.stream()
				.map(Quiz::getQuestionId)
				.collect(Collectors.toList());
		List<Question> questionStaticDetails = new ArrayList<Question>();

		for (int i = 0; i < questionIds.size(); i++) {
			Question question = new Question();
			question = questionRepository.findByQuestionId(questionIds.get(i));
			questionStaticDetails.add(question);
		}
		return questionStaticDetails;
	}

}
