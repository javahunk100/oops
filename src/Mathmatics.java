
public class Mathmatics {
	
	  static public int square(int num){
		  int temp=num*num;
		  return temp;
	  }
	  
	  public static void main(String[] args) throws InterruptedException {
		  
		  String str="5000";
		  int num=Integer.parseInt(str);
		  
		  for(int x=1;x<=50;x++){
			  int result=Mathmatics.square(x);
			  System.out.println("Square of "+x+" is  = "+result);
			  Thread.sleep(500);
		  }
	}

}
