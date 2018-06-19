
public class RobotMain {

	public static void main(String[] args) {
		
		Robot robot1=new Robot();
		Robot robot2=new Robot();
		Robot robot3=new Robot();
		Robot robot4=new Robot("Jacker","black",1000);
		Robot robot5=new Robot("Jadoo","yellow",500);
		robot1.show();
		System.out.println("_________________________________________");
		robot2.show();
		System.out.println("_________________________________________");
		robot3.show();
		System.out.println("");
		robot4.show();
		robot5.show();

	}

}
