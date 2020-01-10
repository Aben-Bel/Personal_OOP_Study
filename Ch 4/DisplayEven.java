import java.util.Scanner;
public class DisplayEven
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the max range for even number: "); 
		int n = keyboard.nextInt();

		System.out.println();
		for(int i=0; i <= n; i++) // loop through the numbers 10 down to 1 
		{
		// body of the loop contains in ‘if’ statement 
			if (i%2 == 0) // check if number is even
			{
				System.out.println(i + " is even"); // number displayed only when it is checked to be even
			} else {
				System.out.println(i + " is odd");
			}
		}
	} 
}