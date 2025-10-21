import java.util.Scanner;

public class Driver {

    Vehicle bus, car, scooter;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Vehicle App Version 1.0");
        System.out.println("------------------------");
        System.out.println();

        new Driver();

    } // End of Main

    Driver() {
        System.out.println("Please Enter Bus data : ");
        bus = addVehicle();
        System.out.println(bus);
        System.out.println("Please Enter Car data : ");
        car = addVehicle();
        System.out.println(car);
        System.out.println("Please Enter Scooter data : ");
        scooter = addVehicle();
        System.out.println(scooter);
        System.out.print("Enter a Number of Passengers to Check : ");
        int passengers = input.nextInt();

        if(passengers > 5 && passengers <= 10 )
            System.out.println("Bus is Most Suitable : " + bus);
        else if(passengers <= 5 && passengers > 2)
            System.out.println("Car is Most Suitable : " + car);
        else if(passengers <= 2)
            System.out.println("Car is Most Suitable : " + car);
    } // End of Driver Constructor

    public Vehicle addVehicle() {
        System.out.print("Enter a Make : ");
        String make = input.nextLine();
        System.out.print("Enter a Model : ");
        String model = input.nextLine();
        System.out.print("Enter Number of Wheels : ");
        int wheels = input.nextInt();
        System.out.print("Enter Number of Passengers : ");
        int passengers = input.nextInt();
        input.nextLine(); // BUG in Scanner!! - Clearing buffer to read next String
        return new Vehicle(make,model,wheels,passengers);
    } // End of addVehicle Method
} // End of Driver Class
//////////////////////////////////////////////////////////////////////
