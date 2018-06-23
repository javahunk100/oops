
public class NonStaticVariable {

	int count=1;
	
	public NonStaticVariable(){
		System.out.println("NonStaticVariable class ka DC is called");
		count++;
	}
	
	public void show(){
		System.out.println("count is  = "+count);
	}
	
	public static void main(String[] args) {
		NonStaticVariable staticVariable=new NonStaticVariable();
		staticVariable.show();
		
		NonStaticVariable staticVariable1=new NonStaticVariable();
		staticVariable1.show();
		
		
		NonStaticVariable staticVariable2=new NonStaticVariable();
		staticVariable2.show();
		
		//System.out.println(NonStaticVariable.count);
		
	}
	
}
