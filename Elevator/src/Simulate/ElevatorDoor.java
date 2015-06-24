package Simulate;

public class ElevatorDoor {
	
	Boolean doorOpen;
	public void openElevatorDoor(){
		doorOpen = true;
		System.out.println("Door Opened...");
	}
	public void closeElevatorDoor(){
		doorOpen = false;
		System.out.println("Door Closed...");
	}
}
