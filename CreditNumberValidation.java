import java.util.Scanner;

public class CreditNumberValidation {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter credit card number: ");
		Long number = keyboard.nextLong();

		if(isValid(number)){
			System.out.println("The card you entered is valid");
		}else{
			System.out.println("The card you entered is invalid");
		}
	}

	public static boolean isValid(long number){
		Boolean prefix =    prefixMatched(number, 4) 
						|| prefixMatched(number, 5)
						|| prefixMatched(number, 37) 
						|| prefixMatched(number, 6);

		if(  prefix && getSize(number) > 12 && getSize(number) < 17 ){
			int val1 = sumOfOddPlace(number);
			int val2 = sumOfDoubleEvenPlace(number);

			return ((val1+val2) % 10 == 0);
		}

		return false;

	}

	public static int sumOfDoubleEvenPlace(long number){
		String creditNumber = Long.toString(number);
		int sum1 = 0;
		Boolean record = false;

		for(int i = creditNumber.length() - 1; i>=0; i--) {
			if( record ){
				int afterDouble = Character.getNumericValue(creditNumber.charAt(i))*2;
				sum1 += getDigit(afterDouble); 
			}

			record = !record;
		}
		return sum1;
	}

	public static int getDigit(int number){
		if(number >= 10){ // two digit number, return sum of digits
			String val = Integer.toString(number);
			return Character.getNumericValue(val.charAt(0)) + Character.getNumericValue(val.charAt(1));
		}else{ // single digit, return number
			return number;
		}
	}

	public static int sumOfOddPlace(long number){
		String creditNumber = Long.toString(number);
		int sum2 = 0;
		Boolean record = true;

		for(int i = creditNumber.length() - 1; i>=0; i--) {
			if( record ){
				sum2 += Character.getNumericValue(creditNumber.charAt(i));
			} 
			
			record = !record;
		}
		return sum2;

	}

	public static boolean prefixMatched(long number, int d){
		if(d<10){
		 return Long.toString(number).charAt(0) == Integer.toString(d).charAt(0);
		}else{
		 return Long.toString(number).substring(0,2) == Integer.toString(d);
		}
	}

	public static int getSize(long d){
		return Long.toString(d).length();
	}

}
