package Seminar2.impl;

import Seminar2.Animal;
import Seminar2.Runnable;
import Seminar2.Speakable;

public class Cat extends Animal implements Speakable, Runnable {
    public Cat(String name, String color) {
        super(name, color, 4);
    }

    public Cat(String name) {
        super(name, null, 4);
    }
    @Override
    public void speak() {
        System.out.printf("%s сказал: Meow!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        return 40;
    }
    @Override
    public void hunt() {
        wakeUp();
        findFood();
        toPlay();
        eat();
        toPlay();
        goToSleep();
    }


}
