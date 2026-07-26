package VehicleRentingAndServicePortal;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber, String vehicleBrand, double baseRentalRate, String onRent) {
        super(vehicleNumber, vehicleBrand, baseRentalRate, onRent);
    }

    @Override
    public double calculateRentalCost(int days) {

        return (days * getBaseRentalRate() + (days * 100));
    }


}
