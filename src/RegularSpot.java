public class RegularSpot implements ParkingSpot{

    int spotNumber;
    Vehicle vehicle;


    RegularSpot(int spotNumber, Vehicle vehicle){
        this.spotNumber=spotNumber;
        this.vehicle=vehicle;
    }

    @Override
    public boolean isAvailable(){
        if(vehicle==null){
            return true;
        }
        return false;
    }
    @Override
    public void  occupy(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    @Override
    public void vacate(){
        this.vehicle=null;
    }
    @Override
    public int getSpotNumber(){
        return spotNumber;
    }
    @Override
    public VehicleSize getSize(){
        return VehicleSize.MEDIUM;
    }
}
