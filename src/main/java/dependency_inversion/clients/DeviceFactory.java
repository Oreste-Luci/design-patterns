package dependency_inversion.clients;


import principles.dependency_inversion.processes.GeneralManufacturingProcess;
import principles.dependency_inversion.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	
	}
}
