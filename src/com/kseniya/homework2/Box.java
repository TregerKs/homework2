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
    public void totalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            totalWeight += list.get(i).weight;
        }
        System.out.println(totalWeight);
    }

    @Override
    public void totalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < list.size(); i++) {
            totalPrice += list.get(i).price;
        }
        System.out.println(totalPrice);
    }

    @Override
    public String toString() {
        return "В коробке" +
                " сладости: " + list;
    }

    public int totalWeightForOptimization() {
        int totalWeight = 0;
        for (int i = 0; i < list.size(); i++) {
            totalWeight += list.get(i).weight;
        }
        return totalWeight;
    }

    @Override
    public void optimizationWeight(int weight) {
        int totalWeight = totalWeightForOptimization();
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
            totalWeight = totalWeightForOptimization();
        }
        System.out.println(totalWeight);
        System.out.println(list);
    }

    @Override
    public void optimizationPrice(int weight) {
        int totalWeight = totalWeightForOptimization();
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
            totalWeight = totalWeightForOptimization();
        }
        System.out.println(totalWeight);
        System.out.println(list);
    }

    @Override
    public void whatsInTheBox() {
        System.out.println("В коробке: " + this.list);
    }
}
