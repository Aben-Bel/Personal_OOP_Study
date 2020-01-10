import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double amount, earn;
		char accountType;

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
			case 'A':  earn = amount*0.015; break;
			case 'B': earn = amount*0.02; break;
			case 'C': earn = amount*0.015; break;
			case 'X': earn = amount*0.05; break;
			default: 
				earn = 0.0;
				System.out.println("Wrong input!"); 
		}

		System.out.println("In a year, from interest, You will earn: " + earn);

	}
}