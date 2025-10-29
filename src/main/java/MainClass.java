import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Display available Cars
        System.out.println("=== Welcome to Jerry Car Rentals ===");
        System.out.println("Choose Car Type:");
        System.out.println("1. Sedan");
        System.out.println("2. SUV");
        System.out.println("3. Truck");

        int choice = sc.nextInt();
        sc.nextLine();


        System.out.println("Enter Car Brand: ");
        String brand = sc.nextLine();

        System.out.println("Enter Car Model: ");
        String model = sc.nextLine();

        System.out.println("Enter Base Rate per Day: ");
        double baseRate = sc.nextDouble();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        Car selectedCar;

        switch (choice){
            case 1:
                selectedCar = new Sedan(brand, model, baseRate);
                break;
            case 2:
                selectedCar = new SUV(brand, model, baseRate);
                break;
            case 3:
                selectedCar = new Truck(brand, model, baseRate);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;

        }

        System.out.println("\n--- Car Details ---");
        selectedCar.displayDetails();
        System.out.println("Total Rent for "+ days + "days: "+selectedCar.calculateRent(days) +
                " BDT" );

        sc.close();

    }
}
