import java.util.Scanner;
public class StringCaseLength
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word : ");
		String txt = sc.nextLine();
		System.out.println("The length of given String is "+ txt.length());
		System.out.println("Given String in upper case is "+ txt.toUpperCase());
		System.out.println("Given String in lower case is "+ txt.toLowerCase());
        sc.close();
	}
}