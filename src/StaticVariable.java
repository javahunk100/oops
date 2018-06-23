
public class StaticVariable {

	static int count=1;
	
	public StaticVariable(){
		System.out.println("NonStaticVariable class ka DC is called");
		count++;
	}
	
	public void show(){
		System.out.println("count is  = "+count);
	}
	
	public static void main(String[] args) {
		
		StaticVariable staticVariable=new StaticVariable();
		staticVariable.show();
		
		StaticVariable staticVariable1=new StaticVariable();
		staticVariable1.show();
		
		
		StaticVariable staticVariable2=new StaticVariable();
		staticVariable2.show();
		
		System.out.println("count = "+StaticVariable.count);
		
	}
	
}
