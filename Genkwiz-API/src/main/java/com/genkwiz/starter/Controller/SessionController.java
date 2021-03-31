package com.genkwiz.starter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.SessionManagement;
import com.genkwiz.starter.Service.SessionService;

@RestController
public class SessionController {

	@Autowired
	SessionService sessionservice;
	
	@PostMapping("/intro")
	public SessionManagement createUser(@RequestParam String username,@RequestParam int avatarId) {
		return sessionservice.createUser(username,avatarId);
	}
	
}
