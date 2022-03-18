package com.sohamkamani.demo;

public class Coffee {
    String size;
    boolean milk;

    // In order for Spring to serialize Coffee objects, we need
    // to define getter and setter methods for each attribute
    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean getMilk() {
        return this.milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    // we will use the toString method in later examples
    public String toString() {
        return "[" + size + "," + Boolean.toString(milk) + "]";
    }
}
