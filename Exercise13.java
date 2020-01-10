import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
		

		while(true){
			if(makeChoice() == 0){
				break;
			};	
		}
		
	}
	static int makeChoice(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("###############################");
		System.out.println("#### 1. Book a room       #####");
		System.out.println("#### 2. View Events       #####");
		System.out.println("#### 3. Quit              #####");
		System.out.println("###############################");

		System.out.print(">>> ");
		int choice = keyboard.nextInt();

		switch(choice){
			case 1:bookRoom();break;
			case 2:viewEvent();break;
			case 3:return 0;
			default:return;
		}
	}
	static void bookRoom(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("#############################");
		System.out.println("##### 1. Honeymoon room ######");
		System.out.println("##### 2. 2 Bedrooms     ######");
		System.out.println("##### 3. 1 Bedroom      ######");
		System.out.println("##### 4. Back           ######");
		System.out.println("##############################");

		System.out.print(">>> ");
		int choice = keyboard.nextInt();

		switch(choice){
			case 1:System.out.println("Room reserved take ticket and key from reception.");break;
			case 2:System.out.println("Room reserved take ticket and key from reception.");break;
			case 3:System.out.println("Room reserved take ticket and key from reception.");break;
			case 4:makeChoice();break;
			default:return;
		}
	}
	static void viewEvent(){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("#########################################");
		System.out.println("##### Tonight 8:00 jazz by nightazz######");
		System.out.println("##### Tomorrow 2:00 am acoustic    ######");
		System.out.println("##### press 4 to go back           ######");
		System.out.println("#########################################");

		System.out.print(">>> ");
		int choice = keyboard.nextInt();
		switch(choice){
			case 4: makeChoice();
			default: makeChoice();
		}
	}
}