package Seminar2;

import Seminar2.impl.Doctor;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    /**
     * Список животных - клиентов клиники.
     */
    private final List<Animal> ANIMALS;
    private Doctor doctor;
    public VeterinaryClinic(Doctor doctor) {
        this.doctor = doctor;
        this.ANIMALS = new ArrayList<>();
    }

    public VeterinaryClinic addAnimal(Animal animal) {
        ANIMALS.add(animal);
        return this;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public List<Animal> getANIMALS() {
        return ANIMALS;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    public List<Runnable> getRunnable() {
        List<Runnable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Runnable) {
                result.add((Runnable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Swimmable> getSwimmable() {
        List<Swimmable> result = new ArrayList<>();
        for (Animal animal: getANIMALS()) {
            if (animal instanceof Swimmable) {
                result.add((Swimmable) animal);
            }
        }
        return result;
    }
}

