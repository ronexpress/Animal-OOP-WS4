package com.codecool.animal.animals;

public abstract class Animals {

    private String name;
    private boolean isFemale;

    public Animals(String name, boolean isMale) {
        this.name = name;
        this.isFemale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public void feed(){
        System.out.println("niam niam");
        speak();
    }

    protected abstract void speak();

}
