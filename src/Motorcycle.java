public class Motorcycle implements Vehicle{

    String licencePlate;

    Motorcycle(String licencePlate){
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
