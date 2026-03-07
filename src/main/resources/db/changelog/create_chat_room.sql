--liquibase formatted sql

--changeset Priyanka:1.1
CREATE TABLE chat_room(
	id VARCHAR(36) PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	created_by BIGINT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  	FOREIGN KEY(created_by) REFERENCES users(id),

)