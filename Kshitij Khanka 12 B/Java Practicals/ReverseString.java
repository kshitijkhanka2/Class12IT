public class ReverseString {
    public static void main (String[] args) {
        
        String str= "hello", output="";
        char ch;
        
      System.out.print("Original word: ");
      System.out.println("hello");
        
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        output= ch+ output;
      }
      System.out.println("Reversed word: "+ output);
    }
}