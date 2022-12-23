package com.shiva.designpatterns.creational.factory;

public class CheseePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheesepizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking cheesepizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheesepizza");
    }
}
