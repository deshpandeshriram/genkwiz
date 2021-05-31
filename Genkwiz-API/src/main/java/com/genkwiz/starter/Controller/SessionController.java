package com.genkwiz.starter.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.SessionManagement;
import com.genkwiz.starter.Service.SessionService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class SessionController {

	@Autowired
	SessionService sessionservice;
	
	@PostMapping("/")
	//public SessionManagement createUser(@RequestParam String username,@RequestParam String avatarId) {
	public SessionManagement createSession(@RequestBody SessionManagement login) {
		//String username=((Object) login.get("username")).toString();
		//String avatarName=((Object) login.get("avatarName")).toString();
		return sessionservice.createSession(login);
	}
	
}
