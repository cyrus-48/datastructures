package lesson4_liinkedlist;


import java.util.Scanner;

public  class LinkedList <T> {
	// iplement a node
	private static class Node<T>{
		private T element ;
		private Node<T> next;
		public Node(T e, Node<T> n ) {
			element = e;
			next = n;
		}
		public T getElement() {
			return element;
		}
		
		public Node<T> getNext(){
			return next;
			
		}
		public void setNext(Node<T> n ) {
			next = n;
		}
		
	}
	// linked list
	private Node<T> first = null;
	private Node<T> last = null ;
	private int size = 0;
	public LinkedList() {}
	//method to get the size if the list
		public int getSize() {
			return size;
			}
	// method to checkif the list is empty
		public boolean isEmpty() {
			return size == 0;
		}
	
	public T first() {
		if(isEmpty()) {
			return null;
		}
		return first.getElement();
	}
	public T last() {
		if(isEmpty()) {
			return null;
		}
		return last.getElement();
	}
	// method to add an element from the head of the list
	public void addFirst(T e) {
		Node<T> newN = new Node<>(e, first);
		if(size == 0 ) {
			first = last;
		}
		first = newN;
		size++;
		System.out.printf("added head node: ", first.getElement() + " element");
	}
	// method to add element to the last node
	
	public void addLast(T e) {
		Node<T> newNode = new Node<>(e, null) ; // create a new node for the element to be added 
			if(isEmpty()) {
				first = newNode;
			}else {
				last.setNext(newNode);
			}
		last = newNode;
		size++;
		System.out.printf("added head node: ", first.getElement() + " element");
		
	}
	// add a node at a specific node
	public void addAtLoc(int index , T elemm) {
		Node<T> newNode = new Node<T>(elemm,null);
		newNode.element = elemm;
		newNode.next = null;
		/*
		 * traverse the list from thr first node to the last
		 */
		Node<T> n = first;
		if(index == 0) {
			addFirst(elemm);
		}
		else {
			for(int i = 0;i < index-1;i++) {
				n = n.next;
			}
		}
		newNode.next = n.next;
		n.next = newNode;
		
	}
	// method to remove an element from the first node
	public T removeFirst() {
		if(isEmpty()) {
			return null;
		}
		T an = first.getElement(); // create a new el
		first = first.getNext();
		size--; // decreament the size after removing the node
		if(size == 0) {
			last = null;
		}
		System.out.println("removed head node with element: "+ an);
		return an; // return the removed element .
	}
	// get elements in the list
	public void displayList() {
		  Node<T> current = first;    
          
	        if(first == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes in the linked list: : ");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.println("\t [ " + current.element + " ]");    
	            current = current.next;    
	        }    
	        System.out.println();   
	       
	        } 
	   public static void clearScreen() {  
           System.out.print("\033[H\033[2J");  
           System.out.flush();
	    }    
		
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	     LinkedList ll = new LinkedList();
	     int ch;
	     do {
	    	 System.out.println("1. isEMpty()\n2. first()\n3. last()\n4. addFirst()\n5. addLast()\n"
	    	 		+ "6. removeFirst()\n7. getSize()\n8. Display()\n9. insertAtLOc()\n0. exit()");
	    	 System.out.println("Enter option: ");
	    	 ch  = sc.nextInt();
	    	switch(ch) {
	    	case 1:
	    		// list is emmpty
	    		System.out.println("list is empty?: "+ ll.isEmpty());
	    		//clearScreen();
	    		break;
	    	case 2:
	    	    // chekc the first element in the list
	    		System.out.println("First element: " + ll.first());
	    		//clearScreen();
	    		break;
	    	case 3:
	    		System.out.println("Last element in the list: " + ll.last());
	    		//clearScreen();
	    		break;
	    	case 4:
	    		// add an element to the first node
	    	    String elem;
	    	    System.out.println("Enter element to be added to the list from the first node: ");
	    	    elem = sc.next();
	    	    ll.addFirst(elem);
	    	    System.out.println("Element added!!");
	    	   // clearScreen();
	    	    break;
	    	case 5:
	    		// add an element to the last node
	    	    String eleml;
	    	    System.out.println("Enter element to be added to the list from the last node: ");
	    	    eleml = sc.next();
	    	    ll.addFirst(eleml);
	    	    System.out.println("Element added!!");
	    	   // clearScreen();
	    	    break;
	    	case 6: 
	    		// remove element from the first node
	    		ll.removeFirst();
	    		System.out.println("The first element removed::!");
	    		//clearScreen();
	    		break;
	    	case 7:
	    		// get the size of the list
	    		System.out.println("Get the size of the list: " + ll.getSize());
	    		//clearScreen();
	    		break;
	    	case 8:
	    		// get the elements in list 
	    		System.out.println("display all the elements in the list: ");
	    		ll.displayList();
	    		//clearScreen();
	    		break;
	    	case 9:
	    		// add an element at a specific location
	    		int index;
	    		String  elemm;
	    		System.out.println("Enter the element to be added: ");
	    		elemm = sc.next();
	    		System.out.println("ENter index at which the element is to be added: ");
	    		index = sc.nextInt();
	    		ll.addAtLoc(index , elemm); 		
	    		
	    		break;
	    		
	    	case 0:
	    		 System.exit(0);
	    		
	    	    
	    		
	     }
	  }while(ch!=0);
	}

}
