import java.util.Scanner;
public class WiFiDiagnosis {
	

	public static void diagnoseWiFi() {
		
		Scanner scnr = new Scanner(System.in);
		
		//1st step
		System.out.println("\n\nPlease reboot your computer");
		System.out.print("Does that fix the problem?(yes or no): ");
		String answer = scnr.nextLine();
		while(!"yes".equalsIgnoreCase(answer)&&!"no".equalsIgnoreCase(answer)) {
			System.out.println("Invalid answer, try again!");
			System.out.print("Does that fix the problem?(yes or no):  ");
			answer=scnr.nextLine();
		}
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("Done");
			return;
			}
		//2nd step
		System.out.println("Please try reboot your router");
		System.out.print("Does that fix the problem?(yes or no):  ");
		answer=scnr.nextLine();
		while(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no")) {
			System.out.println("Invalid answer, try again!");
			System.out.print("Does that fix the problem?(yes or no):  ");
			answer=scnr.nextLine();
			}
		if("yes".equalsIgnoreCase(answer)) {
			System.out.println("Done");
			return;
			}
		//step 3
		System.out.println("Step 3: Make sure the cables to your router are plugged in firmly and your router is getting power");
		System.out.print("Does that fix the problem?(yes or no):  ");
		answer=scnr.nextLine();
		while(!"yes".equalsIgnoreCase(answer)&&!"no".equalsIgnoreCase(answer)) {
			System.out.println("Invalid answer, try again!");
			System.out.print("Does that fix the problem?(yes or no): ");
			answer=scnr.nextLine();
			}
		if(answer.equalsIgnoreCase("yes")) {
			System.out.println("Done");
			return;
			}
		//Step4
		System.out.println("\n Step 4: move you computer closer to your router");
		System.out.print("Does that fix the problem?(yes or no): ");
		answer=scnr.nextLine().trim();
		while(!"yes".equalsIgnoreCase(answer)&&!"no".equalsIgnoreCase(answer)) {
			System.out.println("Invalid answer, try again!");
			System.out.print("Does that fix the problem?(yes or no): ");
			answer=scnr.nextLine();
			}
		if("yes".equalsIgnoreCase(answer)) {
			System.out.println("Done");
		}else {
		//Step 5
		System.out.println("\n Step 5:Contact your ISP\n");
		}
		
		
	}
	public static void main(String[] args) {
		//print the header
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.");
		diagnoseWiFi();	// calling diagnoseWiFi static function
		String PROGRAMMER = ("[Estifanos Kebebew]");
		System.out.println("programer: "+ PROGRAMMER);
		}	
}

	
	

	


