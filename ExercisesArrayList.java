import java.util.Scanner;
public class ExercisesArrayList{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		System.out.println("List of methods in Arrays");
		System.out.print("asList(            binarySearch(      class             compare(   \n"+        
						 "compareUnsigned(   copyOf(            copyOfRange(       deepEquals( \n" +        
						 "deepHashCode(      deepToString(      equals(            fill( \n"+             
						 "hashCode(          mismatch(          parallelPrefix(    parallelSetAll( \n"+
						 "parallelSort(      setAll(            sort(              spliterator(   \n"+    
						 "stream(            toString(");

		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);

		System.out.print("length of the array is: " + arr.length);



	}
}