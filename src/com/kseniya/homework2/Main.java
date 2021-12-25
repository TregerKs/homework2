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
        box.totalWeight();
        box.totalPrice();
        box.removeSweet(2);
        System.out.println(box);
        box.removeSweet();
        System.out.println(box);
        box.optimizationWeight(150);
        box.optimizationPrice(150);
    }
}
