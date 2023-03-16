package Seminar001;

public class Fish extends Animal {
    public Fish(String color, int legsCount) {
        super(color, 0);
    }

    @Override
    public void speak() {
        System.out.printf("%s: открывает рот%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s: ...%n", getType());
    }

    @Override
    public void fly() {
        System.out.printf("%s: ...%n", getType());
    }
}
