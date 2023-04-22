package Lab_Test;
import java.util.Scanner;

public class examineHealth{
	public void checkTest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("You can book your lab test near your location");
		System.out.println("Enter your free day = ");
		String b = sc.nextLine();
		System.out.println("Your appointment is booked on "+b);
		System.out.println("Our member will discus with you about the time later");
	}
}
