package com.shiva.designpatterns.creational.abstractFactory;

public class XMLEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving  Employee Object to XML");
    }
}
