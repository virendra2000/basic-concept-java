import java.io.*;
import java.util.*;
class factorial {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = sc.nextInt();
		int i,f=1;
		for(i=1;i<=n;i++)  {
			f=f*i;
		}
		System.out.println("Factorial of "+n+" is : "+f);
	}
}