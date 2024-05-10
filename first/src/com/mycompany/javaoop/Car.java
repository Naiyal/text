package com.mycompany.javaoop;
/**
 * Car
 */
public class Car {

    private String name;
    private int maxSpeed;
    private float price;
    private int model;

    public void setName (String n) {
        name = n;
    }
    public String getName () {
        return name;
    }
    public void setModel (int m) {
        if (m>2014)
            model = m ;
        else
            System.out.println("not");
    }
    public int getModel() {
        return model;
    }
}