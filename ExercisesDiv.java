import java.util.Scanner;
public class ExercisesDiv{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a n: ");
		int num = keyboard.nextInt();

		int k = 1;
		while(k < num){
			if(k%3 == 0 && k%7 == 0){
				System.out.println(">> "+k);
			}
			k+=1;
		}
	}
}