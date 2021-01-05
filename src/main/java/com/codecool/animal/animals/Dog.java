package com.codecool.animal.animals;

public class Dog extends Animals{

    public Dog(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    protected void speak() {
        System.out.println("Wuff");
    }
}
