import java.io.*;
import java.util.*;
class menudriven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t Main Menu \t\n");
		System.out.println("\n1. Area of Triangle\n 2. Area of Circle\n 3. Area of Rectangle\n");
		System.out.println("Enter any Choice (1-3) : ");
		int ch = sc.nextInt();
		switch(ch) {
			case 1: System.out.println("Enter the value of height and base : \n");
				int h = sc.nextInt();
				int bs = sc.nextInt();
				double aot = (0.5) * h * bs;
				System.out.println("Area of Triangle : "+aot);
				break;
			case 2: System.out.println("Enter the value of radius : \n");
				int rad = sc.nextInt();
				double aoc = 3.14 * rad * rad;
				System.out.println("Area of Circle : "+aoc);
				break;
			case 3: System.out.println("Enter the value of length and breadth : \n");
				int l = sc.nextInt();
				int b = sc.nextInt();
				double aor = l * b;
				System.out.println("Area of Rectangle : "+aor);
				break;
			default: System.out.println("Wrong Input");
				 break;
		}
	}
}