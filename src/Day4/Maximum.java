package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number of elements ");
	int num = sc.nextInt();
	int arr[] = new int[num];
	System.out.println("enter the elements in array");
	int sum = 0;
	for (int i = 0; i < num; i++) {
		arr[i] = sc.nextInt();
		
	}
	Arrays.sort(arr);
	System.out.println("Maximum element of the array are :" + arr[arr.length-1]);
	System.out.println("Elements of the array are: " + Arrays.toString(arr));
}
}
