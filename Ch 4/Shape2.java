public class Shape2 {
	public static void main(String[] args) {
		for(int i = 0; i<6; i++) {
			int n = 3;
			if(i == 2 || i == 3) {
				n = 9;
			}

			for(int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}