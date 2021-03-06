package com.genkwiz.starter.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Login;
import com.genkwiz.starter.Entity.SessionManagement;
import com.genkwiz.starter.Service.SessionService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SessionController {

	@Autowired
	SessionService sessionservice;

	@PostMapping("/home")

	public SessionManagement createUser(@RequestBody SessionManagement login) {

		return sessionservice.createUser(login);
	}

}
