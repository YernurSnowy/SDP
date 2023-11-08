package FactoryPattern;

public class FoodFactory {
    public static Food getFood(String food){
        switch (food){
            case "Cheeseburger":
                return new Burger("Cheeseburger", 5.00);
            case "Chickenburger":
                return new Burger("Chickenburger", 4.00);
            case "Margarita":
                return new Pizza("Margarita", 8.00);
            case "Fourcheese":
                return new Pizza("Fourcheese", 7.00);
            case "Coke":
                return new Drink("Coke", 2.00);
            case "Water":
                return new Drink("Water", 1.00);
            default:
                throw new IllegalArgumentException("Invalid food type: " + food);
        }
    }
}
