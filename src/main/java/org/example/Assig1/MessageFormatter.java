package org.example.Assig1;
import org.springframework.stereotype.Component;

@Component
public class MessageFormatter {
    public String formatMessage(Message message) {
        return message.getFormattedMessage();
    }
}
