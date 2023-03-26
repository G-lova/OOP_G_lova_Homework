package Seminar2;

import Seminar2.impl.*;

import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Doctor doctor1 = new Doctor("Айболит");
        Doctor doctor2 = new Doctor("Иванов");
        doctors.add(doctor1);
        doctors.add(doctor2);

        VeterinaryClinic clinic = new VeterinaryClinic(doctor1);

        clinic
                .addAnimal(new Cat("Барсик", "серый"))
                .addAnimal(new Duck("Дональд", "пёстрый"))
                .addAnimal(new Dog("Барбос", "белый"))
                .addAnimal(new Eagle("Зоркий"))
                .addAnimal(new Fish("Рыбка", "золотая"));

        System.out.println("-----Эпидемия-----");
        for (Animal animal: clinic.getANIMALS()) {
            animal.getIll();
        }

        System.out.println("-----Список докторов:-----");
        for (Doctor d: doctors) {
            System.out.println(d.getName());
        }

        System.out.println("-----Лечение-----");
        for (Animal a: clinic.getANIMALS()) {
            clinic.getDoctor().treatAnimal(a);
        }

        System.out.println("-----Speakable-----");
        System.out.println(clinic.getSpeakable());
        clinic.getSpeakable().forEach(Speakable::speak);

        System.out.println("-----Runnable-----");
        System.out.println(clinic.getRunnable());

        System.out.println("Скорость бега:");
        for (Runnable r: clinic.getRunnable()) {
            System.out.printf("%s: %d%n", r.getClass().getSimpleName(), r.getRunSpeed());
        }

        System.out.println("-----Flyable-----");
        System.out.println(clinic.getFlyable());
        System.out.println("Скорость полета:");
        for (Flyable r: clinic.getFlyable()) {
            System.out.printf("%s: %d%n", r.getClass().getSimpleName(), r.getFlySpeed());
        }

        System.out.println("-----Swimmable-----");
        System.out.println(clinic.getSwimmable());
        System.out.println("Скорость в воде:");
        for (Swimmable r: clinic.getSwimmable()) {
            System.out.printf("%s: %d%n", r.getClass().getSimpleName(), r.getSwimSpeed());
        }

    }
}