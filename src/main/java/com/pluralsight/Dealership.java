package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Dealership {

    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;

        //create the dealership with no inventory
        this.inventory = new ArrayList<>();
    }

    /*
    All the search methods on Dealership should return null.
    The removeVehicle() method on Dealership should be empty
    Code the following methods on Dealership:

    In the Dealership constructor:
    Instantiate the inventory property as an ArrayList<Vehicle>.
     */
    public void removeVehicle() {

    }

    // adds a vehicle to the inventory
    public void addVehicle(Vehicle vehicle) {
        this.inventory.add((vehicle));

    }

    // returns the entire inventory list
    public ArrayList<Vehicle> getAllVehicles() {

        return this.inventory;

    }

    public ArrayList<Vehicle> getVehiclesByPrice(BigDecimal min, BigDecimal max) {
        ArrayList<Vehicle> priceInventory = new ArrayList<>();

        for (Vehicle vehicle : getAllVehicles()) {
            if (vehicle.getPrice().compareTo(min) >= 0) {
                if (vehicle.getPrice().compareTo(max) <= 0) {
                    priceInventory.add(vehicle);

                }
            }

        }

        return priceInventory;
    }

    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model) {

        //loop over inventory and return a list of vehicles that match the make and model

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByYear(int min, int max) {
        ArrayList<Vehicle> yearInventory = new ArrayList<>();

        for (Vehicle Vehicle : getAllVehicles()) {
            if (Vehicle.getYear() >= min && Vehicle.getYear() <= max) {
                yearInventory.add(Vehicle);
            }
        }

        return yearInventory;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {

        //loop over inventory and return a list of vehicles that match the make and model
        ArrayList<Vehicle> colorInventory = new ArrayList<>();
        for (Vehicle Vehicle : getAllVehicles()) {
            if (Vehicle.getColor().equalsIgnoreCase(color)) {
                colorInventory.add(Vehicle);
            }
        }

        return colorInventory;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max) {

        //loop over inventory and return a list of vehicles that match the min and max mileage

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

    public ArrayList<Vehicle> getVehiclesByType(String type) {

        //loop over inventory and return a list of vehicles that match the type

        //start a new list for the filtered cars

        //loop over inventory and add matching cards to filtered list

        //return the list

        return null;
    }

}
