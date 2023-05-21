package co.develhope.websocket2.controller;

import co.develhope.websocket2.entities.ClientDTO;
import co.develhope.websocket2.entities.SimpleMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerMessage {

    @Autowired
    private SimpMessagingTemplate simpleMessagingTemplate;

    @PostMapping("/notification")
    public void sendNotification(@RequestBody SimpleMessageDTO messageDTO) {
        simpleMessagingTemplate.convertAndSend("/topic/broadcast",messageDTO);

    }
    @MessageMapping("/client-message")
    @SendTo("/topic/broadcast")
    public SimpleMessageDTO getMessage (ClientDTO clientDTO) {
        return new SimpleMessageDTO(" client " + clientDTO.getClientName(),
                " message: " + clientDTO.getClientAlert(),
                " alert: " + clientDTO.getClientMsg());

    }




}
