package VehicleRentingAndServicePortal;

public  class Car extends Vehicle {
    public Car(String vehicleNumber, String vehicleBrand, double baseRentalRate, String onRent) {
        super(vehicleNumber, vehicleBrand, baseRentalRate, onRent);
    }

    @Override
    public double calculateRentalCost(int days) {

        return (days * getBaseRentalRate()) + (days);
    }
}
