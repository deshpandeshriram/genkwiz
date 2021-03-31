package com.genkwiz.starter.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Avatar;
import com.genkwiz.starter.Service.AvatarService;
import com.genkwiz.starter.Service.HintService;

@RestController
public class AvatarController {
	
	@Autowired
	private AvatarService avatarservice;
	
	@GetMapping("/avatars")
	public List<Avatar> getAllAvatar(){
		return avatarservice.getAllAvatar();
	}
	
}
