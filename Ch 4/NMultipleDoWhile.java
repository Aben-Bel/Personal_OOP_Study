import java.util.Scanner;
public class NMultipleDoWhile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char choice;
		do{	
			System.out.print("Enter which times table you want displayed: ");
			int n = keyboard.nextInt();
			int i=1;
			while(i<=12) {
				if(n < 2) {
					System.out.println("Wrong input. Number less than 2.");
					System.out.print("Enter which times table you want displayed: ");
					n = keyboard.nextInt();
					continue;
				}
				System.out.printf("%d x %d = %d\n", i,n, i*n);
				i++;
			}
			System.out.print("Do you want to run again:(Y/N) ");
			choice = keyboard.next().toUpperCase().charAt(0);
		} while(choice == 'Y');
	}
}