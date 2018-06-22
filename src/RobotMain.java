
public class RobotMain {

	  public static void main(String ooo[]) {
		  Robot temp1=new Robot();
		//  temp1.color="yellow";
		  
		  //temp1.setValues(name, color, price);
		  temp1.speak();
		  temp1.walk();
		  temp1.dance();
		  System.out.println(temp1);
		  Robot temp2=new Robot("Jacker","red",4000);
		  System.out.println(temp2);
	  }
}
