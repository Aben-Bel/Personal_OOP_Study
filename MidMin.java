
public class MidMin{
	public static void main(String[] args){

		int[] test = {1,2,4,5};
		System.out.println(">>> "+arrayMin(test));

	}
	static int arrayMin(int[] arr){
		if (arr.length % 2 == 0){
			return 0;
		}

		int midSize = arr.length/2;
		for (int i = 0; i<arr.length; i++){
			if(i!=midSize && arr[i] < arr[midSize]){
				return 0;
			}
		}
		return 1;

	}
}