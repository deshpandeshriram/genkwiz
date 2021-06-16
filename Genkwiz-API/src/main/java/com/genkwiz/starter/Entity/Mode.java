package com.genkwiz.starter.Entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question_mode")
public class Mode {
	@Id
	@Column(name = "id")
	private int modeId;

	@Column(name = "mode_name")
	private String modeName;

	@Column(name = "max_time")
	private int maxTime;

	@Column(name = "max_score")
	private int maxSore;


	public Mode() {

	}

	public Mode(int modeId, String modeName, int maxTime, int maxSore) {
		super();
		this.modeId = modeId;
		this.modeName = modeName;
		this.maxTime = maxTime;
		this.maxSore = maxSore;
	}

	public int getModeId() {
		return modeId;
	}

	public void setModeId(int modeId) {
		this.modeId = modeId;
	}

	public String getModeName() {
		return modeName;
	}

	public void setModeName(String modeName) {
		this.modeName = modeName;
	}

	public int getMaxTime() {
		return maxTime;
	}

	public void setMaxTime(int maxTime) {
		this.maxTime = maxTime;
	}

	public int getMaxSore() {
		return maxSore;
	}

	public void setMaxSore(int maxSore) {
		this.maxSore = maxSore;
	}

}
