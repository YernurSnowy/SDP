import AdapterPattern.CertificateAdapter;
import AdapterPattern.ConcreteCertificate;
import AdapterPattern.ICertificate;
import DecoratorPattern.Cheese;
import DecoratorPattern.Jalapeno;
import DecoratorPattern.Pickles;
import FactoryPattern.Food;
import FactoryPattern.FoodFactory;
import ObserverPattern.ConcreteBasket;
import ObserverPattern.IBasket;
import ObserverPattern.IUser;
import SingeltonPattern.UserSingelton;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static IUser concreteUser = UserSingelton.getInstance();
    static IBasket basket = new ConcreteBasket();
    static Food cheeseburger;
    static Food chickenburger;
    static Food margarita;
    static Food fourcheese;
    static Food coke;
    static Food water;

    public static void main(String[] args) {
        greetings();
        int command;
        do{
            System.out.println("What do you want to do?");
            System.out.println("1) Buy food");
            System.out.println("2) Buy certificate");
            System.out.println("3) See a basket");
            System.out.println("4) Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    buyFood();
                    break;
                case 2:
                    buyCertificate();
                    break;
                case 3:
                    seeBasket();
            }
        } while (command != 4);
    }

    public static void greetings(){
        System.out.println("Welcome to Fast Food shop!");
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        concreteUser.setName(name);
        basket.registerUser(concreteUser);
        System.out.println("Hello " + concreteUser.getName() + "!");
    }

    public static void buyFood(){
        int command;
        do {
            System.out.println("What food do you want?");
            System.out.println("1) Burger");
            System.out.println("2) Pizza");
            System.out.println("3) Drink");
            System.out.println("4) Exit");
            command = scanner.nextInt();
            switch (command){
                case 1:
                    buyBurger();
                    break;
                case 2:
                    buyPizza();
                    break;
                case 3:
                    buyDrink();
                    break;
            }
        }while (command != 4);
    }

    public static void buyBurger(){
        int command;
        System.out.println("What burger do you want?");
        System.out.println("1) Cheeseburger - 5.00$");
        System.out.println("2) Chickenburger - 4.00$");
        command = scanner.nextInt();
        if (command == 1){
            cheeseburger = FoodFactory.getFood("Cheeseburger");
            System.out.println("Good choice!");
            int command2;
            do {
                System.out.println("Add extra ingredients?");
                System.out.println("1) Cheese - 1.00$");
                System.out.println("2) Jalapeno - 2.00$");
                System.out.println("3) Pickles - 1.00$");
                System.out.println("4) That's all!");
                command2 = scanner.nextInt();
                switch (command2){
                    case 1:
                        cheeseburger = new Cheese(cheeseburger);
                        System.out.println("Cheese was added!");
                        break;
                    case 2:
                        cheeseburger = new Jalapeno(cheeseburger);
                        System.out.println("Pickles was added!");
                        break;
                    case 3:
                        cheeseburger = new Pickles(cheeseburger);
                        System.out.println("Jalapeno was added!");
                        break;
                }
            }while (command2 != 4);
            basket.addFood(cheeseburger);
        } else if (command == 2){
            chickenburger = FoodFactory.getFood("Chickenburger");
            System.out.println("Good choice!");
            int command2;
            do {
                System.out.println("Add extra ingredients?");
                System.out.println("1) Cheese - 1.00$");
                System.out.println("2) Jalapeno - 2.00$");
                System.out.println("3) Pickles - 1.00$");
                System.out.println("4) That's all!");
                command2 = scanner.nextInt();
                switch (command2){
                    case 1:
                        chickenburger = new Cheese(chickenburger);
                        System.out.println("Cheese was added!");
                        break;
                    case 2:
                        chickenburger = new Jalapeno(chickenburger);
                        System.out.println("Pickles was added!");
                        break;
                    case 3:
                        chickenburger = new Pickles(chickenburger);
                        System.out.println("Jalapeno was added!");
                        break;
                }
            }while (command2 != 4);
            basket.addFood(chickenburger);
        } else {
            System.out.println("Incorrect product!");
        }
    }

    public static void buyPizza(){
        int command;
        System.out.println("What pizza do you want?");
        System.out.println("1) Margarita - 8.00$");
        System.out.println("2) Fourcheese - 7.00$");
        command = scanner.nextInt();
        switch (command){
            case 1:
                margarita = FoodFactory.getFood("Margarita");
                basket.addFood(margarita);
                break;
            case 2:
                fourcheese = FoodFactory.getFood("Fourcheese");
                basket.addFood(fourcheese);
                break;
        }
    }

    public static void buyDrink(){
        int command;
        System.out.println("What drink do you want?");
        System.out.println("1) Coke - 2.00$");
        System.out.println("2) Water - 1.00$");
        command = scanner.nextInt();
        switch (command){
            case 1:
                coke = FoodFactory.getFood("Coke");
                basket.addFood(coke);
                break;
            case 2:
                water = FoodFactory.getFood("Water");
                basket.addFood(water);
                break;
        }
    }

    public static void buyCertificate(){
        int amount;
        System.out.println("How much do you want to get a certificate for?");
        amount = scanner.nextInt();
        ICertificate certificate = new ConcreteCertificate("Gift Certificate", amount);
        Food certificateAdapter = new CertificateAdapter(certificate);
        basket.addFood(certificateAdapter);
        System.out.println("Certificate was added to Basket!");
    }

    public static void seeBasket(){
        for (Food food : basket.getFoods()){
            System.out.println(food.getName() + " - " + food.getPrice() + "$");
        }
        System.out.println("Total: " + basket.getTotalPrice() + "$");
    }
}