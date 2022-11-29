import java.util.Scanner;
public class Circle
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
    System.out.print("Give a radius: ");
    double r = sc.nextInt();
    double b = 2*3.14*r;
    double c= 3.14*r*r;
    System.out.println("Perimeter of circle is = "+b+" units");
    System.out.println("Area of circle is = "+c+" sq.units");
        sc.close();
	}
}