
public class HTC  extends Mobile {
	
	private String simno;
	
	public HTC(){
		super();
	}
	
	
	public HTC(String name, String color, int price,String simno) {
		super(name, color, price);
		this.simno=simno;
	}



	public void sms() {
		System.out.println("Sms is sent!!!!!!!!!!!!!!!!!!!!!!");
	}
	
	
	@Override
	public void ringtone(){
		System.out.println("ping ping ping");
	}


	@Override
	public String toString() {
		return "HTC [simno=" + simno + ", toString()=" + super.toString() + "]";
	}
	
	

}
