package com.example.homework_day1;

import org.springframework.stereotype.Component;

@Component
public class Kimono implements Outfit{
    @Override
    public void display(){
        System.out.println("Outfit: Kimono");
    }
}
