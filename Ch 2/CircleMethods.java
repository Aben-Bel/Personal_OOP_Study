import java.util.Scanner;

public class CircleMethods{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double PI = 3.1416;

		double radius;

		System.out.print("Enter the radius of the circle: ");
		radius = keyboard.nextDouble();


		System.out.println("The Area of the circle is: " + PI*radius*radius);
		System.out.println("The Circumference of the circle is: " + 2*PI*radius);


	}
}