import java.util.Scanner;
public class Runners{
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);

		double[] seconds = new double[3];
		double[] secondsWithNames = new double[3];
		String[] names = new String[3];

		// recieve input
		for(int i = 0; i<seconds.length; i++){
			System.out.print("Enter name of the runner: ");
			names[i] = keyboard.next();
			System.out.print("Enter the finishing time of "+names[i]+": ");
			seconds[i] = keyboard.nextDouble();

			secondsWithNames[i] = seconds[i];
		}


		// sort array
		for(int i = 0; i<seconds.length; i++){
			for(int j = i+1; j<seconds.length; j++){
				if (seconds[i] > seconds[j]){
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;

					double tempD = secondsWithNames[j];
					secondsWithNames[j] = secondsWithNames[i];
					secondsWithNames[i] = tempD;
				}
			}
		}

		double previous = secondsWithNames[0];
		int rankAt = 1;
		// print 
		for(int k=0; k<seconds.length;k++){
			if(secondsWithNames[k] != previous){
				previous = secondsWithNames[k];
				rankAt += 1;
			}
			System.out.println(names[k]+" is Ranked: "+rankAt);
		}
	}
}