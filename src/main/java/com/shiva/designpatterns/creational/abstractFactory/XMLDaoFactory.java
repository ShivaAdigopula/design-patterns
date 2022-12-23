package com.shiva.designpatterns.creational.abstractFactory;

public class XMLDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if (type.equals("Employee")) {
            dao = new XMLEmpDao();
        }else if (type.equals("Department")) {
            dao = new XMLDeptDao();
        }
        return dao;
    }
}
