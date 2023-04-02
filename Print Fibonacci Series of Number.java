import java.io.*;
import java.util.*;
class fibonacci {
	public static void main(String[] args) {
		int i;
		int a=0;
		int b=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number to find fibonacci series");
		int n = sc.nextInt();
		System.out.print(a+" "+b);
		for(i = 0;i < n;i++) {
			int c = a + b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}
}