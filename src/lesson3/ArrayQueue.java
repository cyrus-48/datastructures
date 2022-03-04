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
	//method to check the sixe of the queue
	public int size() {
		return (max-front + rear) % max;
	}
	// m,ethod to chech if the queue is empty
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
		if(queue.length == max-1) {
		 return true;	
		}
		else {
			return false;
		}
	}
	// method to dequeque or remove an element from the stack 
	public String dequeue() {
		if(isEmpty()) {
			System.out.println("The queue is empty");
			
			return null;
		}
		else {
			String temp;
			temp = queue[front];
			queue[front] = null;
			front = front+1 % max;
			display();
			return temp;
		}
	}
	public void  enqueue(String  elem) {
		if(isFull()) {
			System.out.println("The queue is full");
			display();
		}
		else {
			queue[rear] = elem;
			rear = rear + 1 % max;
			display();
		}
	}
	// ethhod to check the element at top of the queue 
	public String front() {
		if(isEmpty()) {
			System.out.println("the queue is empty");
			return null;
		}
		else {
			return queue[front];
			
		}
	 
	}
	public void display (){
		if(isEmpty()) {
			System.out.println("The stack is Empty");
			}
		else {
			System.out.println(" current Elements in the queue: ");
			for(int i = rear; i >= front;i--) {
				System.out.println(queue[i]);
				
			}
			
		}
	}
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int ch  ;
		do {
			System.out.println("---------------ALL POSSIBLE METHODS IN QUEUE DATA STRUCTURE---------");
			System.out.println("1. enqueue()\n2. front()\n3. isEmpty()\n4. dequeueu()\n5. size()\n6. display()\n7. isFull()\n8. Exit");
			System.out.println("Enter choice 1-8");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				try {
				String elem;
				System.out.println("Enter element to add to the queue: ");
				 elem = sc.next();
				 enqueue(elem);
				}catch(Exception e) {
					System.out.println("The queue is full");
				}
				 	break;
			case 2:
				System.out.println("element at the front of the queue"+front());
					break;
			case 3:
				System.out.println(	isEmpty());
					break;
			case 4:
				dequeue();
					break;
			case 5:
				
				System.out.println("size of the queue: "+size());
					break;
					
			case 6:
				display();
				System.out.println(isFull());
					break;
			case 7:
				System.out.print("Check whether the queue is full:   ");
				System.out.println(isFull());
				break;
			case 8:
				System.out.println("exit");
				System.exit(0);
					break;
			default:
				System.out.println("invalid choice!!");
			
			}
			
		}while(ch != 8);
	}

}
