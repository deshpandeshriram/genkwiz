package com.genkwiz.starter.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.genkwiz.starter.Entity.Mode;
import com.genkwiz.starter.Repository.ModeRepository;

@Service
public class ModeService {

	@Autowired
	private ModeRepository modeRepository;

	public Mode getMode(int modeId) {

		return modeRepository.findByModeId(modeId);
	}

	public void addModes(Mode mode1, Mode mode2, Mode mode3) {
		modeRepository.save(mode1);
		modeRepository.save(mode2);
		modeRepository.save(mode3);
	}

}
