package com.genkwiz.starter.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.SessionManagement;
import com.genkwiz.starter.Repository.SessionRepository;

@Service
public class SessionService {

	@Autowired
	SessionRepository sessionrepository;

	/*public SessionManagement createUser(String username, String avatarId) {
		UUID uuid=UUID.randomUUID();
		SessionManagement sm=new SessionManagement();
		sm.setSessionId(uuid);
		sm.setUsername(username);
		sm.setAvatarName(avatarId);*/
		
	public SessionManagement createUser(SessionManagement sm) {
	UUID uuid=UUID.randomUUID();
	//SessionManagement sessm=new SessionManagement();
	sm.setSessionId(uuid);
	
		
		return sessionrepository.save(sm);
		
	}
}

