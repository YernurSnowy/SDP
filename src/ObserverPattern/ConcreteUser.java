package ObserverPattern;

public class ConcreteUser implements IUser{
    private String name;

    public ConcreteUser(String name){
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println(name + ": Product was added to basket!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
