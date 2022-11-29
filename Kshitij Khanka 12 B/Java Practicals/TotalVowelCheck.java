import java.util.*;
public class TotalVowelCheck {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your word : ");
	String line = sc.nextLine();
	int c = 0;
	int v = 0;
	for(int i=0; i < line.length(); i++){ 
	    char word = line.charAt(i);
	    if(word == 'a' || word =='e' || word =='i' || word =='o' || word == 'u' || word == 'A' || word =='E' || word =='I' || word =='O' || word == 'U'){
	        v++;
	    }
	    else{
	        c++;
	    }
       
	}
		
        System.out.println("Total no. of Vowels is : " + v);
	System.out.println("Total no. of Consonants is : " + c);
    sc.close();
	}
}