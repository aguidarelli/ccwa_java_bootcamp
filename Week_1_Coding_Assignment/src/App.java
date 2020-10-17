
public class App {

	public static void main(String[] args) {
		
		/* Inside the main method, create 2 new variables 
		* or the following real-life examples and assign them values 
		*/
		double hamPrice = 6.35;
		double cheesePrice = 5.78;
		double brownWalletContents = 63.24;
		double blackWalletContents = 5.25;
		int friends = 32;
		int frenemies = 16;
		byte andrewAge = 36;
		int amosAge = 28;
		String firstName = "Andrew";
		String lastName = "Guidarelli";
		char middleInitial = 'V';
		
		/* Create the following variables by performing operations 
		 * (addition, subtraction, concatenation) on the variables 
		*/
		double walletAfterCheese = brownWalletContents - cheesePrice;
		float newFriendRate = friends/(float)andrewAge;
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		/*Use System.out.println() to print out the values of all the variables you’ve created.
		Provide some detail as to what the value being printed is. */
		System.out.println("The price of ham is $" + hamPrice);
		System.out.println("The price of cheese is $" + cheesePrice);
		System.out.println("I have $" + brownWalletContents + " in the brown wallet");
		System.out.println("I have $" + blackWalletContents + " in the black wallet");
		System.out.println("I have " + friends + " friends in my social circle");
		System.out.println("I have " + frenemies + " frenemies in my social circle");
		System.out.println("I am " + andrewAge + " years old");
		System.out.println("Amos is " + amosAge + " years old");
		System.out.println("My first name is " + firstName);
		System.out.println("My last name is " + lastName);
		System.out.println("My middle initial is " + middleInitial);
		System.out.println("After buying cheese, I have $" + walletAfterCheese + " left over");
		System.out.println("I have gained " + newFriendRate + " friends per year");
		System.out.println("My full name is " + fullName);
				
	}

}
