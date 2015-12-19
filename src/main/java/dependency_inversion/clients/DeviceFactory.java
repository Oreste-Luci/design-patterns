package dependency_inversion.clients;


import dependency_inversion.processes.GeneralManufacturingProcess;
import dependency_inversion.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
	public static void main(String args[]){
		GeneralManufacturingProcess manfacturer = new SmartphoneManufacturingProcess("Iphone process");
		manfacturer.launchProcess();
	
	}
}
