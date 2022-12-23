package com.shiva.designpatterns.creational.abstractFactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class DaoProducerTest {
    DaoProducer daoProducer = new DaoProducer();


    @Nested
    class WhenXMLFactoryTypeIsGiven {

        @Test
        public void ShouldReturnXmlDaoFactory() {
            Assertions.assertTrue(daoProducer.produce("xml") instanceof XMLDaoFactory);
        }

        @Nested
        class WhenEmployeeTypeIsGiven {
            @Test
             public void ShouldReturnXMLEmpDao() {
                DaoAbstractFactory xmlDaoFactory = daoProducer.produce("xml");
                Assertions.assertTrue(xmlDaoFactory.createDao("Employee") instanceof XMLEmpDao);
            }
        }

        @Nested
        class WhenDepartmentTypeIsGiven {
            @Test
            public void ShouldReturnXMLDeptDao() {
                DaoAbstractFactory daoFactory = daoProducer.produce("xml");
                Assertions.assertTrue(daoFactory.createDao("Department") instanceof XMLDeptDao);
            }
        }

    }


    @Nested
    class WhenDBFactoryTypeIsGiven {
        @Test
        public void ShouldReturnDBDaoFactory() {
            Assertions.assertTrue(daoProducer.produce("db") instanceof DBDaoFactory);
        }

        @Nested
        class WhenEmployeeTypeIsGiven {
            @Test
            public void ShouldReturnDBEmpDao() {
                DaoAbstractFactory daoFactory = daoProducer.produce("db");
                Assertions.assertTrue(daoFactory.createDao("Employee") instanceof DBEmpDao);
            }
        }

        @Nested
        class WhenDepartmentTypeIsGiven {
            @Test
            public void ShouldReturnDBDeptDao() {
                DaoAbstractFactory daoFactory = daoProducer.produce("db");
                Assertions.assertTrue(daoFactory.createDao("Department") instanceof DBDeptDao);
            }
        }
    }





}