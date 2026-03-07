package com.realtime.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Message {

	@Id
	private UUID id;
	
	@Column(name="sender_id")
	private Long senderId;
	
	@Column(name="char_room_id")
	private UUID chatRoomId;
	
    @Column(columnDefinition = "TEXT")
	private String content;
    
    @CreationTimestamp
    @Column(name="created_at")
	private LocalDateTime createAt;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Long getSenderId() {
		return senderId;
	}

	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

	public UUID getChatRoomId() {
		return chatRoomId;
	}

	public void setChatRoomId(UUID chatRoomId) {
		this.chatRoomId = chatRoomId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

}
