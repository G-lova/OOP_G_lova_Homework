package Seminar6.homework;

public class User implements Persistable, Reportable {
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void save(){
        System.out.println("Save user: " + this.getName());
    }

    public void report(){
        System.out.println("Report for user: " + name);
    }
}