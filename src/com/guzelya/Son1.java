package com.guzelya;

public class Son1 extends Mother{
    private String instrument;

    public Son1(int age, String name, String instrument) {
        super(age, name);
        this.instrument = instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    @Override
    public void print() {
        System.out.println("Age: " + getAge() +
                "\nName: " + getName() +
                "\nInstrument: " + getInstrument());
    }
}
