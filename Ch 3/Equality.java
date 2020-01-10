import java.util.Scanner;
public class Equality {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double firstNum, secondNum;
		System.out.print("Enter first number: ");
		firstNum = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		secondNum = keyboard.nextDouble();

		if(firstNum == secondNum) {
			System.out.println("NUMBERS ARE EQUAL");
		} else {
			System.out.println("NUMBERS ARE NOT EQUAL");
		}

	}
}