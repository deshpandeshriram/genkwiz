package com.genkwiz.starter.Service;

import com.genkwiz.starter.Controller.*;
import com.genkwiz.starter.Entity.*;
import com.genkwiz.starter.Repository.QuestionRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
 public class QuestionService {

	@Autowired
	private QuestionRepository questionRepo;
	
	//private List<Question> quests=new ArrayList<>(Arrays.asList(
		//	new Question(278,"","","What is this poster promoting?","hard","history",""),
		//	new Question(289,"","","Checking??","easy","history",""),
		//	new Question(297,"","","Check","easy","history","")
			
			//));
	
	public List<Question> getQuestions(){
		//return quests;
		List<Question> questions=new ArrayList<>();
		questionRepo.findAll().forEach(questions::add);
		return questions;
	}
	public List<Question> getQuestion(String qGenre,int modeId) {
		//return quests.stream().filter(q->q.getHint2().//equals(hint2)).findAny().get();
		return questionRepo.findByQGenreAndModeId(qGenre,modeId);

	}
	//public void addQuestion(Question q) {
		//quests.add(q);
	//	questionRepo.save(q);
	//	
	//}
	public void updateQuestion(Question question, String qGenre) {
		//for(int i=0;i<quests.size();i++) {
			//Question q1=quests.get(i);
			//if(q1.getHint2().equals(hint2)) {
				//quests.set(i, q);
				 questionRepo.save(question);
			//}
		//}
		
	}
	@Transactional
	public void deleteQuestion(String qGenre) {
		//quests.removeIf(t->t.getHint2().equals(hint2));
		questionRepo.deleteByQGenre(qGenre);;
		
	}
	public void submitAnswer(String answer) {
		 //check answer
		
	}
	
}
