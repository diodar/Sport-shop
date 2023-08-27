package app;

public class Main {

    public static void main(String[] args) {

        ItemBuilder blackCap = new ItemBuilder.Builder(Items.CAP, Colors.BLACK).
                withBrandName(BrandNames.SMARTCAPS).
                withCost(250).build();
        ItemBuilder whiteCap = new ItemBuilder.Builder(Items.CAP, Colors.WHITE).
                withBrandName(BrandNames.SMARTCAPS).
                withCost(150).build();
        ItemBuilder redTShirt = new ItemBuilder.Builder(Items.TSHIRT, Colors.RED).
                withBrandName(BrandNames.ACTIVESPORTS).
                withCost(800).build();
        ItemBuilder blueTShirt = new ItemBuilder.Builder(Items.TSHIRT, Colors.BLUE).
                withBrandName(BrandNames.ACTIVESPORTS).
                withCost(400).build();

        Order order1 = new Order();
        order1.addItem(redTShirt);
        order1.addItem(whiteCap);
        System.out.println("ORDER 1:");
        order1.showItems();

        Order order2 = new Order();
        order2.addItem(blueTShirt);
        order2.addItem(blackCap);
        System.out.println("ORDER 2:");
        order2.showItems();
    }
}