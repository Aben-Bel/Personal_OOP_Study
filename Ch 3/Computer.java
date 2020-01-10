import java.util.Scanner;

public class Computer {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice, extras;
		System.out.println("1. Basic System - 375.99");
		System.out.println("2. Basic System (375.99) + 38cm screen (75.99)");
		System.out.println("3. Basic System (375.99) + 43cm screen (99.99)");

		System.out.print(">>> ");
		choice = (int)keyboard.nextInt();

		System.out.println("1. Antivirus Software (65.99)");
		System.out.println("2. Printer (125.00)");
		System.out.println("3. Both");
		System.out.println("4. None");

		System.out.print(">>> ");
		extras = (int)keyboard.nextInt();

		if(extras == 1){
			if(choice == 1){
				System.out.println("The total cost is: " + (375.9+65.99));
			} else if (choice == 2) {
				System.out.println("The total cost is: " + (375.9+65.99+75.99));
			} else if (choice == 3) {
				System.out.println("The total cost is: " + (375.9+65.99+99.99));
			}
		} else if(extras == 2){
			if(choice == 1){
				System.out.println("The total cost is: " + (375.9+125.00));
			} else if (choice == 2) {
				System.out.println("The total cost is: " + (375.9+125.00+75.99));
			} else if (choice == 3) {
				System.out.println("The total cost is: " + (375.9+125.00+99.99));			
			}
		} else if(extras == 3) {
			if(choice == 1){
				System.out.println("The total cost is: " + (375.9+125.00+65.99));
			} else if (choice == 2) {
				System.out.println("The total cost is: " + (375.9+125.00+65.99+75.99));
			} else if (choice == 3) {
				System.out.println("The total cost is: " + (375.9+125.00+65.99+99.99));
			}
		} else if(extras == 4) {
			if(choice == 1){
				System.out.println("The total cost is: " + (375.9));
			} else if (choice == 2) {
				System.out.println("The total cost is: " + (375.9+65.99));
			} else if (choice == 3) {
				System.out.println("The total cost is: " + (375.9+99.99));
			}
		}

	}	
}