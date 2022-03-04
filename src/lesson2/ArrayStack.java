package lesson2;

import java.util.Scanner;

public class ArrayStack {
	// stack = > data structure that implements the last in first out protocol. the only accessible object in the  structure 
	// is the one inserted recently.
	
	private int[] arr;
	private int top; // index of last element to be added to the stack 
	public ArrayStack(int MAX) {
		arr = new int[MAX];
		top = -1; // position outside the stack => means that the stack is empty
	}
	// method to read the first element from the stack
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!!");
			return -1;
		}
		else {
			System.out.println("Value at the top of the stack: "+ arr[top]);
			return arr[top]; // => returns the top value of the stack 
		}
		
	}
	// method to add an element to a stack 
	public void push(int elem) {
	 
			if(isFull()) {
				System.out.println(elem+":Not added !!! The stack is full");
				
			}
			else {
				arr[++top] = elem; // => increaments the value of top and adds a new element
			System.out.println(elem+" : pushed in the stack! ");	
			System.out.print("current ");
			display();
			}
	 
		
	}
	// method to check whether the stack is empty or not 
	public boolean isEmpty() {
		if(top < 0) { //=> if the value of the top is less than zero then the stack is empty
			return true;
		}
		else { // value of the stack is 0 or greater then the stack is not empty
			return false;
		}
	}
	//  method to check if the stack  is full
	public boolean isFull() {
		if(top + 1== arr.length) { // full when the length of the array equals the index of the top element  + 1
			return true;
		}
		else {
			return false;
		}
	}
	// method to return the size of the stack 
	public int size() {
		if(isEmpty()) { // calls the isEmpty method and checks whether its return value True
			System.out.println("The stack is Empty!");
			return 0;
		}
		else return top+1; // the size of stack is the value of the top plus 1 since indexes start from zero so we add 1.
	}
	// method to remove an element from the stack pop()
	public int  pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
		    int y= arr[top--] ; // define a variable in which the value at the top of the stack is to be assigned. and then decreament the value of the tip by one to move to the next index of the elements. 
		    System.out.println(y + " removed from the stack!");
		    System.out.print("Current stack ");
		    display();
			return y;
			}
	 }
	// method to print the element in the stack
	public void display() {
		if(!isEmpty()) {
			System.out.println("Total Stack elements: ");
			for(int i = top; i > -1 ;i--) {
				System.out.println( + arr[i] );
			}
			System.out.println("\n");
		}
		else {
			System.out.println("There are no elements in the stack");
		}
		
		
	}
	// do while loop to interact with methods from the console...
	public void menu() {
	
		Scanner sc = new Scanner(System.in);
		int ch  ;
		do {
			System.out.println("---------------ALL POSSIBLE METHODS IN STACK DATA STRUCTURE---------");
			System.out.println("1. push()\n2. peek()\n3. isEmpty()\n4. pop()\n5. size()\n6. displaybv()\n7. isFull()\n8. Exit");
			System.out.println("Enter choice 1-8");
			ch = sc.nextInt();
			switch(ch) {
			case 1:
				int elem;
				System.out.println("Enter element to add to the stack: ");
				 elem = sc.nextInt();
				 push(elem);
				 	break;
			case 2:
				peek();
					break;
			case 3:
				System.out.println(	isEmpty());
					break;
			case 4:
	 			pop();
					break;
			case 5:
				
				System.out.println("size of the stack: "+size());
					break;
					
			case 6:
				display();
				System.out.println(isFull());
					break;
			case 7:
				System.out.print("Check whether the stack is full:   ");
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
