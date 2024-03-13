package com.example.homework_day1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mohican implements HairStyle{
    @Override
    public void display(){
        System.out.println("HairStyle: Mohican");
    }
}
