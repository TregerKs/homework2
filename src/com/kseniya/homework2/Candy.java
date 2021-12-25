package com.kseniya.homework2;

public class Candy extends Sweet {
    String filling;

    public Candy(String title, int weight, int price, String filling) {
        super(title, weight, price);
        this.filling = filling;
    }

    @Override
    public String toString() {
        return '\n' +"Конфета " +
                filling +
                ", называется " + title  +
                ", весит " + weight +
                " грамм, стоит " + price +
                " рублей";
    }
}
