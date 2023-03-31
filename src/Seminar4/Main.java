package Seminar4;


import Seminar4.gb.list.GBLinkedList;

public class Main {
    public static void main(String[] args) {
//        GBList<String> strings = new GBArrayList<>();
//        strings.add("один");
//        strings.add("два");
//        strings.add("три");
        GBLinkedList<String> strings = new GBLinkedList<>();
        strings.addLast("один");
        strings.addLast("два");
        strings.addFirst("три");
        strings.addFirst("четыре");
        System.out.println("-------GET-------");
        System.out.println(strings.get(1));
        System.out.println(strings.get(3));
        System.out.println("-------SIZE-------");
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);
        System.out.println("-------REMOVE-------");
        System.out.println(strings.remove(0));
        System.out.println(strings.size());
        System.out.println("-----FOREACH------");
        strings.forEach(System.out::println);

    }
}
