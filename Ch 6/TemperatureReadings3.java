import java.util.Scanner;
public class TemperatureReadings3{
	public static void main(String[] args){
		double[] temperature;
		temprature = enterTemps();
		displayTemps(temprature);
		wasHot(temperature);
	}

	static double[] enterTemps(){
		Scanner keyboard = new Scanner(System.in);
		double[] temperatureOut = new double[7];
		for (int i = 0; i < temperatureOut.length; i++){
			System.out.println("Enter max temperature for day " + (i+1));
			temperatureOut[i] = keyboard.nextDouble();
		}
		return tempratureOut;
	}

	static void displayTemps(double[] temperatureIn) {
		System.out.println();
		System.out.println("*** TEMPERATURES ENTERED");
		System.out.println();
		for (int i = 0; i < temperatureIn.length; i++){
			System.out.println("day "+(i+1)+" "+temperatureIn[i]);
		}
	}

	static void wasHot(temperature){
		System.out.println("Days that were hot");
		for(double temp: temprature){
			if(temp >= 18){
				System.out.println(">> "+temp);
			}
		}
	}
}