package SingeltonPattern;

import ObserverPattern.ConcreteUser;

public class UserSingelton {
    private static ConcreteUser concreteUser;

    public static ConcreteUser getInstance() {
        if (concreteUser == null) {
            concreteUser = new ConcreteUser("Default User");
        }
        return concreteUser;
    }

    public static void setUserName(String name) {
        concreteUser.setName(name);
    }
}
