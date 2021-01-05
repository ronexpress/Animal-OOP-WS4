package com.codecool.animal;

import com.codecool.animal.animals.Animals;
import com.codecool.animal.animals.Cat;
import com.codecool.animal.animals.Dog;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield",false);
        Dog dog = new Dog("Kántor", true);
        List<Animals> pets = new LinkedList<>();
        pets.add(cat);
        pets.add(dog);
        Owner owner = new Owner(pets);
        owner.feed();
    }
}
