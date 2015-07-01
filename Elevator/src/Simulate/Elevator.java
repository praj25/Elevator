package Simulate;

public class Elevator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Floor f = new Floor();
		moveElevetor e = new moveElevetor();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Floor.");
		int floor = s.nextInt();
	        e.move(floor,f);
		
	}

}
