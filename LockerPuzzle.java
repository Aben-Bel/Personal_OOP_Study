public class LockerPuzzle {
	public static void main(String[] args) {
		Boolean[] lockerState = new Boolean[100];


		for(int i = 0; i < lockerState.length; i++) {
			if(i == 1){
				for(int l = 0; l < lockerState.length; l++){
					lockerState[l] = true;
				}
			}else if(i == 2){
				for(int j = 0; j < lockerState.length; j++){
					if(j%2!=0){
						lockerState[j] = false;
					}
				}
			}else if(i>2){
				for(int k = 0; k < lockerState.length; k++){
					if(k%i == 0){
						lockerState[k] = !lockerState[k];
					}
				}
			}
		}

		
		int m = 0;
		for(Boolean val :lockerState){
			m++;
			System.out.println(m+": "+val+" ");
		}
	}
}