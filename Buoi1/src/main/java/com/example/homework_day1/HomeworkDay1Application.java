package com.example.homework_day1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomeworkDay1Application {

    public static void main(String[] args)   {
        ApplicationContext context = SpringApplication.run(HomeworkDay1Application.class, args);
        Person person =context.getBean(Person.class);
        person.Ps_info();
    }

}
