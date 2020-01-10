import java.util.Scanner;

public class ListEqual {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);


		System.out.print("Enter the number of items: ");
		int n = keyboard.nextInt();
		int[] list1 = new int[n];

		System.out.println("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			list1[i] = keyboard.nextInt();
		}

		System.out.print("Enter the number of items: ");
		int m = keyboard.nextInt();
		int[] list2 = new int[m];

		System.out.println("Enter the numbers: ");
		for (int j = 0; j < m; j++) {
			list2[j] = keyboard.nextInt();
		}

		System.out.println("Equals is " + equals(list1,list2));
	}
	public static boolean equals(int[] list1, int[] list2){
		if(list1.length != list2.length ){
			return false;
		}else{
			for(int i = 0; i < list1.length; i++){
				if(list1[i] != list2[i]){
					return false;
				}
			}
			return true;
		}
	}
}