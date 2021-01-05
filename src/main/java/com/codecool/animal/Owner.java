package com.codecool.animal;

import com.codecool.animal.animals.Animals;

import java.util.ArrayList;
import java.util.List;

public class Owner {
    List<Animals> animals;

    public Owner(List<Animals> animals) {
        this.animals = animals;
    }

    public void feed(){
        for(Animals animal : animals){
            animal.feed();
        }
    }
}
