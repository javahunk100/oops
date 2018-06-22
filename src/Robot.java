public class Robot  {
	private  String name="Bean";
	private String color="white";
	private int price=123;
	 
	 //default constructor
	 public Robot(){
	 }
	 
	 public void setValues(String name,String color,int price){
		 this.name=name;
		  this.color=color;
		  this.price=price;
	 }
	 
	 //parameterized constructor
	 public Robot(String name,String color,int price) {
		  this.name=name;
		  this.color=color;
		  this.price=price;
	 }
	 
	 public Robot(String name) {
		  this.name=name;
	 }
	 
	 public Robot(int price) {
		  this.price=price;
	 }
	 
	 
	 public void walk(){
		 System.out.println("Robot can walk");
	 }
	 
	 public void dance(){
		 System.out.println("Robot can dance");
	 }
	 
	 
	 public void speak(){
		 System.out.println("Robot can speak");
	 }

	@Override
	public String toString() {
		return "Robot [name=" + name + ", color=" + color + ", price=" + price + "]";
	}

	 
}
