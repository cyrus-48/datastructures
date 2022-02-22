package lesson1;

import java.util.Scanner;

public class TWAplane {
	private String cap[];// = {"AA1","AA2","AA3","AA4","AA6","AA7","AA8","AA9","A10"}; // capacity of the plane
	private boolean seats[]; // to store the status for the seat _occupied and unoccupied.
	
	TWAplane(String cap[]){
		this.cap = cap ;
		seats = new boolean[cap.length]; // initialize the seat array and set the maximum number to the capacity of the plane.
	}
	// method to check the number of seats
	public void displaySeats() {
		System.out.println("-------------------------------------------");
		System.out.println("seatNo:\t\tname:\t\tstatus:   |");
		System.out.println("-------------------------------------------");
		for(int i=0; i< cap.length;i++) {
			if(seats[i] == true) {
				
				System.out.println(i+"\t\t" +cap[i]+"\t\treserverd  |");
				
			}
			else {
				 System.out.println(+ i +"\t\t" +cap[i]+"\t\tunreserved|");
			}
		 }
		System.out.println("------------------------------------------");
	}
	// reserve seats
	public void reserveSeats(int s) {
		
		if(seats[s]==false) {
			seats[s] = true;
			 
			System.out.println("seat name: "+cap[s]+" reserved.");	
		}
		else {
			System.out.println("Seat no:"+s+" name:" +cap[s]+"is already occupied!!");  
			}
	}
	// list occupied and unoccupied seats
	public void seatsStatus() {
	 
	    int op;
	    Scanner cn = new Scanner(System.in);
	    do {  
	    		System.out.println(" ----------------------");
	    		System.out.println("|\t MENU         |");
	    		System.out.println(" ----------------------");
	    	    System.out.println("| 1.Unoccupied seats  |\n| 2.Occupied seats    |\n| 3.Exit       \t      |");
	    	    System.out.println(" ----------------------");
	    	    System.out.println("Enter choice: ");
	    	   op= cn.nextInt();
	    	   switch(op) {
	    	   case 1:
	    		   System.out.println("<<<<<<<<<<<|unoccupied seats|>>>>>>>>>>");
	    		   System.out.println("----------------------------------");
	    		   System.out.println("|  seat number\t | \t seatname| ");
	    		   System.out.println("----------------------------------");
	    		   for(int x = 0; x < cap.length;x++) {
	    			   if(seats[x] == false) {
	    				   System.out.println("|\t"+x +"\t | \t"+ cap[x]+"	 |");
	    			   }
	    			   else {
	    				   System.out.println("There are no empty seats!!!");
	    				   
	    			   }
	    			 
	   	    		   }
	    		          System.out.println("----------------------------------");
	    		   break;
	    	   case 2:
	    		   System.out.println("<<<<<<<<<|Occupied seats|>>>>>>>>>> ");
	    		   System.out.println("----------------------------------");
	    		   System.out.println("|  seat number\t | \t seatname| ");
	    		   System.out.println("----------------------------------");
	    		   for(int x = 0; x < cap.length;x++) {
	    			   if(seats[x] == true) {
	    				   System.out.println("|\t"+ x +"\t | \t"+ cap[x]+"	 |");
	    				   
	    				   
	    			   }
	    			 
	    		   }
	    		     System.out.println("----------------------------------");
	    		   break;
	    	   case 3:
	    		   System.out.println("<<Exitted>>");
	    	
	    		   menu();
	    	    break;
	    	   default:
	    		   System.out.println("inavalid option!!");
	    		   
	    	   
	    	   
	    	}
	    }while(op!= 3);
	    
	    
	}
	// cancel seat
	public void uncheckSeat(int s) {
		if(seats[s] == true) {
			seats[s] = false; 
			System.out.println("seat no. " + s +" Seat name:"+ cap[s]+" cancelled");
			}
		else {
			System.out.println("seat no: "+s+" Seat name:"+ cap[s]+" is already unreserved");
		}
		
	}
	// menu of the services 
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int ch;
		// loop through the menu of items as long as ch is not equal to 4.
		do {
			System.out.println(" ---------------------------");
			 System.out.println(" |  WESTERN TRANS AIRLINE  |");
			 System.out.println(" ---------------------------");
			 System.out.println(" |\t   MENU            |");
			 System.out.println(" --------------------------");
			 System.out.println(" | 1. |check all seats         |\n | 2. |Reserve seats       | \n | 3. |cancel reservation  | \n | 4. |Check seats status  | \n | 5. |Exit                | ");
			 System.out.println(" --------------------------");
			 System.out.println("Enter choice:(1-5): ");
			 ch = sc.nextInt();
			
			 switch(ch) {
			 // using switch statement to traverse through the menu.
			 case 1:
				 System.out.println("-------check seats:------- ");
					displaySeats();
					break;
			 case 2:
				 System.out.println("--------Reserve seats:------");
				 System.out.println("Enter seat to be reserved 0-9 " );
					int s = sc.nextInt();
					reserveSeats(s);
					 
					 break;
			 case 3:
				System.out.println("--------Cancel reservation:----");
				System.out.print("Enter seat to be unchecked: ");
					int u = sc.nextInt();
					uncheckSeat(u);
					 
					break;
			 case 4:
				 System.out.println("---------check seat status----------");
				 seatsStatus();
				 break;
			 case 5:
				 System.out.println("---Exited--- ");
				 System.exit(0);
				
				 break;
			default:
				 System.out.println("wrong choice");
				 break;
			 }
			  }while(ch !=5); // terminate the loop when the ch is at 5		
		 }
	}
