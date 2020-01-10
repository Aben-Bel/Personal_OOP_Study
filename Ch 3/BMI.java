import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double height, mass;

		System.out.print("Enter your height: ");
		height = keyboard.nextDouble();

		System.out.print("Enter your mass: ");
		mass = keyboard.nextDouble();

		double bmi = mass/(height*height);

		if(bmi < 18.5){
			System.out.println("You are underweight");
		} else if(bmi <= 24.9) {
			System.out.println("You are Healthy");
		} else {
			System.out.println("You are overweight");
		}


	}	
}