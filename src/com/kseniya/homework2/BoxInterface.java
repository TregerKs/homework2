package com.kseniya.homework2;

import java.util.List;

public interface BoxInterface {

    void addSweet(Sweet sweet);

    void removeSweet(int index);

    void removeSweet();

    void totalWeight();

    void totalPrice();

    void optimizationWeight(int weight);

    void optimizationPrice(int weight);

    void whatsInTheBox();

}
