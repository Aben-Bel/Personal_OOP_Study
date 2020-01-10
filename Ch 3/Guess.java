import java.util.Scanner;
public class Guess {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double firstNum, secondNum, sum;
		System.out.print("Enter first number: ");
		firstNum = keyboard.nextDouble();
		System.out.print("Enter second number: ");
		secondNum = keyboard.nextDouble();

		System.out.print("Enter the sum of the numbers: ");
		sum = keyboard.nextDouble;

		if(sum == firstNum + secondNum) {
			System.out.print("Congratulations, You guessed the sum right");
		} else {
			System.out.print("Your guess was wrong. Maybe nexttime.");
		}
	}
}