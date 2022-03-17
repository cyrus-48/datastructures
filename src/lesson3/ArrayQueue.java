package lesson3;

import java.util.Scanner;

public class ArrayQueue {
	private String queue[];
	private int front;
	private int rear;
	private final int max;
	public ArrayQueue(int max) {
		this.max = max;
		queue = new String[max];
		front = 0;
		rear = 0;
	}
	//method to check the size of the queue
	public int size() {
		return (max-front + rear) % max;
	}
	// method to check` if the queue is empty
	public boolean isEmpty() {
		if(front == rear) {
			return true;
		}
		else {
			return false;
		}
	}
	// method to check oif the queue is full
	public boolean isFull() {
		if(size()== max-1) {
		 return true;	
		}
		else {
			return false;
		}
	}
	// method to dequeque or remove an element from the stack 
	public String dequeue() {
		if(isEmpty()) { // checks if the queue is empty
			System.out.println("The queue is empty");
			
			return null; // returns a null value
		}
		else {
			String temp; // define a temp variable to store the value at the front index of the queue
			temp = queue[front]; // assigns the value to the temp variable
			queue[front] = null; // sets the value stored in queue index[front] to null
			front = front+1 % max;
			System.out.println(temp + " :Removed from the queue");
			display();
			return temp; // returns the valur removed frim the queue
		}
	}
	// method to enqueue or add an element to the queue
	public void  enqueue(String  elem) {
		if(isFull()) { // checks whther the queue is full and returns and exception if the queue is full
			System.out.println(elem + " Not added!!!");
			System.out.println("The queue is full");
			display(); // displays the elements in the queue
		}
		else {
			queue[rear] = elem; // assigns the current index of the array the element "elem'
			rear = rear + 1 % max; // moves the index by rear +1 mod max to obtain a circular array
			display();
		}
	}
	// methhod to check the element at top of the queue 
	public String front() {
		if(isEmpty()) { // checks whther the queue is empty by looking at the boolean return value of the isEmpty method 
			System.out.println("the queue is empty: ");
			return null;
		}
		else {
			display();
			return queue[front]; // if the isEmpty method is false then the method returns the front value of the queue
			
		}
	 
	}
	// method to return the the element at the rear of the queue
	public String rear() {
		if(isEmpty()) {
			System.out.println("The stack id emtpy:");
			return null;
		}
		else {
				System.out.println("The element at the rare of the queue: " + queue[rear-1]);
				return queue[rear-1];
		}
		
	}
	// methods to display the total elements in the queue
	public void display (){
		if(isEmpty()) {
			System.out.println("The stack is Empty!!");
			}
		else {
			System.out.println("\tcurrent Elements in the queue: ");
			for(int i = rear-1; i >= front;i--) {
				System.out.println("\t\t"+queue[i]);
				
			}
			
		}
	}
	// loop to interact with the methods from the console
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int ch  ;
		do {
			System.out.println("---------------ALL POSSIBLE METHODS IN QUEUE DATA STRUCTURE---------");
			System.out.println("1. enqueue()\n2. front() and rare()\n3. isEmpty()\n4. dequeueu()\n5. size()\n6. display()\n7. isFull()\n8. Exit");
			System.out.println("Enter choice 1-8");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				try {
					System.out.println("-----------------------------------------");
				String elem;
				System.out.println("Enter element to add to the queue: ");
				 elem = sc.next();
				 enqueue(elem);
				 System.out.println("-----------------------------------------");
				}catch(Exception e) {
					System.out.println("The queue is full!!");
				}
				 	break;
			case 2:
				System.out.println("-------------------------------------------");
				System.out.println("element at front of the queue: "+front());
				  rear();
					break;
			case 3:
				System.out.println("check whether the queue is empty: " + isEmpty());
				System.out.println("-------------------------------------------");
				
					break;
			case 4:
				dequeue();
					break;
			case 5:
				System.out.println("-----------------------------------------");
				System.out.println("size of the queue: "+size());
				System.out.println("-----------------------------------------");
					break;
					
			case 6:
				System.out.println("-----------------------------------------");
				display();
				System.out.println("-----------------------------------------");
					break;
			case 7:
				System.out.println("-----------------------------------------");
				System.out.print("Check whether the queue is full: ");
				System.out.println(isFull());
				System.out.println("-----------------------------------------");
				break;
			case 8:
				System.out.println("exit");
				System.exit(0);
					break;
			default:
				System.out.println("invalid choice!!");
				break;
			
			}
			
		}while(ch != 8);
	}

}
