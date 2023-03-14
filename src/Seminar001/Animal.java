package Seminar001;

public class Animal {
    private String name;
    private final String color;
    private int legsCount;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
        this.legsCount = 4;
    }

    public Animal(String color, int legsCount) {
        this("����������", color);
        this.legsCount = legsCount;
    }

    public Animal() {
        this("����������", "������");
    }

    // todo: ���� ������, ���������� �� ��������� �������.
    //  !!!�������� �������� �� ������ ������� ������ ����� � sysout java

//    public void wakeUp() {
//        System.out.println(getType() + ": ���������");
//    }
//
//    public void findFood() {
//        String out = String.format("%s: ����� ���%n", getType());
//        System.out.println(out);
//    }
//
//    public void eat() {
//        System.out.printf("%s: ����%n", getType());
//    }
//
//    public void toPlay() {
//        System.out.printf("%s: �������%n", getType());
//    }
//
//    public void goToSleep() {
//        System.out.printf("%s: �����%n", getType());
//    }

    public void speak() {
        System.out.printf("%s: ...%n", getType());
    }

    public void hunt() {}

    //todo: ���� ������� � �������. !!! �������� ��������, �� � ������� ���� ���� ������(���� �� ����� ������������)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
