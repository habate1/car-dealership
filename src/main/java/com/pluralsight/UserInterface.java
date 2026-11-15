package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    Dealership dealership;

    public UserInterface() {

    }

    public void display(){
        init();

        boolean appRunning = true;
        while(appRunning){

            System.out.println("\n=== Car Dealership Menu ===");
            System.out.println("1 - Find vehicles by price");
            System.out.println("2 - Find vehicles by make/model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find all vehicles by mileage");
            System.out.println("6 - Find vehicles by type");
            System.out.println("7 - List all vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("10 - Sell/Lease a Vehicle");
            System.out.println("99 - Quit");
            System.out.print("Enter option: ");

            Scanner myscanner = new Scanner(System.in);
            int input = myscanner.nextInt();

            switch (input) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRangeRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehicleRequest();
                case 8 -> processAddVehicle();
                case 9 -> processRemoveVehicle();
                case 10 -> processSellVehicle();
                case 99 -> appRunning = false;
                default -> System.out.println("Invalid option, please try again.");
            }
        }

    }

    private void init(){

        //create a dealership file manager
        DealershipFileManager dealership = new DealershipFileManager();
        this.dealership = dealership.getDealership();

        System.out.println(this.dealership);

    }

    public void processAddVehicle() {

    }

    public void processRemoveVehicle() {

    }

    public void processSellVehicle() {

    }

    public void processGetByColorRequest(){

        //ask the user the color
        //String color = "blue";
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter color:");
        String color = myscanner.next();

        displayVehicles(dealership.getVehiclesByColor(color));

    }

    public void processGetAllVehicleRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByMakeModelRequest(){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter make and model: ");
        String make = myscanner.nextLine();
        String model = myscanner.nextLine();
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));

    }

    public void processGetByYearRangeRequest(){

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter year range:");
        int minYear = myscanner.nextInt();
        int maxYear = myscanner.nextInt();

        displayVehicles(dealership.getVehiclesByYear(minYear, maxYear));

    }

    public void processGetByPriceRequest(){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter lower and higher price range");
        BigDecimal lowerPrice = myscanner.nextBigDecimal();
        BigDecimal higherPrice = myscanner.nextBigDecimal();
        displayVehicles(dealership.getVehiclesByPrice(lowerPrice, higherPrice));

    }

    public void processGetByMileageRequest(){
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter min and max mileage: ");
        int min = myscanner.nextInt();
        int max = myscanner.nextInt();

        displayVehicles(dealership.getVehiclesByMileage(min, max));

    }

    public void processGetByVehicleTypeRequest(){

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter type:");
        String type = myscanner.nextLine();


        displayVehicles(dealership.getVehiclesByType(type));

    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){

        //looper over the list and print it to the screen
        for(Vehicle vehicle : vehicles){
            //make this better, tables and such
            System.out.println(vehicle.toString());
        }

    }


}