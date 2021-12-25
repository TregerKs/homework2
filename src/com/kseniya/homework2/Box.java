package com.kseniya.homework2;

import java.util.ArrayList;
import java.util.List;

public class Box implements BoxInterface {
    private final List<Sweet> list;

    public Box() {
        list = new ArrayList<>();
    }

    @Override
    public void addSweet(Sweet sweet) {
        list.add(sweet);
    }

    @Override
    public void removeSweet(int index) {
        list.remove(index);
    }

    @Override
    public void removeSweet() {
        list.remove(list.size() - 1);
    }

    @Override
    public int totalWeight() {
        int totalWeight = 0;
        for (Sweet sweet : list) {
            totalWeight += sweet.weight;
        }
        return totalWeight;
    }

    @Override
    public int totalPrice() {
        int totalPrice = 0;
        for (Sweet sweet : list) {
            totalPrice += sweet.price;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "В коробке" +
                " сладости: " + list;
    }


    @Override
    public void optimizeWeight(int weight) {
        int totalWeight = totalWeight();
        while (totalWeight > weight) {
            int min = list.get(0).weight;
            int indexRemove = 0;
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i).weight) {
                    min = list.get(i).weight;
                    indexRemove = i;
                }
            }
            removeSweet(indexRemove);
            totalWeight = totalWeight();
        }
    }

    @Override
    public void optimizePrice(int weight) {
        int totalWeight = totalWeight();
        while (totalWeight > weight) {
            int min = list.get(0).price;
            int indexRemove = 0;
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i).price) {
                    min = list.get(i).price;
                    indexRemove = i;
                }
            }
            removeSweet(indexRemove);
            totalWeight = totalWeight();
        }
    }

    @Override
    public void whatsInTheBox() {
        System.out.println("В коробке: " + this.list);
    }
}
