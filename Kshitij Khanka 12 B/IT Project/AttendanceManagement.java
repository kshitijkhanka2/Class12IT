import java.util.Scanner;
public class AttendanceManagement {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int exit =0;
		while (exit == 0){
		    System.out.print("Choose action to be performed : \n 1.) Mark or View attendance \n 2.) View Roll no. of students \n 3.) Exit program.\n >> ");
		int action = sc.nextInt();
		if(action == 1){
		int[] finalAttendance = getAttendance();
		System.out.println("Total attendance = "+finalAttendance[0]);
		System.out.print("Names Of Students present : ");
		if(finalAttendance[1] == 1){
			System.out.print("Kshitij ");
		}
		if(finalAttendance[2] == 1){
			System.out.print(", Shreyash ");
		}
		if(finalAttendance[3] == 1){
			System.out.print(", Tanmay ");
		}
		if(finalAttendance[4] == 1){
			System.out.print(", Rahul ");
		}if(finalAttendance[5] == 1){
			System.out.print(", Sanjana ");
		}if(finalAttendance[6] == 1){
			System.out.print(", Aditi ");
		}
		System.out.print(".");
		exit =1;
		}else if(action == 2) {
		System.out.println("Roll no. of students are :- ");
		System.out.println("Roll No. -> Kshitij = 1, Shreyash =2, Tanmay = 3, Rahul = 4, Sanjana = 5, Aditi =6");
		}else if(action == 3){
		    exit = 1;
		}else{
		        System.out.println("Choose appropriate options.");
		        }
		        System.out.println();
		        System.out.println();
		}
	}
	static int[] getAttendance(){
	    int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

	    int attendance = 0;
	    int loop = 0;
	    while(loop == 0){
		System.out.print("Enter your Roll no.   (Enter 0 to view attendance & 10 to reset) : ");
		Scanner sc = new Scanner(System.in);
		int roll_no = sc.nextInt(); 
		switch (roll_no){
		    case 1 :
		  if(count1 ==0){
		    count1 = 1;
		    System.out.println("Good Morning Kshitij! Your attendance is marked.");
		    attendance = attendance + 1;
		    System.out.println();
		  }else{
		    System.out.println("Your attendance is already marked !");
		    System.out.println();
		    }
		    break;
		    case 2 :
		    if(count2 ==0){
				count2 = 1;
				System.out.println("Good Morning Shreyash! Your attendance is marked.");
				attendance = attendance + 1;
				System.out.println();
			  }else{
				System.out.println("Your attendance is already marked !");
				System.out.println();
				}
		   break;
		    case 3 :
			if(count3 ==0){
				count3 = 1;
				System.out.println("Good Morning Tanmay! Your attendance is marked.");
				attendance = attendance + 1;
				System.out.println();
			  }else{
				System.out.println("Your attendance is already marked !");
				System.out.println();
				}
		    break;
		    case 4 :
		    if(count4 ==0){
				count4 = 1;
				System.out.println("Good Morning Rahul! Your attendance is marked.");
				attendance = attendance + 1;
				System.out.println();
			  }else{
				System.out.println("Your attendance is already marked !");
				System.out.println();
				}
		    break;
		    case 5:
			if(count5 ==0){
				count5 = 1;
				System.out.println("Good Morning Sanjana! Your attendance is marked.");
				attendance = attendance + 1;
				System.out.println();
			  }else{
				System.out.println("Your attendance is already marked !");
				System.out.println();
				}
		    break;
		    case 6:
		    if(count6 ==0){
				count6 = 1;
				System.out.println("Good Morning Aditi! Your attendance is marked.");
				attendance = attendance + 1;
				System.out.println();
			  }else{
				System.out.println("Your attendance is already marked !");
				System.out.println();
				}
		   
		    break;
		    case 0 :
		    loop = 1;
		    System.out.println();
		    break;
		    case 10:
		    System.out.print("Proceed to reset the attendance (Y/N)  : ");
		    char confirmation = sc.next().charAt(0);
		    if(confirmation =='Y' || confirmation == 'y'){
		    System.out.println("The attendance is reset");
			count1 =0; count2 =0; count3=0; count4=0; count5=0; count6 =0;
			attendance = 0;
			System.out.println();
		    }else{
		        System.out.println("No changes were made.");
		        }
		    break;
		    default : 
		    System.out.println("Please input valid Roll no.");
			System.out.println();
			System.out.println();
		    }
		    }
			int[] values = new int [7];
			values[0] = attendance;
			values[1] = count1;
			values[2] = count2;
			values[3] = count3;
			values[4] = count4;
			values[5] = count5;
			values[6] = count6;
		    return values;
	    }
}