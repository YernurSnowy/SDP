package ObserverPattern;

import FactoryPattern.Food;

import java.util.List;

public interface IBasket {
    void addFood(Food food);
    void registerUser(IUser user);
    void removeUser(IUser user);
    void notifyUser();
    List<Food> getFoods();
    double getTotalPrice();
}
