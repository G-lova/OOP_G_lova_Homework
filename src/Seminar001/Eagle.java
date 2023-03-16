package Seminar001;

public class Eagle extends Animal{
    public Eagle(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void speak() {
        System.out.printf("%s: кричит%n", getType());
    }

    @Override
    public void swim() {
        System.out.printf("%s: подлетел к воде, коснулся лапами, взлетел%n", getType());
    }
}
