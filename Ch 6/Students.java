import java.util.Scanner;
public class Students{
	public static void main(String[] args){
		int[] javaStudents = enterExamMarks();

	}
	static int[] enterExamMarks(){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = keyboard.nextInt();
		int[] list = new int[size];

		for(int i = 0; i<size;i++){
			System.out.print("enter no."+(i+1)+" grade: " );
			list[i] = keyboard.nextInt();
		}
		return list;
	}
	static void increaseMarks(grades){
		for(int i = 0; i<grades.length;i++ ){
			grades[i] += 5;
		}
	}
	static boolean allHavePassed(grades){
		for(int i = 0; i<grades.length;i++ ){
			if(grades[i] < 40){
				return false;
			}
		}
		return true;
	}	
}