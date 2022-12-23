package com.shiva.designpatterns.creational.factory;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaStoreTest {

    PizzaStore pizzaStore = new PizzaStore();

    @Test
    public void ShouldReturnCheeseWhenUserOrdersCheesePizza() {
        Pizza pizza = pizzaStore.orderPizza("cheese");
        Assertions.assertTrue(pizza instanceof CheseePizza);
    }

    @Test
    public void ShouldReturnChickenWhenUserOrdersChickenPizza() {
        Pizza pizza = pizzaStore.orderPizza("chicken");
        Assertions.assertTrue(pizza instanceof ChickenPizza);
    }

    @Test
    public void ShouldReturnNullWhenUserOrdersUnknownPizza() {
        Pizza pizza = pizzaStore.orderPizza("unknown");
        Assertions.assertNull(pizza);
    }
}