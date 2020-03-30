import java.util.Scanner;

public class Insertion {

	public void insertion(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;++i) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	  
	        System.out.println(); 
	    } 
	  
	public static void main(String args[]) {
		Insertion obj = new Insertion(); 
		Scanner in=new Scanner(System.in);
		int arr1[]=new int[10];
		int arr2[]=new int[6];
		System.out.println("Array1 enter 10 elements:");
		 for(int i=0;i<10;i++)
	            arr1[i]=in.nextInt();
		   
		 System.out.println("Array2 enter 6 elements:");  
		    for(int i=0;i<6;i++)
	            arr2[i]=in.nextInt();
		      
		    obj.insertion(arr1);
		    System.out.println("After insertion sort for array1:");
		    obj.printArray(arr1);
		    
		   
		    obj.insertion(arr2);
		    System.out.println("After insertion sort for array2:");
		    obj.printArray(arr2); 

		
	
	}
}
