import java.io.*;
import java.util.*;
class minofarray {
	public static void main(String args[]) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array Required : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int min = 0;
		System.out.println("Enter the element of array : ");
		for(i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		min = arr[0];
		for(i=1;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Displaying Array of Elements you have entered : ");
		for(i=0;i<size;i++) {
			System.out.print(" " + arr[i] + " ");
		}
		System.out.println("\n");
		System.out.println("\nMinimum of Array Elements is : " + min);
	}
}