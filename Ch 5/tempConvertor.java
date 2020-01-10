import java.util.Scanner;
public class tempConvertor{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		char chose;

		do{	
			System.out.println("Choose option: ");
			System.out.println("	1. Celsius to Fahrenheit");
			System.out.println("	2. Fahrenheit to Celsius");
			System.out.println("	3. quit (or any key)");

			System.out.println();
			System.out.println();
			System.out.print(">>> ");
			chose = keyboard.next().charAt(0);

			if(chose == '1'){
				System.out.print("Enter Celsius: ");
				double cel = keyboard.nextDouble();
				if(cel >= -273.15){
					double fah = cel2fah()

					System.out.println("In Fahrenheit: "+fah);
				}else{
					System.out.println("Wrong value given");
				}
			}else if(chose == '2'){
				System.out.print("Enter Fahrenheit: ");
				double fah = keyboard.nextDouble();
				if(fah >= -459.67){
					double cel = cel2fah()

					System.out.println("In Celsius: "+cel);
				}else{
					System.out.println("Wrong value given");
				}
				
			}
		}while(choice != '3');
	}
	static double cel2fah(double cel){
		return cel*(9/5) + 32;
	}
	static double fah2cel(dobule fah){
		return (5*(fah - 32))/9;
	}
}