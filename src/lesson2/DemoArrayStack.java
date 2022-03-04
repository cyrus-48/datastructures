package lesson2;

import java.util.Scanner;

public class DemoArrayStack {
	public static void main(String []args) {
		 int len = 0;  
	
		 Scanner cs = new Scanner(System.in);

		try {

			 
			 System.out.println("Enter the size of the stack");
			 len = cs.nextInt();
			 if(len == 0) {
				 System.out.println("The size of the stack can not be 0!!");
			 }
			 else {
				 ArrayStack as = new ArrayStack(len);
				 as.menu();
				 
			 }
			
			}catch(Exception e) {
			
			System.out.println("An error occured!! Enter a nummber ");
			 
		}		
	}
}
