package Day4;

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
    	 System.out.println("Enter the Character into the array");
    	 char[] a = sc.next().toCharArray();
    	   for(int i=0;i<a.length;i++) {
    		   System.out.println(a[i]);
    		 
    	   }
		System.out.println(Arrays.toString(a));
	}
}
