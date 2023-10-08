package HomeWorkAIT.lesson27;

public class TestProduct {
    public static void main(String[] args) {
        Electronics televizor = new Electronics("sony",333.33, 12, 2);
        Electronics televizor1 = new Electronics("sharp",444.33,33,2);
        Groceries frukt = new Groceries("banan", 2.55,10,"15 september");
        Groceries ovosh = new Groceries("kartoshka",3.99,400,"26 Januar");

        // Создаем инвентарь
        Inventory inventory = new Inventory();

        // Добавляем продукты в инвентарь
        inventory.restock(televizor, 5);
        inventory.restock(televizor1, 10);
        inventory.restock(frukt, 20);
        inventory.restock(ovosh, 50);
        inventory.displayAllProducts();
        System.out.println("______________");

        // Продаем продукты
        inventory.sell(televizor, 2);
        inventory.sell(televizor1, 5);
        inventory.sell(frukt, 15);
        inventory.sell(ovosh, 40);

        // Выводим информацию о продуктах в инвентаре
        inventory.displayAllProducts();
}}