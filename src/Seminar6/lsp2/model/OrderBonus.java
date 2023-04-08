package lsp2.model;

public class OrderBonus implements Orderable {
    private int quantity;
    private int price;

    public OrderBonus(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена = %d, Скидка 100%%", quantity, price);
    }
}
