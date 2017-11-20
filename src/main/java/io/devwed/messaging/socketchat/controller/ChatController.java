package io.devwed.messaging.socketchat.controller;

import io.devwed.messaging.socketchat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/addUser/channels/{channel}")
    @SendTo("/channels/{channel}")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, @DestinationVariable String channel) {

        return chatMessage;

    }

    @MessageMapping("/sendMessage/channels/{channel}")
    @SendTo("/channels/{channel}")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage, @DestinationVariable String channel) {

        return chatMessage;

    }


}
