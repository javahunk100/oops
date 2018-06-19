import java.util.Scanner;

public class GreetName {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the your good name please");
		String name=scan.nextLine();
		System.out.println("Hello Mr. "+name);
		
	}
}
