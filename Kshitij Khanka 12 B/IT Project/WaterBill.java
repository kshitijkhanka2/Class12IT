import java.util.Scanner;
public class WaterBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.print("Enter Consumer ID : ");
        int id = in.nextInt();
        System.out.print("Enter your Mobile No. : ");
        long mob = in.nextLong();
        System.out.print("Enter your Meter No. : ");
        int meter = in.nextInt();        
        System.out.print("Enter your Connection type :-  \nFor Residential type r & Commercial type c) : ");
        String connection = in.next();
      System.out.print("Enter your Previous Reading : ");
        int pr = in.nextInt();
      System.out.print("Enter your Current Reading : ");
        int cr = in.nextInt();
        System.out.print("Enter Penalty Amount(if any) : ");
        int penalty = in.nextInt();
        System.out.print("Enter Previous Balance(if any) : ");
        int bal = in.nextInt();
        int units = cr-pr;
        double bill =0;
        switch (connection){
            case "r" :
            if(units <=6){
                bill =0;
            }else if(units > 6 && units <= 22.5 ){
                bill = units*4.63;
            }else if(units > 22.5 && units <= 30 ){
                bill = units*9.26;
            }else if(units > 30 ){
                bill = units*13.89;
            }else{
                System.out.println("Enter valid readings!");
            }
            break;
            case "c" :
                bill = units*57.88;
                break;
            default : System.out.println("Please enter valid response!");
        }
        System.out.println("________________");
        System.out.println();
        System.out.println("Fiscal Year : 2022-2023");
        System.out.println("Consumer ID: " +id);
        System.out.println("Consumer Name: "+name);
        System.out.println("Phone : "+mob);
        System.out.println("Meter number : "+meter);
        System.out.println("Connection type : "+connection);
        System.out.println("Previous Reading : "+pr);
        System.out.println("Current Reading : "+ cr);
        System.out.println("Total Units : "+units);
        System.out.println("Current Amount : rs"+bill);
        System.out.println("Penalty Amount : rs"+penalty);
        System.out.println("Previous Balance : rs"+bal);
        System.out.println("________________");
        System.out.println();
        System.out.println("Total Outstanding : rs"+(bill +bal +penalty));
        System.out.println();
        System.out.println("________________");
        in.close();
    }
}

