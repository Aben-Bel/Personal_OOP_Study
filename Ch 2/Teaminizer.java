import java.util.Scanner;

public class Teaminizer {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numberOfStudents, sizeOfTeam;

		System.out.print("Enter the number of students: ");
		numberOfStudents = keyboard.nextInt();

		System.out.print("Enter the number of teams: ");
		sizeOfTeam = keyboard.nextInt();

		System.out.println("The number of teams that can be formed are " + 
		numberOfStudents/sizeOfTeam 
		+ " \nand the number of left students are " + numberOfStudents%sizeOfTeam );

	}
}