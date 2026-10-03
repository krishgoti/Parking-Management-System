public interface ParkingSpot {

    boolean isAvailable();
    public void  occupy(Vehicle vehicle);
    public void vacate();
    int getSpotNumber();
    VehicleSize getSize();
}
