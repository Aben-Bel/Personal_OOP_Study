import java.util.Scanner;
public class RectAreaPeri {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double length, height, area, perimeter;

		System.out.print("Enter a the length of the rectangle: ");
		length = keyboard.nextDouble();
		System.out.print("Enter a the height of the rectangle: ");
		height = keyboard.nextDouble();

		area = areaCal(length,height)
		perimeter = perimeterCal(length,height);

		System.out.println("The area of the rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
	static double areaCal(double length, double width){
		return length*width;
	}
	static double perimeterCal(double length, double width){
		reutrn 2*(length*width);
	}
}