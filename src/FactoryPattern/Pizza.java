package FactoryPattern;

public class Pizza implements Food{
    private String name;
    private double price;

    public Pizza(String name, double price){
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
