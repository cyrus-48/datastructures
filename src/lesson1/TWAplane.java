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
		for(int i=0; i< cap.length;i++) {
			if(seats[i] == true) {
				System.out.println("seat no: "+i+" name:" +cap[i]+" : reserved");
				
			}
			else {
				 
				System.out.println("seat no: "+ i +" name:" +cap[i]+" : unreserved");
			}
		 }
	}
	// reserve seats
	public void reserveSeats(int s) {
		
		if(seats[s]==false) {
			seats[s] = true;
			System.out.println("status :" + seats[s]+ "\n SEAT RESERVED : \n");
			System.out.println("seat name: "+ cap[s]);	
		}
		else {
			System.out.println("Seat no:"+s+" name:" +cap[s]+"is already occupied!!");  
			}
	}
	// cancel seat
	public void uncheckSeat(int s) {
		if(seats[s] == true) {
			seats[s] = false;
			System.out.println("after unchecking : \n status: " + seats[s]);
			System.out.println("seat no. " + s +" Seat name:"+ cap[s]+" cancelled");
			
		}
		else {
			System.out.println("seat no: "+s+" Seat name:"+ cap[s]+" is already unreserved");
		}
		
	}
	


}
