import java.util.Scanner;
public class convertCurrency{
	
	public static void main(String[] args) {
		double money = sumOfMoney();
		double rate = exchangeRate();
		double res = convert(money, rate);
		displayResult(res);
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