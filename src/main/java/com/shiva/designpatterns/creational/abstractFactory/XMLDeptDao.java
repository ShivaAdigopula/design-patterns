package com.shiva.designpatterns.creational.abstractFactory;

public class XMLDeptDao implements Dao {
    @Override
    public void save() {
        System.out.println("Saving Department top XML");
    }
}
