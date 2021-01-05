package com.codecool.animal.animals;

public abstract class Animals {

    private String name;
    private boolean isMale;

    public Animals(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void feed(){
        System.out.println("niam niam");
        speak();
    }

    protected abstract void speak();

}
