import java.util.List;
import java.util.Map;

public class ParkingManager {
    Map<VehicleSize, List<ParkingSpot>> availableSpots;
    Map<Vehicle, ParkingSpot> vehicleParkingSpotMap;

    public ParkingSpot findSpotForVehicle(Vehicle vehicle){
        List<ParkingSpot> l = availableSpots.get(vehicle.getSize());

        for (ParkingSpot i : l){
            if(i.isAvailable() == true){
                return i;
            }
        }
        return null;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot p = findSpotForVehicle(vehicle);
        if(p!=null){
            p.occupy(vehicle);
            vehicleParkingSpotMap.put(vehicle,p);
            availableSpots.get(vehicle.getSize()).remove(p);
            return p;
        }
        return null;
    }

    public void unpark(Vehicle vehicle){
        ParkingSpot p = vehicleParkingSpotMap.get(vehicle);
        if(p!=null){
            p.vacate();
            availableSpots.remove(vehicle);
            availableSpots.get(p.getSize()).add(p);
        }
    }


}
