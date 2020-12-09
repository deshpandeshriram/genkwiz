package com.genkwiz.starter.Question;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Question {
	
	@Id
	private int q_id;
	private String story;
	private String quest;
	private String sub_ques;
	private String hint1;
	private String hint2;
	private String hint3;
	
	
	
	public Question() {
		
	}
	
	
	public Question(int q_id, String story, String quest, String sub_ques, String hint1, String hint2,
			String hint3) {
		super();
		this.q_id = q_id;
		this.story = story;
		this.quest = quest;
		this.sub_ques = sub_ques;
		this.hint1 = hint1;
		this.hint2 = hint2;
		this.hint3 = hint3;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getQuest() {
		return quest;
	}
	public void setQuest(String quest) {
		this.quest = quest;
	}
	public String getSub_ques() {
		return sub_ques;
	}
	public void setSub_ques(String sub_ques) {
		this.sub_ques = sub_ques;
	}
	public String getHint1() {
		return hint1;
	}
	public void setHint1(String hint1) {
		this.hint1 = hint1;
	}
	public String getHint2() {
		return hint2;
	}
	public void setHint2(String hint2) {
		this.hint2 = hint2;
	}
	public String getHint3() {
		return hint3;
	}
	public void setHint3(String hint3) {
		this.hint3 = hint3;
	}
}
