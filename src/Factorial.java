import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=scan.nextInt();
		
		int sum=1;
		for(int x=2;x<=num;x++) {
			 sum=sum*x;
		}
		
		System.out.println("Result is ...."+sum);
		
	}
}
