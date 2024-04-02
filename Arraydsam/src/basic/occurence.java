package basic;

import java.util.Scanner;

public class occurence {
	static int occureence(int[] arr ,int x) {
		int count = 0;
		int ans =0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] ==x) {
				count++;
				ans =arr[i];}
			}
		return count;
	}
		static int loccureence(int[] value ,int w) {
			int lastOcc = 0;
		for (int i = 0; i < value.length; i++) {
			if (value[i] ==w) {
				lastOcc =	i	;	}}
			return lastOcc;
			}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a no");
		int n =sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter " +" " + n + " " +"no of element");
        for (int i = 0; i < arr.length; i++) {
        	arr[i] =sc.nextInt();
  }
        System.out.println("enter a x");
        int x = sc.nextInt();
       System.out.println("count of x" +" " +occureence(arr, x)  );
        System.out.println("lastindex of x" +"------ " +loccureence(arr, x)  );
	}

}
