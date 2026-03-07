package com.realtime.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * ChatRoom Entity
 */
@Entity
public class ChatRoom {

	/**
	 *  Id in the UUID form 
	 */
	@Id
	private UUID id;
	
	@Column(name="room_name")
	private String roomName;
	
	@CreationTimestamp
	@Column(name="created_at")
	private LocalDateTime createdAt;


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

}
