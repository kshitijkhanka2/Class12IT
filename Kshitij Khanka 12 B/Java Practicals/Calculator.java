import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		System.out.print("Choose an action to be performed( + ,  - ,  x ,  /  ) : ");
		Scanner in = new Scanner(System.in);
		String action = in.next();
		System.out.print("Enter 1st number: ");
		int a =in.nextInt();
		System.out.print("Enter 2nd number: ");
		int b =in.nextInt();
		int result;
		switch (action) {
		case "+" :
		    result = a+b;
			System.out.println("The sum of given numbers is = "+result);
			break;
		case "-" :
		    result = a-b;
			System.out.println("The difference of given numbers is = "+result);
			break;
		case "x" :
		    result = a*b;
			System.out.println("The product of given numbers is = "+result);
			break;
		case "/" :
		    result = a/b;
			System.out.println("The division of given numbers is = "+result);
			break;
		default :
			System.out.println("Please input correct operator");
		}
        in.close();
	}
}