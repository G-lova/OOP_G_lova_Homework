package Seminar2;

public class Human implements Speakable, Diseaseable, Runnable, Swimmable {
    private final String name;

    public Human(String name) {
        this.name = name;
    }

//    public String getName() {
//        return name;
//    }

    @Override
    public void speak() {
        System.out.printf("%s: говорит", getName());
    }

    @Override
    public void getIll() {
        System.out.printf("%s %s заболел простудой", getType(), getName());
    }

    @Override
    public int getRunSpeed() {
        return 10;
    }

    @Override
    public int getSwimSpeed() {
        return 8;
    }

    public void treatAnimal(Animal animal) {
        System.out.printf("%s лечит %s%n", getName(), animal.toString());
    }
    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }
}

