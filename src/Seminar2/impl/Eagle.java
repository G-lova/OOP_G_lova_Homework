package Seminar2.impl;

import Seminar2.Animal;
import Seminar2.Flyable;
import Seminar2.Speakable;

public class Eagle extends Animal implements Speakable, Flyable {
    private String name;
    private int legsCount;

    public Eagle(String name) {
        super(name, null, 2);
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getFlySpeed() {
        return 100;
    }

    @Override
    public void speak() {
        System.out.printf("%s: кричит%n", getType());
    }
}
