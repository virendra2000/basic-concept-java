import java.io.*;
import java.util.*;
class evenodd {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check entered number is even or odd : \n");
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println(num+" is an Even Number");
		}
		else {
			System.out.println(num+" is an Odd Number");
		}
	}
}