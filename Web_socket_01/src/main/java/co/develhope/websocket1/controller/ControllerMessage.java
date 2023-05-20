package co.develhope.websocket1.controller;

import co.develhope.websocket1.entities.SimpleMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerMessage {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @PostMapping("/notification")
    public void sendNotification(@RequestBody SimpleMessageDTO messageDTO) {
        simpMessagingTemplate.convertAndSend("/topic/broadcast",messageDTO);

    }





}
