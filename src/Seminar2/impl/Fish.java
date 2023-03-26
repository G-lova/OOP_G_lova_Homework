package Seminar2.impl;

import Seminar2.Animal;
import Seminar2.Swimmable;

public class Fish extends Animal implements Swimmable {
    private String name;
    private String color;
    private int legsCount;
    public Fish(String name, String color) {
        super(name, color, 0);
    }

    @Override
    public void hunt() {

    }

    @Override
    public int getSwimSpeed() {
        return 100;
    }
}
