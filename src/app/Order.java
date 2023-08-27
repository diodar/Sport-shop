package app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private final List<ItemBuilder> items;
    int total = 0;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(ItemBuilder item) {
        items.add(item);
    }

    public int getTotalPrice() {
        for (ItemBuilder item : items) {
            total += item.cost();
        }
        return total;
    }

    public void showItems() {
        AtomicInteger cnt = new AtomicInteger(1);
        for (ItemBuilder item : items) {
            System.out.print("Item" + cnt + " : " + item.color() + " " + item.item());
            System.out.print(" | Brand : " + item.brandNames());
            System.out.println(" | Cost : " + item.cost());
            cnt.incrementAndGet();
        }
        System.out.println("TOTAL AMOUNT : " + getTotalPrice() + '\n');
    }
}