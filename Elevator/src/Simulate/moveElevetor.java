package Simulate;

public class moveElevetor {
	int curFloor,desFloor;
	Floor floor;
	/*moveElevetor(int curFloor,int desFloor)
	{
		this.curFloor=curFloor;
		this.desFloor=desFloor;
	}*/
	
	void move(int floorNum,Floor floor)
	{
		curFloor=floor.getCurFloor();
		System.out.println("Current floor is: " + curFloor);
		if(floorNum>curFloor)
			up(floorNum);
		else
			down(floorNum);
	}
	
	void up(int floorNum)
	{
		curFloor=floor.getCurFloor();
		System.out.println("Moving up....");
		while(curFloor!=floorNum)
		{
			curFloor++;
			System.out.println(curFloor);
			
		}
	}
	
	void down(int floorNum)
	{
		curFloor=floor.getCurFloor();
		System.out.println("Moving down....");
		while(curFloor!=floorNum)
		{
			curFloor--;
			System.out.println(curFloor);
			
		}
	}

}