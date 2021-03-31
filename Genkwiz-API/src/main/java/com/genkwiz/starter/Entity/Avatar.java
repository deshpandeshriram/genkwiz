package com.genkwiz.starter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="avatar")
public class Avatar {
	@Id
    @Column(name="id")
	private int avatarId;
	
	@Column(name="avatar_name")
	private String avatarName;
	
	@Column(name="content")
	private byte[] content;
	
	@Column(name="avatar_type")
	private String avatarType;

	
	public Avatar() {
		
	}
	
	public Avatar(int avatarId, String avatarName, byte[] content, String avatarType) {
		super();
		this.avatarId = avatarId;
		this.avatarName = avatarName;
		this.content = content;
		this.avatarType = avatarType;
	}

	public int getAvatarId() {
		return avatarId;
	}

	public void setAvatarId(int avatarId) {
		this.avatarId = avatarId;
	}

	public String getAvatarName() {
		return avatarName;
	}

	public void setAvatarName(String avatarName) {
		this.avatarName = avatarName;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getAvatarType() {
		return avatarType;
	}

	public void setAvatarType(String avatarType) {
		this.avatarType = avatarType;
	}
	
	
}
