package com.genkwiz.starter.Repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.genkwiz.starter.Entity.Mode;
import com.genkwiz.starter.Entity.Question;

public interface ModeRepository extends CrudRepository<Mode,Integer> {

	Mode findByModeId(int modeId);

	
	
	
}
