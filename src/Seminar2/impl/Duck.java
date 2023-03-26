package Seminar2.impl;

import Seminar2.Animal;
import Seminar2.Flyable;
import Seminar2.Speakable;
import Seminar2.Swimmable;
import Seminar2.Runnable;

public class Duck extends Animal implements Speakable, Runnable, Flyable, Swimmable {
    private String name;
    private String color;
    private int legsCount = 2;

    public Duck(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Кря!%n", getType());
    }

    @Override
    public int getRunSpeed() {
        return 3;
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        goToSleep();
    }

    public int getFlySpeed() {
        return 90;
    }

    @Override
    public int getSwimSpeed() {
        return 100;
    }

    @Override
    public int getLegsCount() {
        return legsCount;
    }


}

