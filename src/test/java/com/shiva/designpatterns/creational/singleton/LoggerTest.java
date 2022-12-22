package com.shiva.designpatterns.creational.singleton;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class LoggerTest {

    @Test
    public void shouldHaveOnlyPrivateConstructor () {
        Constructor[] constructors = Logger.class.getDeclaredConstructors();
        int count = 0;
        for (Constructor constructor: constructors) {
            count++;
        }
        Assertions.assertEquals(1, count);
        Constructor constructor = constructors[0];
        Assertions.assertEquals("private", Modifier.toString(constructor.getModifiers()));
    }

    @Test
    public void shouldAbleToCreateInstanceOnlyOneInstance() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        Assertions.assertEquals(logger1, logger2);
    }

    @Test
    public void shouldNotSupportCloning()  {
        assertThrows(CloneNotSupportedException.class, () -> {
            Logger logger = Logger.getInstance();
            logger.clone();
        });
    }

    @Test
    public void shouldGenerateOnlyOneInstanceWhileDeSerialization() {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = null;
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("singleton.ser")))) {
            oos.writeObject(logger1);

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("singleton.ser")))) {
                logger2 = (Logger)ois.readObject();
            } catch (ClassNotFoundException e) {
                System.out.println("Exception in reading the file");
            }
        } catch (IOException e) {
            System.out.println("Exception in writing the file");
        }
        Assertions.assertEquals(logger1, logger2);
    }

    @Test
    public void shouldThrowErrorWhenTriesToCreateInstanceThroughConstructor() {
        Logger logger1 = Logger.getInstance();
        Constructor[] constructors = Logger.class.getDeclaredConstructors();

        for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
        }
        Constructor constructor = constructors[0];
        // to handle all InstantiationException, IllegalAccessException, IllegalArgumentException, reflect.InvocationTargetException
        assertThrows(Exception.class, () -> {
            constructor.newInstance();
        });
    }




}