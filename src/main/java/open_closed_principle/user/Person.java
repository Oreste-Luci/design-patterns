package open_closed_principle.user;

import open_closed_principle.devices.Projector;
import open_closed_principle.devices.TV;
import open_closed_principle.remotes.RemoteControl;

public class Person {
	
	public static void main (String args[]){
	
		//Devices in the home
		Projector niceProjector = new Projector();
		TV niceLargeScreenTV = new TV();
		
		// The user's control
		RemoteControl remoteControl = RemoteControl.getInstance();
		
		remoteControl.connectToDevice(niceProjector);
		remoteControl.clickOnButon();
		
		remoteControl.connectToDevice(niceLargeScreenTV);
		remoteControl.clickOnButon();

	}
	
}
