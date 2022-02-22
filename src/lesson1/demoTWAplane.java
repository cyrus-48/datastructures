package lesson1;

import java.util.Scanner;

public class demoTWAplane {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String cap[] = {"AA0","AA1","AA2","AA3","AA4","AA5","AA6","AA7","AA8","AA9"};
		TWAplane tw = new TWAplane(cap);
		tw.menu();
		
		
	}
}
