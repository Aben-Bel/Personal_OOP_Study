import java.util.Scanner;

public class PoundsToKilos {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double value;

		System.out.print("Enter pounds: ");
		value = keyboard.nextDouble();

		value = poundsToKilos(value);
		System.out.println("In kilos it is: " + value);
	}
	static double poundsToKilos(double pounds){
		return pounds/2.2;
	}
}