package com.kseniya.homework2;

import java.util.List;

public interface BoxInterface {

    void addSweet(Sweet sweet);

    void removeSweet(int index);

    void removeSweet();

    int totalWeight();

    int totalPrice();

    void optimizeWeight(int weight);

    void optimizePrice(int weight);

    void whatsInTheBox();

}
