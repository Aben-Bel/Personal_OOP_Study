import java.util.Scanner;

public class PoundsToKilos {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double value;

		System.out.print("Enter pounds: ");
		value = keyboard.nextDouble();

		value = value/2.2;
		System.out.println("In kilos it is: " + value);
	}
}