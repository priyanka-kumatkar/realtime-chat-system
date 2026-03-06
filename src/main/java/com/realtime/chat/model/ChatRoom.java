package com.realtime.chat.model;

import java.time.LocalDateTime;
import java.util.UUID;

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
	
	private String roomName;
	
	private LocalDateTime timestampCreatedAt;


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

	public LocalDateTime getTimestampCreatedAt() {
		return timestampCreatedAt;
	}

	public void setTimestampCreatedAt(LocalDateTime timestampCreatedAt) {
		this.timestampCreatedAt = timestampCreatedAt;
	}

	

}
