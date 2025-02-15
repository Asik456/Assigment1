package org.example.Assig1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Chat chat = context.getBean(Chat.class);

        User alikhan = new User("Alikhan");
        User serik = new User("Serik");

        chat.sendMessage(alikhan, "Hey, wassup Serik!");
        chat.sendMessage(serik, "Hi, How are you?");
    }
}
