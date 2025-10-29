public class Car {
    protected String brand;
    protected String model;
    protected double baseRate;

    public Car(String brand, String model, double baseRate){
        this.baseRate = baseRate;
        this.model = model;
        this.brand = brand;
    }

    public double calculateRent(int days){
        return baseRate * days;
    }

    public void displayDetails(){
        System.out.println("Brand Name: " + brand);
        System.out.println("Model Name: " + model);
        System.out.println("Base Rate per Day: " + baseRate + "BDT");
    }

}
