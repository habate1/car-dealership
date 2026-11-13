package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;

public class DealershipFileManager {

    private String csvFile = "inventory.csv";

    public Dealership getDealership() {

        //create the dealership variable
        Dealership dealership = null;

        try{
            //create a reader to read the csv file
            BufferedReader inventoryReader = new BufferedReader(new FileReader(csvFile));

            //read the first line (the dealership informationm
            String dealershipInfo = inventoryReader.readLine();

            //instantiate the dealership if the dealershipInfo was not null (was found in the file)
            if(dealershipInfo != null){

                String[] dealerShipParts = dealershipInfo.split("\\|");
                String name = dealerShipParts[0];
                String address = dealerShipParts[1];
                String phone = dealerShipParts[2];

                dealership = new Dealership(name, address, phone);

            }

            String vehicleLine;
            while((vehicleLine = inventoryReader.readLine()) != null){

                String[] vehicleParts = vehicleLine.split("\\|");
                int vin = Integer.parseInt(vehicleParts[0]);
                int year = Integer.parseInt(vehicleParts[1]);
                String make = vehicleParts[2];
                String model = vehicleParts[3];
                String type = vehicleParts[4];
                String color = vehicleParts[5];
                int odometer = Integer.parseInt(vehicleParts[6]);
                BigDecimal price = new BigDecimal(vehicleParts[7]);

                //create the vehicle from the parts
                Vehicle newCar = new Vehicle(vin, year, make, model, type, color, odometer, price);

                //add the vehicle to the dealership
                dealership.addVehicle(newCar);

            }
        }catch(Exception e){
            System.out.println("error reading the file" + e.getMessage());
        }
        //after we do all the work to create the dealership we return it
        return dealership;
    }
    public void saveDealership(Dealership dealership){
    }
}
