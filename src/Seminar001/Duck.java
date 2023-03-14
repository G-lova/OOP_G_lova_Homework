package Seminar001;

import Seminar001.Animal;

public class Duck extends Animal {
    public Duck(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }

    public void fly() {
        System.out.printf("%s �������!%n", getType());
    }
}
