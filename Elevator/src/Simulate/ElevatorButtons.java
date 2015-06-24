package Simulate;

public class ElevatorButtons {
	//Boolean one,two,three,four;
	
	public void pressed(String button){
		moveElevetor elevator = null; 
		switch(button){
			case "one": elevator.move(1);break;
			case "two": elevator.move(2);break;
			case "three": elevator.move(3);break;
			case "four": elevator.move(4);
		}
	}
	
}
