import java.util.Scanner;
public class Exercises14{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("List of methods in Arrays");
		System.out.print("asList(            binarySearch(      class             compare(   \n"+        
						 "compareUnsigned(   copyOf(            copyOfRange(       deepEquals( \n" +        
						 "deepHashCode(      deepToString(      equals(            fill( \n"+             
						 "hashCode(          mismatch(          parallelPrefix(    parallelSetAll( \n"+
						 "parallelSort(      setAll(            sort(              spliterator(   \n"+    
						 "stream(            toString(");
		
		int arr[] = {1,2,3,4,5};
		System.out.print("length of the array is: " + arr.length);


	}

}