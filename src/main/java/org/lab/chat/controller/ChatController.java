package org.lab.chat.controller;

import org.lab.chat.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;

	@MessageMapping("/message")
	public void chatMessage(@Payload Message message) {
		Message mess = new Message(message.getEmail(), message.getText());
		simpMessagingTemplate.convertAndSend("/topic/chat", mess);
	}

}
