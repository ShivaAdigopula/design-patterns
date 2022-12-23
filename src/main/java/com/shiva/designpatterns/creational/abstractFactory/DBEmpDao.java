package com.shiva.designpatterns.creational.abstractFactory;

public class DBEmpDao implements Dao {
    @Override
    public void save() {
        System.out.println("saving  Employee Object to Database");
    }
}
