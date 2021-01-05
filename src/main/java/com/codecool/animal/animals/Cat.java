package com.codecool.animal.animals;

public class Cat extends Animals{

    public Cat(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    protected void speak() {
        System.out.println("Meow");
    }
}
