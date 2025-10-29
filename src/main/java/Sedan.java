public class Sedan extends Car{
    public Sedan(String brand, String model, double baseRate){
        super(brand, model, baseRate);
    }

    public double calculateRent(int days){
        return (baseRate + 200) * days;
    }
}
