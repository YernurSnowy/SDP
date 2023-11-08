package DecoratorPattern;

import FactoryPattern.Food;

public class Cheese extends  BurgerDecorator{
    public Cheese(Food burger){
        this.burger = burger;
    }

    public String getName(){
        return burger.getName() + ", Cheese";
    }

    public double getPrice(){
        return 1 + burger.getPrice();
    }
}
