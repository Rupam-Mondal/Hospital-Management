package AllTogether;
import java.util.Scanner;

import DoctorInformation.bookDoctor;
import DoctorInformation.infoDoctor;
import Lab_Test.examineHealth;
import Medicine.selfCheck;
import NearByCenters.search;

public class lastMethod {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		infoDoctor obj = new infoDoctor();
		bookDoctor obj1 = new bookDoctor();
		selfCheck obj2 = new selfCheck();
		search obj3 = new search();
		examineHealth obj4 = new examineHealth();
		int s1;
		String s2 = "Yes";
		String s3 = "No";
		System.out.print("Enter your Name = ");
		String a = sc.nextLine();
		System.out.println("Enter your email id = ");
		String b = sc.nextLine();
		System.out.println(a+",Welcome to our e hospital");
		do {
			System.out.println("1.DoctorInformation");
			System.out.println("2.Booking of doctor");
			System.out.println("3.Self checkup");
			System.out.println("4.Nearby centers");
			System.out.println("5.Lab test");
			System.out.println("Enter serial number = ");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				obj.details();
				break;
			case 2:
				obj1.booking();
				break;
			case 3:
				obj2.med();
				break;
			case 4:
				obj3.searchcenter();
				break;
			case 5:
				obj4.checkTest();
				break;
			}
			System.out.println("You want to try features again then press 1 else 0 = ");
			s1 = sc.nextInt();
		}
		while(s1 == 1);
		System.out.println("Thanks for using our facilites");
	}
}		

