package Seminar6.srp2.view;

import Seminar6.srp2.model.Order;

import java.util.Scanner;

public class ConsoleView {
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int quantity = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));

        return new Order(clientName, product, quantity, price);
    }
}
