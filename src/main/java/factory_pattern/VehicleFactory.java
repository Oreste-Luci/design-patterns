package factory_pattern;

public class VehicleFactory {
	
	public Vehicle getVehicle( VehicleType vehicleType){
		return vehicleType.getVehicle();
	}
}
