package com.guzelya;

public abstract class Mother implements Printable{

    private int age;
    private String name;

    public Mother(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
