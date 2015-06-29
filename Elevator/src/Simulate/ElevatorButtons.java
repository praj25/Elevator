package Simulate;

public class ElevatorButtons {
	//Boolean one,two,three,four;
	
	public void pressed(String button){
		moveElevetor elevator = null; 
		Floor floor = new Floor();
		switch(button){
			case "one": elevator.move(1,floor);break;
			case "two": elevator.move(2,floor);break;
			case "three": elevator.move(3,floor);break;
			case "four": elevator.move(4,floor);
		}
	}
	
}
