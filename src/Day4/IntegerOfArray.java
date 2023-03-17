package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerOfArray {
   public static void main(  String []args ) {
	   Scanner sc = new Scanner(System.in);
	int arr []  = new int [5];
	for( int i=0; i<5;i++) {
		System.out.println("enter the numbers into array at "+i+" index" );
		arr[i]= sc.nextInt();
		System.out.println("numbers are "+Arrays.toString(arr));
	}
	
}
}
