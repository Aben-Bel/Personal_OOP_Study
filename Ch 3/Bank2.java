import java.util.Scanner;

public class Bank2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount, earn;
		char accountType;
		Boolean satisfies = false;

		System.out.print("Enter your amount: ");
		amount = keyboard.nextDouble();

		System.out.println("Choose your account type: ");
		System.out.println("A (1.5%)");
		System.out.println("B (2%)");
		System.out.println("C (1.5%)");
		System.out.println("X (5%)");

		System.out.print(">>> ");
		accountType = keyboard.next().toUpperCase().charAt(0);

		switch(accountType) {
			case 'A':  
				if(amount >= 250)
					satisfies = true;
				earn = amount*0.015; break;
			case 'B': 
				if(amount >= 1000)
					satisfies = true;
				earn = amount*0.02; break;
			case 'C': 
				if(amount >= 250)
					satisfies = true;
				earn = amount*0.015; break;

			case 'X': 
				if(amount >= 5000)
					satisfies = true;
				earn = amount*0.05; break;
			default: 
				earn = 0.0;
				System.out.println("Wrong input!"); 
		}

		if (satisfies)
			System.out.println("In a year, from interest, You will earn: " + earn);
		else
			System.out.println("The bank doesn't provide interest with the current amount");

	}
}