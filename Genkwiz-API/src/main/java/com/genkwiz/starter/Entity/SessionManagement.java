package com.genkwiz.starter.Entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="session_management")
public class SessionManagement {

	@Id
    @Column(name="id")
	private UUID sessionId;
	
    @Column(name="user_name")
	private String username;
	
    
    @Column(name="avatar_name")
	private String avatarName;
	
    
    @Column(name="quiz_id")
	private UUID quizId;

    public SessionManagement() {
    	
    }
    
    
	public SessionManagement(UUID sessionId, String username, String avatarName, UUID quizId) {
		super();
		this.sessionId = sessionId;
		this.username = username;
		this.avatarName = avatarName;
		this.quizId = quizId;
	}


	public UUID getSessionId() {
		return sessionId;
	}


	public void setSessionId(UUID sessionId) {
		this.sessionId = sessionId;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAvatarName() {
		return avatarName;
	}


	public void setAvatarName(String avatarId) {
		this.avatarName = avatarId;
	}


	public UUID getQuizId() {
		return quizId;
	}


	public void setQuizId(UUID quizId) {
		this.quizId = quizId;
	}
    
    
}
