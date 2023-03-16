package Seminar001;

import Seminar001.Animal;

public class Cat extends Animal {
    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s сказал: Meow!%n", getType());
    }

    @Override
    public void hunt() {
        wakeUp();
        findFood();
        eat();
        toPlay();
        goToSleep();
    }

    @Override
    public String toString() {
        return String.format(
                "%s {name: %s,%ncolor: %s,%nlegs: %s;%n}", getType(), getName(), getColor(), getLegsCount()
        );
    }

    private void wakeUp() {
        System.out.println(getType() + ": проснулся");
    }

    private void findFood() {
        String out = String.format("%s: нашел еду%n", getType());
        System.out.println(out);
    }

    private void eat() {
        System.out.printf("%s: поел%n", getType());
    }

    private void toPlay() {
        System.out.printf("%s: поиграл%n", getType());
    }

    private void goToSleep() {
        System.out.printf("%s: уснул%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s: прыгнул, помахал лапами%n", getType());
    }


    @Override
    public void swim() {
        System.out.printf("%s: окунул лапу в воду, сказал 'Мяу', отошел от воды%n", getType());
    }
}
