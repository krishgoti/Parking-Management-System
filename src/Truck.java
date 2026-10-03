public class Truck implements Vehicle{
    String licencePlate;

    Truck(String licencePlate){
        this.licencePlate=licencePlate;
    }

    @Override
    public String getLicensePlate(){
        return licencePlate;
    }

    @Override
    public VehicleSize getSize(){
        return VehicleSize.LARGE;
    }
}
