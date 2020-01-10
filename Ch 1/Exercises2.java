import java.util.Scanner;
public class Exercises2{
	public static void main(String[] args){

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();
		int digit = 1;
		int mul = 1;
		while(num != 0){
			digit += mul*num%10;
			num = num/10
			mul *= 10
		}
		System.out.print("Reversed the number looks like this: "+digit);
	}
}