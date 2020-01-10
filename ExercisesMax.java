import java.util.Scanner;
public class ExercisesMax{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter space separated numbers: ");
		String[] inputs = keyboard.nextLine().split(" ");

		int max = Integer.parseInt(inputs[0]);
		int min = Integer.parseInt(inputs[0]);
		for(String val : inputs){
			int num = Integer.parseInt(val);
			if(num > max){
				max = num;
			}
			if(num < min){
				min = num;
			}
		}
		System.out.println("The max is: " + max + " and the min is: " + min);

		


	}
}