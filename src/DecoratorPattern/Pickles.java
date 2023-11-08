package DecoratorPattern;

import FactoryPattern.Food;

public class Pickles extends BurgerDecorator{
    public Pickles(Food burger){
        this.burger = burger;
    }

    public String getName(){
        return burger.getName() + ", Pickles";
    }

    public double getPrice(){
        return 1 + burger.getPrice();
    }
}
