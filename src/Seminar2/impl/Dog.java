package Seminar2.impl;

import Seminar2.Animal;
import Seminar2.Runnable;
import Seminar2.Speakable;
import Seminar2.Swimmable;

public class Dog extends Animal implements Speakable, Runnable, Swimmable {

    public Dog(String name, String color) {
        super(name, color, 4);
    }

    public Dog(String name) {
        super(name, null, 4);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Гав!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        return 60;
    }

    @Override
    public int getSwimSpeed() {
        return 10;
    }
    @Override
    public void hunt() {
        wakeUp();
        toPlay();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }
}