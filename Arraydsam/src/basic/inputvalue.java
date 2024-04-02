package basic;

import java.util.Scanner;

public class inputvalue {
	public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
    System.out.println("enter a number");
    int n =sc.nextInt();
    int arr[] = new int[n];
    System.out.println("enter a element");
    for (int i = 0; i < n; i++) {
    	arr[i] = sc.nextInt();}
  
    for (int i = 0; i < arr.length; i++) {
    	System.out.println(arr[i] + " ");
		
	}
		
	}


}
