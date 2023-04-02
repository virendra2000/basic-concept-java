import java.io.*;
import java.util.*;
class primenum {
	public static void main(String[] args) {
		int num;
		int i,count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to find Prime Number : \n");
		num = sc.nextInt();
		for(i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num+" is a Prime Number");
		}
		else {
			System.out.println(num+" is not a Prime Number");
		}
	}
}