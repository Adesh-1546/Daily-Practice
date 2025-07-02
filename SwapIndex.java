package mock;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndex {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int [size];
		System.out.println("Enter Elements of array:");
		for (int i = 0 ; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < arr.length; i+=2 ) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i+1] = temp;
		}
		System.out.println(arr.toString());
		
	}

	
}
