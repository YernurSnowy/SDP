# SDP Final Project
**Group:** SE-2211 <br />
**Creators:** Yernur Koishybayev, Alinur Alipov

## Project Description
This project involves a program for a 🍔**Fast Food Restaurant**🍔. In it you can make a purchase of a product, purchase a certificate for a certain amount,
and also view your shopping cart through the apparatus. The purpose of this project is to demonstrate the use of 5 patterns:
+ Singelton
+ Observer
+ Factory
+ Decotaor
+ Adapter

### Singelton Pattern
This pattern is implemented in the ```SingletonPattern``` package. When you start the program, you are asked for a user name, after entering which a user is created.
The idea of using this pattern in this particular place is to show that the apparatus system must exist in a single instance.

### Observer Pattern
This pattern is implemented in the ```ObserverPattern``` package. Once you create a user, the program associates him with a shopping cart to further notify him of
changes to it. In code, this process is implemented through classes such as ```ConcreteBasket, ConcreteUser``` and through interfaces such as ```IBasket, IUSer```.

### Factory Pattern
This pattern is implemented in the ```FactoryPattern``` package. This pattern was used to facilitate the creation of product objects. The main class to use this
pattern is ```FoodFactory```, which uses other classes in this package to create menu items.

### Decorator Pattern
This pattern is implemented in the ```DecoratorPattern``` package. When purchasing any burger, you have the opportunity to add extra ingredients such as cheese,
jalapenos and pickles. This is implemented through the ```Cheese, Jalapeno, Pickles``` classes.

### Adapter Pattern
This pattern is implemented in the ```AdapterPattern``` package. Since the shopping cart only accepts products from the menu, this pattern was used to adapt the 
```ConcreteCertificate``` class to the product. This process occurs in the ```CertificateAdapter``` class.

## UML Diagram
![UML](https://github.com/YernurSnowy/SDP/assets/117169516/b71186a7-f217-4668-821d-a787fa5575c8)
