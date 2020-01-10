import java.util.Scanner;
public class Exercises6{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a n: ");
		int num = keyboard.nextInt();
		double sum;
		int k = 1;
		for( ; k < num;){

			int fact;
			int upto = k;
			for( fact = 1; upto > 0;fact*=upto--){}
			sum += (upto/k);
			k+=1;
		}

	}
}