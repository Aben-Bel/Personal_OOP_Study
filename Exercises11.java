import java.util.Scanner;
public class Exercises11{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a Grade: ");
		int num1 = keyboard.nextInt();

		if(num1 >= 80){
			System.out.println("Your grade is A");
		}else if(num1 >= 70){
			System.out.println("Your grade is B");
		}else if(num1 >= 60){
			System.out.println("Your grade is C");
		}else if(num1 >= 50){
			System.out.println("Your grade is D");
		}else{
			System.out.println("Your grade is F");
		}

	}
}