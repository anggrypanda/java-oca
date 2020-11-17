package com.methodsAndEncapsulation.exPag197;

public class Phone {
    private String model;
    private double weight;

    public void setWeight(double w) {
        if(w >=0 && w <100)
            weight = w;
    }

    public double getWeight() {
        return weight;
    }
}