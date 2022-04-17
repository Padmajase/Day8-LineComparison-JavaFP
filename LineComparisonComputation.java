import java.util.Scanner;
import java.lang.Math;

class UC1 {
	public static void main (String args[]) {
		System.out.println("Welcome  !");
		
		System.out.println("Enter values of  x1 y1 x2 y2");
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();	
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();	

		double length = Math.sqrt( Math.pow((x2 - x1), 2) + Math.pow( (y2- y1), 2));
		System.out.println(length);
	}
}