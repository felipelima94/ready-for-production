package com.example.gettingstartedapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.gettingstartedapi.dto.MessageDTO;
import com.example.gettingstartedapi.entity.Message;
import com.example.gettingstartedapi.repository.MessageRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public Message save(MessageDTO message) {
        return messageRepository.save(new Message(message.getText()));
    }

    public List<Message> list(){
        return messageRepository.findAll();
    }

}
