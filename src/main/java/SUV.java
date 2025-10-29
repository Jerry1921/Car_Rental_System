public class SUV extends Car{
    public SUV(String brand, String model, double baseRate){
        super(brand, model, baseRate);
    }

    public double calculateRent(int days){
        return (baseRate + 300) * days;
    }
}
