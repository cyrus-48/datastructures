package lesson1;

import java.util.Scanner;

public class demoTWAplane {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String cap[] = {"AA0","AA1","AA2","AA3","AA4","AA5","AA6","AA7","AA8","AA9"};
		TWAplane tw = new TWAplane(cap);
		int ch;
		// loop through the menu of items as long as ch is not equal to 4.
		do {
			 System.out.println("<<<<<<<<<<<<WESTERN TRANS AIRLINE>>>>>>>>>>>>>");
			 System.out.println(" 1.check seats \n 2.Reserve seats \n 3.cancel reservation \n 4.Exit ");
			 System.out.println("Enter choice: ");
			 ch = sc.nextInt();
			
			 switch(ch) {
			 // using switch statement to traverse through the menu.
			 case 1:
				 System.out.println("-------check seats:------- ");
					tw.displaySeats();
					break;
			 case 2:
				 System.out.println("--------Reserve seats:------");
				 System.out.println("Enter seat to be reserved 0-9 " );
					int s = sc.nextInt();
					tw.reserveSeats(s);
					 
					 break;
			 case 3:
				System.out.println("--------Cancel reservation:----");
				System.out.print("Enter seat to be unchecked: ");
					int u = sc.nextInt();
					tw.uncheckSeat(u);
					 
					break;
			 case 4:
				 System.out.println("---Exited--- ");
				 System.exit(0);
				 break;
			default:
				 System.out.println("wrong choice");
				 break;
			 
			 }
			 
		 }while(ch !=4); // terminate the loop when ch is 4
		
		 
		
	}
}
