import java.util.Scanner;
public class NMultiples {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter which times table you want displayed: ");
		int n = keyboard.nextInt();
		for(int i = 1; i<=12; i++) {
			System.out.printf("%d x %d = %d\n", i,n, i*n);
		}
	}
}