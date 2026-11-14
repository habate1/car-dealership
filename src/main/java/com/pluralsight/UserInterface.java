package com.pluralsight;

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
                case 99 -> appRunning = false;
                default -> System.out.println("Invalid option, please try again.");
            }


        }

    }

    private void init(){

        //create a dealership file manager
        DealershipFileManager dealership = new DealershipFileManager();
        this.dealership = dealership.getDealership();

    }

    public void processGetByColorRequest(){

        //ask the user the color
        String color = "blue";


        displayVehicles(dealership.getVehiclesByColor(color));

    }

    public void processGetAllVehicleRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByMakeModelRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByYearRangeRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByPriceRequest(){

        //displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByMileageRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    public void processGetByVehicleTypeRequest(){

        displayVehicles(dealership.getAllVehicles());

    }

    private void displayVehicles(ArrayList<Vehicle> vehicles){

        //looper over the list and print it to the screen
        for(Vehicle vehicle : vehicles){
            //make this better, tables and such
            System.out.println(vehicle.toString());
        }

    }


}