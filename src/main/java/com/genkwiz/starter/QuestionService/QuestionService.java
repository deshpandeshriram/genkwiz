package com.genkwiz.starter.QuestionService;

import com.genkwiz.starter.QuestionController.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.QuestionRepository.QuestionRepository;
import com.genkwiz.starter.Question.*;
@Service
 public class QuestionService {

	@Autowired
	private QuestionRepository questionRepo;
	
	private List<Question> quests=new ArrayList<>(Arrays.asList(
			new Question(278,"","","What is this poster promoting?","hard","history",""),
			new Question(289,"","","Checking??","easy","history",""),
			new Question(297,"","","Check","easy","history","")
			
			));
	
	public List<Question> getAllQuestions(){
		//return quests;
		List<Question> quests=new ArrayList<>();
		questionRepo.findAll().forEach(quests::add);
		return quests;
	}
	public List<Question> getQuestion(String hint2) {
		//return quests.stream().filter(q->q.getHint2().//equals(hint2)).findAny().get();
		return questionRepo.findByhint2(hint2);

	}
	public void addQuestion(Question q) {
		//quests.add(q);
		questionRepo.save(q);
		
	}
	public void updateQuestion(Question q, String hint2) {
		//for(int i=0;i<quests.size();i++) {
			//Question q1=quests.get(i);
			//if(q1.getHint2().equals(hint2)) {
				//quests.set(i, q);
				 questionRepo.save(q);
			//}
		//}
		
	}
	@Transactional
	public void deleteQuestion(String hint2) {
		//quests.removeIf(t->t.getHint2().equals(hint2));
		questionRepo.deleteByhint2(hint2);;
		
	}
	
}
