import java.util.Scanner;
public class DisplayStars4 {
	public static void main(String[] args) {
		int num; // to hold user response
		Scanner keyboard = new Scanner(System.in);
		// prompt and get user response
		char choice;
		do{
			System.out.println("Size of square?");
			num = keyboard.nextInt();
			// display square
			if (num >= 2 && num <= 20) {
				for(int i = 1; i <= num; i++) // number of rows fixed to 'num' 
				{
					for (int j = 1; j <= num; j++) // number of stars in a row fixed to 'num'
					{
						System.out.print("*");
					}
					System.out.println(); 
				}
			}
			System.out.print("Do you want to run again:(Y/N) ");
			choice = keyboard.next().toUpperCase().charAt(0);
		} while(choice == 'Y');

	}
}
