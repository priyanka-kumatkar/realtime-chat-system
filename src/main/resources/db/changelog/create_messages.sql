-- liquibase formatted sql

-- changeset Priyanka:1.1
CREATE TABLE messages (
    id VARCHAR(36) PRIMARY KEY,
    sender_id BIGINT NOT NULL,
    chat_room_id BIGINT NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

--changeset Priyanka:1.2
CREATE INDEX idx_messages_chat_room_id on  messages(chat_room_id);
CREATE INDEX idx_messages_chat_sender_id on  messages(sender_id);
