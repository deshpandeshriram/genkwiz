package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="multimedia")
public class Multimedia 
{	@Id
	@Column(name="id")
	private int multiId;
	
	@Column(name="question_id")
	private int qId;
	
	@Column(name="multimedia_number")
	private int mNumber;
	
	@Column(name="multimedia_type")
	private String multiType;
	
	@Column(name="multimedia_content")
	private byte[] qMultimedia;
	
	public Multimedia() {
		
	}

	public Multimedia(int multiId, int qId, int mNumber, String multiType, byte[] qMultimedia) {
		super();
		this.multiId = multiId;
		this.qId = qId;
		this.mNumber = mNumber;
		this.multiType = multiType;
		this.qMultimedia = qMultimedia;
	}

	public int getMultiId() {
		return multiId;
	}

	public void setMultiId(int multiId) {
		this.multiId = multiId;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String getMultiType() {
		return multiType;
	}

	public void setMultiType(String multiType) {
		this.multiType = multiType;
	}

	public byte[] getqMultimedia() {
		return qMultimedia;
	}

	public void setqMultimedia(byte[] qMultimedia) {
		this.qMultimedia = qMultimedia;
	}
	 
	
	
}

