import java.util.Scanner;
public class Pass_Fail
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int a = sc.nextInt();
    if(a>=50){
        System.out.println("You passed!");
    }
    else{
        System.out.println("You failed.");
    }
    
    sc.close();
	}
}