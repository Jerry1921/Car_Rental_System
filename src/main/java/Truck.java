public class Truck extends Car{
    public Truck(String brand, String model, double baseRate){
        super(brand, model, baseRate);
    }

    public double calculateRent(int days){
        return (baseRate + 500) * days;
    }
}
