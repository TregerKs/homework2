package com.kseniya.homework2;

public class Main {

    public static void main(String[] args) {
        Box box = new Box();
        box.addSweet(new Candy("Аленка", 12, 9, "Шоколадная"));
        box.addSweet(new Candy("Иванка", 15, 7, "Клубничная"));
        box.addSweet(new Chocolate("Милка", 120, 79, "С орешками"));
        box.addSweet(new Chocolate("АльпенГольд", 95, 49, "Молочненький"));
        box.addSweet(new Lollipop("Петушок", 25, 15, "Карамель"));
        box.addSweet(new Lollipop("Трость", 35, 40, "Клубника с молоком"));
        box.addSweet(new Chocolate("Шоклад", 140, 102, "С ароматом счастья"));
        box.whatsInTheBox();
        System.out.println(box.totalWeight());
        System.out.println(box.totalPrice());
        box.removeSweet(2);
        box.whatsInTheBox();
        box.removeSweet();
        box.whatsInTheBox();
        box.optimizeWeight(350);
        box.optimizePrice(150);
        box.whatsInTheBox();
        System.out.println(box.totalWeight());
    }
}
