import java.util.Scanner;
public class Exercises8{
	public static void main(String[] args){

		int num1 = 1;
		int num2 = 2;
		int num3 = 3;

		if(num1 < num2){
			if(num2 > num3){
				System.out.println("Max: "+num2);
			}else{
				System.out.println("Max: "+num3);
			}
		}else{
			if(num1 > num3){
				System.out.println("Max: "+num1);
			}else{
				System.out.println("Max: "+num3);
			}
		}
	}
}