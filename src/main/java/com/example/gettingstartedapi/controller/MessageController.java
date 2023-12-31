package com.example.gettingstartedapi.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gettingstartedapi.dto.MessageDTO;
import com.example.gettingstartedapi.entity.Message;
import com.example.gettingstartedapi.service.MessageService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/message")
@RequiredArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping("/send")
    public ResponseEntity<Message> send(@RequestBody MessageDTO message) {
        return ResponseEntity.ok().body(messageService.send(message));
    }

    @GetMapping("/")
    public ResponseEntity<List<Message>> list() {
        List<Message> messages = messageService.list();
        return ResponseEntity.ok().body(messages);
    }
}
