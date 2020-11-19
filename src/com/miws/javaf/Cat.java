package com.miws.javaf;

public class Cat extends Human{

    private String color;

    public Cat(){}

    public Cat(String name, int age)
    {
        super(name, age);
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
}
