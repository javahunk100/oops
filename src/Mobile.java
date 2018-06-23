public class Mobile  {

	private String name;
	private String color="black";
	private int price;

	public Mobile() {
		name="Spice";
		color="white";
		price=23012;
	}
	
	public Mobile(String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void ringtone(){
		System.out.println("tring tring");
	}
	
	public void call(){
		System.out.println("connecting.........to other");
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
