import java.io.*;
import java.util.*;
class palindromenum {
	public static void main(String[] args) {
		int rem,number;
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find Palindrome : \n");
		number = sc.nextInt();
		int temp=number;
		while(number!=0) {
			rem = number%10;
			res = res * 10 + rem;
			number = number / 10;
		}
		if(res==temp) {
			System.out.println(temp+" is an Palindrome Number");
		}
		else {
			System.out.println(temp+" is not an Palindrome Number");
		}
	}
}