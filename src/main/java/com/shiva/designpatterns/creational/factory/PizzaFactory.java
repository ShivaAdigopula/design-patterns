package com.shiva.designpatterns.creational.factory;

/*
 Factory hides implementation of object creation
 */
public class PizzaFactory {

    public static Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheseePizza();
        } else if (type.equals("chicken")) {
            pizza = new ChickenPizza();
        }
        return pizza;
    }
}
