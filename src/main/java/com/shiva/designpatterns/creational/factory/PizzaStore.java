package com.shiva.designpatterns.creational.factory;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
        }
        return pizza;
    }


}
