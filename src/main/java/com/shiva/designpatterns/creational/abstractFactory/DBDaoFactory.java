package com.shiva.designpatterns.creational.abstractFactory;

public class DBDaoFactory extends DaoAbstractFactory {
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("Employee")) {
            dao = new DBEmpDao();
        } else if (type.equals("Department")) {
            dao = new DBDeptDao();
        }
        return dao;
    }
}
