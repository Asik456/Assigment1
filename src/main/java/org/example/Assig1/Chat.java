package org.example.Assig1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Chat {
    private List<Message> chat = new ArrayList<>();

    @Autowired
    private MessageFormatter messageFormatter;

    public void sendMessage(User user, String text) {
        Message message = new Message(user, text);
        chat.add(message);
        System.out.println(messageFormatter.formatMessage(message));
    }

    public List<Message> getChatHistory() {
        return chat;
    }
}
