package com.realtime.chat.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {

	@Id
	private UUID id;
	
	private Long senderIdl;
	
	private UUID roomId;
	
    @Column(columnDefinition = "TEXT")
	private String content;
    
	private String timestampCreateAt;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getSenderIdl() {
		return senderIdl;
	}

	public void setSenderIdl(Long senderIdl) {
		this.senderIdl = senderIdl;
	}

	public UUID getRoomId() {
		return roomId;
	}

	public void setRoomId(UUID roomId) {
		this.roomId = roomId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTimestampCreateAt() {
		return timestampCreateAt;
	}

	public void setTimestampCreateAt(String timestampCreateAt) {
		this.timestampCreateAt = timestampCreateAt;
	}
	
	
}
