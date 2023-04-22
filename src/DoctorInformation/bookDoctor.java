package DoctorInformation;
import java.util.Scanner;

public class bookDoctor {
	int num;
	public void booking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1: Dr. Sumit Ghosh(MD),senior professor of Medical College");
		System.out.println("2: Dr. Asutosh Ranjan(Cardiotherapist), FRCP");
		System.out.println("3: Dr. Amit Agarwal(Skin specialist),Assistant professor of Medical College");
		System.out.println("4: Dr. Biswanath Laha(MD)");
		System.out.println("Press serial number to book respective doctor = ");
	
		int num = sc.nextInt();
		switch(num) 
		{
		case 1:
			System.out.println("You have succesfully booked a appointment to Dr.Sumit Ghosh");
			System.out.println("Date and time will be mailed to your registered mail id");
			break;
		case 2:
			System.out.println("You have succesfully booked a appointment to Dr. Asutosh Ranjan");
			System.out.println("Date and time will be mailed to your registered mail id");
			break;
		case 3:
			System.out.println("You have succesfully booked a appointment to Dr. Amit Agarwal");
			System.out.println("Date and time will be mailed to your registered mail id");
			break;
		case 4:
			System.out.println("You have succesfully booked a appointment to Dr. Biswanath Laha");
			System.out.println("Date and time will be mailed to your registered mail id");
			break;
		default :
			System.out.println("Pls enter only between mentioned serial number");
		}
	}
}
