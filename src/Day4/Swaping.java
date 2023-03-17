package Day4;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num a");
		int x = sc.nextInt();
		System.out.println("enter num b");
		int y = sc.nextInt();
		swapFunction(x,y);
	}

	public static void swapFunction(int a , int b) {
		
		System.out.println("numbers before the swaping 'a' is " + a + " and 'b' id " + b);
		int n = a;
		a = b;
		b = n;
		System.out.println("numbers after the swaping 'a' is " + a + " and 'b' id " + b);
	}
}
