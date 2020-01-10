import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double height, mass;

		System.out.print("Enter your height: ");
		height = keyboard.nextDouble();

		System.out.print("Enter your mass: ");
		mass = keyboard.nextDouble();

		System.out.println("Your IBM is: " + mass/(height*height));
	}	
}