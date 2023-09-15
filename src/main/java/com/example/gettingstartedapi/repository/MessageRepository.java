package com.example.gettingstartedapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gettingstartedapi.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
