import java.util.*;

public class CubeNumDemo {
	
	public static void main(String[] args) {
		//Scanner is used to take input from the keyboard
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=scan.nextInt();
		int temp=num*num*num;
		System.out.println("Cube of num "+num+" is "+temp);
	}

}
