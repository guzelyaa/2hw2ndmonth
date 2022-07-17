package com.guzelya;

public class Son2 extends Mother{
    private String game;

    public Son2(int age, String name, String game) {
        super(age, name);
        this.game = game;
    }

    public String getGame() {
        return game;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge() +
                "\nName: " + getName() +
                "\nGame: " + getGame());
    }
}
