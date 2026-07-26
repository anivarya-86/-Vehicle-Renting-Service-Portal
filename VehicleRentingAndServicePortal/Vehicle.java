package VehicleRentingAndServicePortal;

import java.util.ArrayList;

public abstract class Vehicle implements Rentable{

    private String VehicleNumber;
    private String VehicleBrand;
    private double baseRentalRate;
    private String onRent;

    public Vehicle(String vehicleNumber, String vehicleBrand, double baseRentalRate, String onRent) {
        VehicleNumber = vehicleNumber;
        VehicleBrand = vehicleBrand;
        this.baseRentalRate = baseRentalRate;
        this.onRent = onRent;

    }
    public abstract double calculateRentalCost(int days);
    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getVehicleBrand() {
        return VehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        VehicleBrand = vehicleBrand;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public String isOnRent() {
        return onRent;
    }

    public void setOnRent(String onRent) {
        this.onRent = onRent;
    }

    @Override
    public void rentVehicle() {
        setOnRent("Rented ");
    }

    @Override
    public void returnVehicle() {
        setOnRent("Available");
    }
}
