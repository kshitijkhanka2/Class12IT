import java.util.Scanner;
public class Even_odd {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Give a number  ");
    int a = sc.nextInt();
    int b = a%2;
    if(b == 0){
     System.out.println("This number is even.");   
    }else{
    System.out.println("This number is odd.");
    }
    int c = a - 1;
    int d = a + 1;
    System.out.println("The previous number is " + c);
        System.out.println("The next number is " + d);
    sc.close();
    }
}