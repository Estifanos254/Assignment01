import java.util.Scanner;

public class MovieDriver {
    //main
	public static void main(String[] args) {
		// Declaring and initializing scanner object 
		Scanner scanner = new Scanner(System.in);
		
		//declaring variables
		String name, rating;
		int ticketsSold;
		
		//creating the movie object
		Movie obj;
		
		while(true) {
			System.out.println("Enter the name of the movie");
			name = scanner.nextLine();
			
			System.out.println("Enter the rating of the movie");
			rating = scanner.nextLine();
			
			//taking the number of ticket sold
			System.out.println("Enter the number of ticket sold for this movie");
			ticketsSold = scanner.nextInt();
			
			//initializing the movie object
			obj = new Movie(name, rating, ticketsSold);
			
			//calling "toString()" with "obj" and displaying the returned the value
			System.out.println(obj.toString());
			
			//asking the user if they want to continue
			System.out.println("Do you want to continue? (y/n)");
			char input =scanner.next().charAt(0);
			
			//clearing the stray newLine character ('\n') from input
			scanner.nextLine();
			
			//checking if user pressed 'n' of 'N' and terminating the loop
			if(input== 'n'||input == 'N') {
				System.out.println("Good bye");
				break;
			}	
		}
	}
}
