package FactoryPattern;

public class Burger implements Food{
    private String name;
    private double price;

    public Burger() {
    }

    public Burger(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
