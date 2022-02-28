package lesson2;

import java.util.Scanner;

public class DemoArrayStack {
	public static void main(String []args) {
		 int len = 0;

		try {

			 Scanner cs = new Scanner(System.in);
			 System.out.println("Enter teh size of the stack");
			 len = cs.nextInt();
			ArrayStack as = new ArrayStack(len);
			
			 
		
		    as.menu();
			
		}catch(Exception e) {
			System.out.println("An error occured");
			 ArrayStack ass = new ArrayStack(len);
			 ass.menu();
		}
	
	   
	   
		
		
	}

}
