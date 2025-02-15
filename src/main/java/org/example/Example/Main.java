package org.example.Example;
import org.example.Example.Parrot;
import org.example.Example.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println(parrot.getName());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        parrot.setName("Alina");
        System.out.println(parrot.getName());
    }
}