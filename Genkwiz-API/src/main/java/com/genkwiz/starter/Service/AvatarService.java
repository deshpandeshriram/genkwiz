package com.genkwiz.starter.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Avatar;

import com.genkwiz.starter.Repository.AvatarRepository;

@Service
public class AvatarService {

	@Autowired
	AvatarRepository avatarRepository;

	public List<Avatar> getAllAvatar() {

		List<Avatar> avatars = new ArrayList<>();
		avatarRepository.findAll().forEach(avatars::add);
		return avatars;

	}
}
