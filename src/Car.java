public class Car implements Vehicle{

    String licencePlate;

    Car(String licencePlate){
        this.licencePlate=licencePlate;
    }

    @Override
    public String getLicensePlate(){
        return licencePlate;
    }

    @Override
    public VehicleSize getSize(){
        return VehicleSize.MEDIUM;
    }
}
