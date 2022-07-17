package com.guzelya;

public class Daughter extends Mother{
    private String hobby;

    public Daughter(int age, String name, String hobby) {
        super(age, name);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge() +
                "\nName: " + getName() +
                "\nHobby: " + getHobby());
    }
}
