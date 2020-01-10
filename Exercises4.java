import java.util.Scanner;
public class Exercises4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a n: ");
		int num = keyboard.nextInt();

		if(num <= 1){
			System.out.println("It is not a prime");
			return;
		}
		
		int k = 2;
		while(k <= Math.pow(num, 0.5)){
			if(num % k == 0){
				System.out.println("It is not a prime");
				return;
			}
			k+=1;
		}
		System.out.println("It is a prime number");
	}
}