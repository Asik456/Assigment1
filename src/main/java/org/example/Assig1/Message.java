package org.example.Assig1;

import java.time.LocalDateTime;

public class Message {
    private User user;
    private String text;
    private LocalDateTime time;

    public Message(User user, String text) {
        this.user = user;
        this.text = text;
        this.time = LocalDateTime.now();
    }

    public String getFormattedMessage() {
        return "["+time +"] "+user.getUsername()+": "+ text;
    }
}