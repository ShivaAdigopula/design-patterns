package com.shiva.designpatterns.singleton;

import java.io.Serializable;

public class Logger implements Cloneable, Serializable {
    private static volatile Logger instance;

    private Logger() {
        if (instance != null) {
            throw new InstantiationError("Error creating class");
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve() {
        return instance;
    }


}
