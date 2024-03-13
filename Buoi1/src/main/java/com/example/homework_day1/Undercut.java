package com.example.homework_day1;

import org.springframework.stereotype.Component;

@Component
public class Undercut implements HairStyle{
    @Override
    public void display(){
        System.out.println("HairStyle: Undercut");
    }
}
