public class Pattern{
	public static void main(String[] args) {
		System.out.println("Pattern follows below");
		int lines = 5;
		for(int i = 0;i<lines;i++){
			// for spaces
			for(int j = i; j>0;j--){
				System.out.print(" ");
			}
			// for astriks
			for(int k = 0; k<lines-i; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}