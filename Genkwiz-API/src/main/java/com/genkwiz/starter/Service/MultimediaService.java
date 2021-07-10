package com.genkwiz.starter.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Multimedia;
import com.genkwiz.starter.Repository.MultimediaRepository;

@Service
public class MultimediaService {

	@Autowired
	MultimediaRepository multimediaRepository;

	public List<Multimedia> getAllData(int qId) {
		List<Multimedia> multimediaList = new ArrayList<>();
		return multimediaRepository.findByQuestionId(qId);

	}

}
