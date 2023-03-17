package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of elements ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("enter the elements in array");
		int sum = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
			sum = sum + arr[i];

		}
		System.out.println("sum of the array elements are :" + sum);
		System.out.println("Elements of the array are: " + Arrays.toString(arr));
	}

}
