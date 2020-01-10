import java.util.Scanner;
public class convertCurrency2{
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char choice;
		do{
			double money = sumOfMoney();
			double rate = exchangeRate();
			double res = convert(money, rate);
			displayResult(res);
			System.out.println();
			System.out.println();

			System.out.print("Do you want to try again:(y/n) ");
			choice = keyboard.next().charAt(0);
		}while(choice != 'n');
		
	}
	static double sumOfMoney(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the sum of money: ");
		double money = keyboard.nextDouble();
		return money;
	}
	static double exchangeRate(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the exchange rate: ");
		double rate = keyboard.nextDouble();
		return rate;
	}
	static double convert(double value, double rate){
		return value*rate;
	}
	static void displayResult(double res){
		System.out.println("The value after converting is: "+res);

	}
}