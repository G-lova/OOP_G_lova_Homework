package Seminar001;

import Seminar001.Dog;
import Seminar001.Duck;
import Seminar001.Animal;
import Seminar001.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("Васька", "серый");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("пёстрый", 2);
        System.out.println(duck);
        Dog dog = new Dog("Шарик", "рыжий");
        Eagle eagle = new Eagle("bold", 2);
        Fish fish = new Fish("pearl", 0);

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(eagle);
        animals.add(fish);
//        animals.add(animal);
        animals.forEach(Animal::speak);

        System.out.println("--------летчики------------");
        animals.forEach(Animal::fly);

        System.out.println("--------пловцы------------");
        animals.forEach(Animal::swim);

        System.out.println("--------ходоки------------");
        animals.forEach(Animal::toGo);

//        System.out.println("--------охота------------");
//
//        vaska.hunt();
    }
}