package AdapterPattern;

public class ConcreteCertificate implements  ICertificate{
    private String name;
    private double price;

    public ConcreteCertificate(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
