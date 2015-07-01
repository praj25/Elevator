package Simulate;

public class ElevatorButtons {
	//Boolean one,two,three,four;
	int noOfFloors;
	
	public void setFloorNo(int noOfFloors){
		this.noOfFloors = noOfFloors;
	}
	
	public int getFloorNo(){
		return noOfFloors;
	}

	public void pressed(int button){
		moveElevetor elevator = null;
		Floor floor = new Floor();
		
		for(int i=1;i<=getFloorNo();i++){
			if(button == i)
				elevator.move(i,floor);
		}
		
	}
	
}
