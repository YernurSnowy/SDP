package DecoratorPattern;

import FactoryPattern.Food;

public class Jalapeno extends BurgerDecorator{
    public Jalapeno(Food burger){
        this.burger = burger;
    }

    public String getName(){
        return burger.getName() + ", Jalapeno";
    }

    public double getPrice(){
        return 2 + burger.getPrice();
    }
}
