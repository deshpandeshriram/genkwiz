package com.genkwiz.starter.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Multimedia;
import com.genkwiz.starter.Service.MultimediaService;

@RestController
public class MultimediaController {

	@Autowired
	private MultimediaService multimediaservice;

	public List<Multimedia> getAlldata(@PathVariable int questionId) throws IOException {
		return multimediaservice.getAllData(questionId);
	}

}
