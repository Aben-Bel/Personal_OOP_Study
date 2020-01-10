import java.util.Scanner;
public class ExercisesArthimetic{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a first number: ");
		int num1 = keyboard.nextInt();
		System.out.print("Enter a Second number: ");
		int num2 = keyboard.nextInt();

		System.out.print("Enter operator (+, -, *, /) : ");
		char operator = keyboard.next().charAt(0);

		switch(operator){
			case '+': System.out.println("The sum is: "+ (num1 + num2));break;
			case '-': System.out.println("The difference is: "+ (num1 - num2));break;
			case '/': System.out.println("The quotient is: "+ (num1/num2));break;
			case '*': System.out.println("The product is: "+ (num1*num2));break;
		}
	}
}