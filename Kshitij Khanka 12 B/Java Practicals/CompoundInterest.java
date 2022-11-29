import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[] args) {
		System.out.println("Welcome To Bank ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Principle Amount : ");
		int p = in.nextInt();
		System.out.print("Enter Rate Of Interest : ");
		double r = in.nextFloat();
		System.out.print("Enter Time Period : ");
		int t = in.nextInt();
		double amount = p;
		if(t >= 1){
		    for(int i = 0; i < t; i++ ){
		        amount = amount*(1 + (r/100));
		    }
		    System.out.println("Your total amount will be ₹ "+ amount);
		}
		else{
		    System.out.println("Please enter a valid Time Period");
		}
        in.close();
		
	}
}