package com.realtime.chat.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column (name="email")
	private String email;
	
	@Column(name="password")
	private String password;
	
	@Column(name="timestamp_created_at")
	private LocalDateTime timestampCreatedAt;

	public Long getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getTimestampCreatedAt() {
		return timestampCreatedAt;
	}

	public void setTimestampCreatedAt(LocalDateTime timestampCreatedAt) {
		this.timestampCreatedAt = timestampCreatedAt;
	}

}
