--liquibase formatted sql

--changeset Priyanka 1.1
CREATE TABLE chat_room_members (
    user_id BIGINT NOT NULL,
    chat_room_id BIGINT NOT NULL,
    joined_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (user_id, chat_room_id),
    FOREIGN KEY (user_id) REFERENCES users(id),
    FOREIGN KEY (chat_room_id) REFERENCES chat_rooms(id)
);