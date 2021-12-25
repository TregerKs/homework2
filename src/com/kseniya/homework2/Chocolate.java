package com.kseniya.homework2;

public class Chocolate extends Sweet {
    String supplement;

    public Chocolate(String title, int weight, int price, String supplement) {
        super(title, weight, price);
        this.supplement = supplement;
    }

    @Override
    public String toString() {
        return '\n' + "Шоколадка " + supplement +
                ", называется " + title +
                ", весит " + weight +
                " грамм, стоит " + price + " рублей";
    }
}
