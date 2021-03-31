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

	public SessionManagement createUser(String username, int avatarId) {
		UUID uuid=UUID.randomUUID();
		SessionManagement sm=new SessionManagement();
		sm.setSessionId(uuid);
		sm.setUsername(username);
		sm.setAvatarId(avatarId);
		
		
		return sessionrepository.save(sm);
		
	}
}

