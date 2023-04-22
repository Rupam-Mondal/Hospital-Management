package Medicine;
import java.util.Scanner;

public class selfCheck {
	public void med() {
		Scanner sc = new Scanner(System.in);
		System.out.println("We can suggest you medicines according to your disease");
		System.out.println("1.Fever");
		System.out.println("2.cough");
		System.out.println("3.Headache");
		System.out.println("4.Bellyache");
		System.out.println("5.Chest pain");
		System.out.println("Select the problem you are facing in your body = ");
		String a = sc.nextLine();
		String c = "Fever";
		String b = "cough";
		String d = "Headache";
		String e = "Bellyache";
		String f = "Chest pain";
		if(a.equalsIgnoreCase(c)) {
			System.out.println("Fever treatment: Quick guide to treating a fever. Rest and drink plenty of fluids. Medication isn't needed. Call the doctor if the fever is accompanied by a severe headache, stiff neck, shortness of breath, or other unusual signs or symptoms.\r\n"
					+ "You can take a calpole");
		}
		else if(a.equalsIgnoreCase(b)) {
			System.out.println("If you have a dry cough, a preparation containing an antitussive such as dextromethorphan or pholcodine is the most suitable to try. If you have a chesty cough, a preparation containing an expectorant such as guaifenesin or ipecacuanha is the most suitable to try");
		}
		else if(a.equalsIgnoreCase(d)) {
			System.out.println("Panadol , Tylenol , Bayer, Bufferin.You can take any one among this");
		}
		else if(a.equalsIgnoreCase(e)) {
			System.out.println("For constipation, a mild stool softener or laxative may help get things moving again");
			System.out.println("For cramping from diarrhea, medicines that have loperamide (Imodium) or bismuth subsalicylate (Kaopectate or Pepto-Bismol) might make you feel better.");
			System.out.println("Else you can book appointment to our doctors");
		}
		else if(a.equalsIgnoreCase(f)) {
			System.out.println("Chest pain treatment varies depending on what's causing the pain. Medicines used to treat some of the most common causes of chest pain include: Artery relaxers. Nitroglycerin — usually taken as a tablet under the tongue — relaxes heart arteries so blood can flow more easily through the narrowed spaces.");
		}
		else {
			System.out.println("Sorry our AI can not able to detect your disease you can book a appointment");
		}
	}
}