
import java.util.Scanner;

public class Program2 {
	
	public static int a;
	public static double[] arr;
	public static int n[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number of elements in the array");
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		
		
		if (a > 0) {
			n = new int[a];
			if (a == (int) a) {

		
		System.out.println("Enter the elements in the array");
		arr=new double[(n.length)]; 
				
		for(int i=0; i< n.length; i++)
		{
			arr[i]= in.nextDouble(); 
		}
		
		int length=n.length;
		double max=greatest(arr, length);
			System.out.println("The greatest number in the array is "+max );
			}
	else {
		System.out.println("Enter a valid number");
	}
		}
		
		else
		{
			System.out.println("Wrong input value");
		}
	}
	static double greatest(double arr[], int length) 
    { 
       
        
        if(length == 1) 
            return arr[0]; 
              
            return Math.max(arr[length-1], greatest(arr, length-1)); 
    } 
}

 
