import java.util.Scanner;
public class ExercisesSwap{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a first number: ");
		int num1 = keyboard.nextInt();
		System.out.print("Enter a second number: ");
		int num2 = keyboard.nextInt();

		if(num1 < num2){
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

	}
}