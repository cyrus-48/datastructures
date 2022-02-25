package lesson2;

import java.util.Scanner;

public class ArrayStack {
	// stack = > data structure that implements the last in first out protocol. the only accessible object in the  structure 
	// is the one inserted recently.
	
	private int[] arr;
	private int top; // index of last element to be added to the stack 
	public ArrayStack(int cap) {
		arr = new int[cap];
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
		if(top == arr.length-1) {
			System.out.println("The stack is full");
		}
		else {
			arr[++top] = elem; // => increaments the value of top and assigns  a new adds a new element
		System.out.println(elem+" : pushed in the stack! ");	
		System.out.print("current ");
		print();
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
	// method to return the size of the stack 
	public int size() {
		if(isEmpty()) {
			System.out.println("Empty!");
			return 0;
		}
		else return top+1;
	}
	// method to remove an element from the stack
	public int  pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		else {
		    int y= arr[top--] ;
		    System.out.println(y + " removed from the stack!");
		    System.out.print("Current stack ");
		    print();
			return y;
			}
	 }
	// method to print the element in the stack
	public void print() {
		if(!isEmpty()) {
			System.out.println("Stack elements: ");
			for(int i = top; i > -1 ;i--) {
				System.out.println( + arr[i] );
			}
			System.out.println("\n");
		}
		else {
			System.out.println("There are no elements in the stack");
		}
		
		
	}
	public void menu() {
	
		Scanner sc = new Scanner(System.in);
		int ch  ;
		do {
			System.out.println("1. push()\n2. peek()\n3. isEmpty()\n4. pop()\n5. size()\n6. print()\n7. Exit");
			System.out.println("Enter choice 1-5");
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
				print();
					break;
			case 7:
				System.out.println("exitted");
				System.exit(0);
					break;
			default:
				System.out.println("invalid choice!!");
			
			}
			
		}while(ch != 7);
		}
	

}
