package lesson3;
import java.util.Scanner;
 

public class DemoArrayQueue {
	public static void main(String []args) {
		 int len = 0;  
	
		 Scanner cs = new Scanner(System.in);

		try {

			 
			 System.out.println("Enter the size of the stack");
			 len = cs.nextInt();
			 if(len <= 1) {
				 System.out.println("The size of the Queue must be greater than 1");
			 }
			 else {
				 ArrayQueue aq = new ArrayQueue(len);
				 aq.menu();
				 
			 }
			
			}catch(Exception e) {
			
			System.out.println("An error occured!! Enter number");
			 
		}		
	}
}

