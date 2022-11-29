import java.util.Scanner;
public class WeekdayCheck
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word : ");
		int day = sc.nextInt();
		if (day <= 7){
		    switch (day){
		    case 1:
		        System.out.println("Today is Monday");
		        break;
		    case 2:
		        System.out.println("Today is Tuesday");
		        break;
		    case 3:
		        System.out.println("Today is Wednessday");
		        break;
		    case 4:
		        System.out.println("Today is Thursday");
		        break;
		    case 5:
		        System.out.println("Today is Friday");
		        break;
		    case 6:
		        System.out.println("Today is Saturday");
		        break;
		    case 7:
		        System.out.println("Today is Sunday");
		        break;		        
		}
		}
		else {
		    System.out.println("Day number is invalid.");
		}
        sc.close();
	}
}