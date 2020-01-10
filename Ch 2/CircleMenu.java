import java.util.Scanner;

public class CircleMethods{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		final double PI = 3.1416;

		double radius, area, perimeter;
		char choice;

		do{
			System.out.println("[ 1 ] Set radius");
			System.out.println("[ 2 ] Display radius");
			System.out.println("[ 3 ] Display area");
			System.out.println("[ 4 ] Display perimeter");
			System.out.println("[ 5 ] Quit");

			choice = keyboard.next().charAt(0);

			if(choice == '1') {
				System.out.print("Enter the radius of the circle: ");
				radius = keyboard.nextDouble();
			} else if(choice == '2') {
				System.out.println("The radius is " + radius);
			} else if(choice == '3') {
				area = PI*radius*radius;
				System.out.println("The Area of the circle is: " + area );
			} else if(choice == '4') {
				perimeter = 2*PI*radius;
				System.out.println("The Circumference of the circle is: " + perimeter);
			}
		}while(choice == '5');



	}
}