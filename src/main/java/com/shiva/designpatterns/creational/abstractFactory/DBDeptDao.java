package com.shiva.designpatterns.creational.abstractFactory;

public class DBDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Department top Database");
    }
}
