
public class SuperClassReferenceSubClass {
	

	  public static void main(String banaras[]) {

		  Robot robot=new  Robot();
		  robot.speak();
		  robot.walk();
		  robot.dance();
		  
		  ///assigning object of subclass inside reference of super class
		  //super class can reference an instance of subclass
		  robot=new JumpRobot(); //upcasting
		  robot.speak();
		  robot.walk();
		  robot.dance();
		  //robot.jump();
		  
		  JumpRobot jumpRobot=(JumpRobot) robot;
		  jumpRobot.speak();
		  jumpRobot.walk();
		  jumpRobot.dance();
		  jumpRobot.jump();
	  }
	  
	
}
