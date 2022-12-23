package com.shiva.designpatterns.creational.abstractFactory;

public class DaoProducer {

    public static DaoAbstractFactory produce(String factoryType) {
        DaoAbstractFactory factory = null;
        if (factoryType.equals("xml")) {
            factory = new XMLDaoFactory();
        } else if (factoryType.equals("db")) {
            factory = new DBDaoFactory();
        }
        return factory;
    }
}
