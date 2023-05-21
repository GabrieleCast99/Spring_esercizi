package co.develhope.websocket2.entities;

import lombok.Data;


public class SimpleMessageDTO {

    private String type;
    private String message;
    private String sender;

    public SimpleMessageDTO(String type, String message, String sender) {
        this.type = type;
        this.message = message;
        this.sender = sender;
    }

    public SimpleMessageDTO(){}
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
