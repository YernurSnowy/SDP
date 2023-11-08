package ObserverPattern;

import FactoryPattern.Food;

import java.util.ArrayList;
import java.util.List;

public class ConcreteBasket implements IBasket{
    private List<Food> foods;

    public ConcreteBasket() {
        foods = new ArrayList<>();
    }

    public void addFood(Food food){
        foods.add(food);
        notifyUser();
    }

    public List<Food> getFoods(){
        return foods;
    }

    public double getTotalPrice(){
        double totalPrice = 0;
        for (Food food : foods){
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }

    private List<IUser> users = new ArrayList<>();

    @Override
    public void registerUser(IUser user) {
        users.add(user);
    }

    @Override
    public void removeUser(IUser user) {
        users.remove(user);
    }

    @Override
    public void notifyUser() {
        for (IUser user : users){
            user.update();
        }
    }
}
