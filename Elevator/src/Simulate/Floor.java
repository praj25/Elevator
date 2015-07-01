package Simulate;

public class Floor {

	int curFloor=0;

	public int getCurFloor() {
		return curFloor;
	}

	public void setCurFloor(int curFloor) {
		this.curFloor = curFloor;
		
	}
	public void display()
	{
		System.out.println("Current floor is: " + curFloor);
	}
}
