package Seminar001;

import Seminar001.Animal;

public class Dog extends Animal {

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.printf("%s ������: ���!%n", getType());
    }
}
