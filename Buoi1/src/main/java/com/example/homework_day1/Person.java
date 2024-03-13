package com.example.homework_day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    @Qualifier("vest")
    private Outfit outfit;
    @Autowired
    private HairStyle hairStyle;

    public Person(){

    }

    public Person(Outfit outfit, HairStyle hairStyle){
        this.outfit = outfit;
        this.hairStyle = hairStyle;
    }

    public void Ps_info(){
        outfit.display();
        hairStyle.display();
    }
}
