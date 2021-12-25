package com.kseniya.homework2;

public class Lollipop extends Sweet {
    String taste;

    public Lollipop(String title, int weight, int price, String taste) {
        super(title, weight, price);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return '\n' + "Леденец " + taste +
                ", имя ему " + title +
                ", весит он " + weight +
                " грамм, ценою в " + price +
                " рублей";
    }
}
