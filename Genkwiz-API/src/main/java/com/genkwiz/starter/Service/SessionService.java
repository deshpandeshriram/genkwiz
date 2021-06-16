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

	public SessionManagement createUser(SessionManagement sm) {
		UUID uuid = UUID.randomUUID();
		sm.setSessionId(uuid);

		return sessionrepository.save(sm);

	}
}
