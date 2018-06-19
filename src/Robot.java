
public class Robot {
	String name="Beam";
	String color="white";
	int price=303030;
	
	Robot(){
		
	}
	
   Robot(String n,String c,int p){
		 name=n;
		 color=c;
		 price=p;
	}
	
	public void walk(){
		System.out.println("Robot is walking.....");
	}
	
	public void sing(){
		System.out.println("Robot is singing.....");
	}
	
	public void dance(){
		System.out.println("Robot is dancing.....");
	}
	
	public void show(){
		System.out.println("name = "+name);
		System.out.println("color = "+color);
		System.out.println("price = "+price);

	}
}
