import java.util.Scanner;
public class VowelsCheckUsingSwitch
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your word : ");
		String alphabet = sc.next();
		    switch (alphabet){
		    case "a":
		        System.out.println(alphabet +" is a vowel");
		        break;
		    case "e":
		        System.out.println(alphabet +" is a vowel");
		        break;
		    case "i":
		        System.out.println(alphabet +" is a vowel");
		        break;
		    case "o":
		        System.out.println(alphabet +" is a vowel");
		        break;
		    case "u":
		        System.out.println(alphabet +" is a vowel");
		        break;
		    default :
		        System.out.println(alphabet +" is not a vowel");
		        break;
		}
        sc.close();
		}
		
	}