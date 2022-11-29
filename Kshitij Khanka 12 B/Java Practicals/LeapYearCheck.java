import java.util.Scanner;
public class LeapYearCheck
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your year : ");
		int year = sc.nextInt();
		int leap = year%4;
		if (leap == 0){
		    System.out.println("This is a leap year!");
		}
		else {
		    System.out.println("This is not a leap year!");
		}
        sc.close();
	}
}