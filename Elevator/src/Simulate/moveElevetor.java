package Simulate;

public class moveElevetor {

	int curFloor, desFloor;
	void move(int floorNum,Floor floor)
	{
	
		int curFloor=floor.getCurFloor();
		floor.display();
		if(floorNum>curFloor)
			up(floorNum,curFloor);
		else
			down(floorNum,curFloor);
	}
	
	void up(int floorNum,int curFloor)
	{
		
		System.out.println("Moving up....");
		while(curFloor!=floorNum)
		{
			curFloor++;
			System.out.println("Floor "+curFloor);
			
		}
	}
	
	void down(int floorNum,int curFloor)
	{
	
		System.out.println("Moving down....");
		while(curFloor!=floorNum)
		{
			curFloor--;
			System.out.println("Floor "+curFloor+"....");
			
		}
	}


}
