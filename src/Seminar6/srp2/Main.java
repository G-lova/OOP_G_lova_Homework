package Seminar6.srp2;

import Seminar6.srp2.model.Order;
import Seminar6.srp2.util.JSONSaver;
import Seminar6.srp2.util.Saver;
import Seminar6.srp2.view.ConsoleView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        ConsoleView consoleView = new ConsoleView();
        Order order = consoleView.inputFromConsole();
        Saver orderSaver = new JSONSaver(order);
        orderSaver.save();
    }
}
