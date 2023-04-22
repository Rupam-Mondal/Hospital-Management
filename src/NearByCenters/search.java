package NearByCenters;
import java.util.Scanner;


public class search {
	public void searchcenter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your location = ");
		String a = sc.nextLine();
		String b = "Kolkata";
		String c = "Mumbai";
		String d = "Chennei";
		String e = "Gujrat";
		String f = "Jharkhand";
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Some nearest location according to your spot is = 1.Ruby 2.Jadavpur 3.Maldah");
		}
		else if(a.equalsIgnoreCase(c)) {
			System.out.println("Some nearest location according to your spot is =  1.Shirdi 2.Mahabaleshwar");
		}
		else if(a.equalsIgnoreCase(d)) {
			System.out.println("Some nearest location according to your spot is = 1.Velor 2.Tirupati");
		}
		else if(a.equalsIgnoreCase(e)) {
			System.out.println("Some nearest location according to your spot is = 2. Nasik Image Source ...\r\n"
					+ "3. Daman Image Source ...\r\n"
					+ "4. Mumbai Image Source ...\r\n"
					+ "5. Jaisalmer Image Source");
		}
		else if(a.equalsIgnoreCase(f)) {
			System.out.println("Some nearest location according to your spot is = Jagannath Temple places to visit near Ranchi");
		}
		else {
			System.out.println("Sorry we do not have any facilites at your nearest location");
			System.out.println("You can take help of our self check features");
		}
	}
}
