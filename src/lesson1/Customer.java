package lesson1;

import java.util.Scanner;

public class Customer {
	private String name;
	private int bookNumber;
	public Customer(String name, int bookNumber) {
		this.name = name;
		this.bookNumber = bookNumber;
		
	}
	public String getName() {
		return name;
	}
	public int getBookNumber() {
		return bookNumber;
	}
	public void assignSeat(int s) {
		System.out.println("Enter seat to be assigned");
		Scanner cs = new Scanner(System.in);
		s = cs.nextInt();
		
	}

}
