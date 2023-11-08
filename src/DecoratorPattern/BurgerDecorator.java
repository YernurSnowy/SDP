package DecoratorPattern;

import FactoryPattern.Burger;
import FactoryPattern.Food;

public abstract class BurgerDecorator extends Burger {
    Food burger;
    public abstract String getName();
}
