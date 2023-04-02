import java.io.*;
import java.util.*;
class leapyear {
	public static void main(String[] args) {
		int yr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		yr = sc.nextInt();
		if(yr % 4 == 0) {
			System.out.println(yr+" is Leap Year");
		}
		else {
			System.out.println(yr+" is not an Leap Year");
		}
	}
}