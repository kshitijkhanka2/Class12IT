import java.util.Scanner;
public class SwappingNumbers {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter 1st number : ");
  int a = in.nextInt();
  System.out.print("Enter 2nd number : ");
  int b = in.nextInt();
  a = a + b;
  b = a - b;
  a = a - b;
  System.out.println("First number is : "+a);
    System.out.println("Secondary number is : "+b);
    in.close();
 }
}