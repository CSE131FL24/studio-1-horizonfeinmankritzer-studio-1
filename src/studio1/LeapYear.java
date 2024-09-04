package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year.");
		int year = in.nextInt();
		int remainderYear = year%4;
		int div = year%100;
		int divE = year%400;
		boolean leap;
		if ((remainderYear==0)&&(div>0)||(divE==0)) {
			leap = true;
			}
		else {
			leap = false;
		}
		System.out.println(year + " is a leap year: " + leap);
	}

}


// int, boolean, int, double, string, string, double
