package com.shiva.designpatterns.behavioural.templateMethod;

public abstract class DataRenderer {
    public String render() {
        String data = readData();
        String processedData = processData(data);
        return processedData;
    }

    public abstract String readData();

    public abstract String processData(String data);
}
