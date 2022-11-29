import java.util.Scanner;
public class Rectangle
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
    System.out.print("Give dimension of length: ");
    double a = sc.nextInt();
    System.out.print("Give dimension of breadth: ");
    double b = sc.nextInt();
    double perimetre= 2*(a+b);
    double area= a*b;
    System.out.println("Perimetre of rectangle is = "+perimetre+"units");
    System.out.println("Area of rectangle is = "+area+"units");
    sc.close();

	}
}