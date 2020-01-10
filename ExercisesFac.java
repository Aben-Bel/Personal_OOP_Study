import java.util.Scanner;
public class ExercisesFac{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a n: ");
		int num = keyboard.nextInt();
		int fact;
		for( fact = 1; num > 0;fact*=num--){}

		System.out.println("N factorial is: "+fact);
	}
}