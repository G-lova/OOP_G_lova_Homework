package Seminar6.srp2.util;

import Seminar6.srp2.model.Order;

import java.io.FileWriter;
import java.io.IOException;

public class JSONSaver implements Saver {
    private Order order;

    public JSONSaver(Order order) {
        this.order = order;
    }

    public void save() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ order.getQuantity() +",\n");
            writer.write("\"price\":"+ order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }



    public void setOrder(Order order) {
        this.order = order;
    }
}
