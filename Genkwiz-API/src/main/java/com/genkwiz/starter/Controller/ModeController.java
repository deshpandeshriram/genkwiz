package com.genkwiz.starter.Controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.genkwiz.starter.Entity.Mode;
import com.genkwiz.starter.Entity.Question;
import com.genkwiz.starter.Service.ModeService;

@RestController
public class ModeController {

	@Autowired
	private ModeService modeservice;

	// @GetMapping("/get/mode/{modeId}")
	public Mode getMode(@PathVariable int modeId) {
		return modeservice.getMode(modeId);
	}

	Mode modefirst = new Mode(1, "Easy", 55, 10);
	Mode modesecond = new Mode(2, "Medium", 75, 20);
	Mode modethird = new Mode(3, "Hard", 120, 30);

	// @RequestMapping(value="/modes/post",method=RequestMethod.POST)
	public void addModes(Mode mode1, Mode mode2, Mode mode3) {

		modeservice.addModes(modefirst, modesecond, modethird);

	}
}
