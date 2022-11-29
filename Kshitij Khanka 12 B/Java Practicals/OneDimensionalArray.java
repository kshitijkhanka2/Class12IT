public class OneDimensionalArray
{
	public static void main(String[] args) {
		int a[] = new int [5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println("The values of array is : ");
		for(int i = 0; i < a.length; i++){
		    System.out.print(a[i]+ " ");
		}

	}
}