import java.util.Scanner;
public class ElectricityBill
{
	public static void main(String[] args) {
		System.out.println("Enter units : ");
		Scanner in = new Scanner(System.in);
		double units = in.nextFloat();
		double bill = 0;
		if(units <= 100){
		    bill = units*8;
		}else if(units <= 300){
		    bill = (units*8)+(units - 100)*2;
		}else if(units > 300){
		    bill = (units*8)+(units - 300)*3;
		System.out.println("Your Electricity bill is ₹ " + bill);
	}
    in.close();
}
}
