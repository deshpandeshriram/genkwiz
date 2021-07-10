package com.genkwiz.starter.Service;

import com.genkwiz.starter.Controller.*;
import com.genkwiz.starter.Entity.*;
import com.genkwiz.starter.Repository.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private ModeRepository modeRepository;

	

	public List<Question> getQuestions(String questionGenre, int modeId, int noOfQuestions) {

		return questionRepository.getQuestions(questionGenre, modeId, noOfQuestions);

	}

	public Question getEntireQuestion(int questionId) {

		Question question = new Question();
		question = questionRepository.findByQuestionId(questionId);
		int modeId = question.getModeId();
		Mode mode = new Mode();

		mode = modeRepository.findByModeId(modeId);

		question.setMode(mode);

		return question;
	}

}
