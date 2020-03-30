import java.io.BufferedReader;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.Scanner;

class IntBuff {

	int[] elements; // the content of the buffer
	int current_size; // the number of valid elements
	int[] elements1;
	int current_size1;

	public static void main(String args[]) throws IOException 
	{
		IntBuff intBuff = new IntBuff();
		
		intBuff.elements = new int[] { 51, 7, 89, 106, 2, 0, -18 };
		intBuff.current_size = intBuff.elements.length;
		
		intBuff.elements1 = new int[] { 64, 5, 97, 101, 2, 0, -18, 13, 2008 };
		intBuff.current_size1 = intBuff.elements1.length;

		System.out.println("Before Deletion");
		intBuff.println();
		intBuff.delete(3);
		System.out.println("\nAfter Deletion");
		intBuff.println();
		System.out.println("\nBefore Insertion");
		intBuff.println();
		
		intBuff.insert(5, -50);
		intBuff.append(-100);
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n{ 64, 5, 97, 101, 2, 0, -18, 13, 2008 }");
		System.out.println("\nEnter the search value for Linear search from the above set:");
	    int b = input.nextInt();
	    intBuff.linearSearch(b);
	    
	    System.out.println("\nEnter the search value for Binary search from the above set:");
	    int l = input.nextInt();
	    intBuff.binarySearch(l);
	    
	    System.out.println("\nElements after Insertion sort for another set of array");
	    intBuff.insertionSort();
	    
	}
	
	IntBuff() // initialize an empty buffer of maximum size 0
	{
		IntBuffer ib = IntBuffer.allocate(0);
		
	}

	// initialize an empty buffer of maximum size n
	IntBuff(final int n)
	{
		IntBuffer ib = IntBuffer.allocate(n);
		
	}
	// initialize a buff which is a copy of buff
	IntBuff(IntBuff buff) 
	{
		current_size=buff.current_size;
	}

	// append the value v to the buffer
	// return true if the operation is successful otherwise false
	boolean append(final int v) 
	{
		int i; 
		IntBuffer ib = IntBuffer.wrap(elements, 0, current_size); 
        int s[] = new int[current_size + 1]; 
        for (i = 0; i < current_size; i++) 
        	s[i] = elements[i]; 
  
        s[current_size] = v; 
 
        System.out.print("\n\nAfter Appending value to the previous buffer\n");
	    for(int j=0; j <= elements.length; j++)
		{
	    		  System.out.println(s[j]+" ");
	    }
	    
		return true;
	}

	// insert the value v to the buffer at the position of index
	// return true if the operation is successful otherwise false
	boolean insert(final int index, final int v) 
	{
		IntBuffer ib = IntBuffer.wrap(elements, 0, current_size);

		for (int i = 0; i < elements.length; i++) {

			if (i == index) {
				ib.put(5, -50);
				return true;
			}
		}
		return false;
	}

	// delete the element at the position of index in the buffer
	// return true if the operation is successful otherwise false
	boolean delete(final int index) 
	{
		boolean flag = false;
		IntBuffer ibb = IntBuffer.wrap(elements, 0, current_size);

		int[] anotherBuffer = new int[ibb.array().length - 1];
		for (int i = 0, k = 0; i < current_size; i++) {
			if (i == index) {
				flag = true;
				continue;

			}
			anotherBuffer[k++] = elements[i];

		}
		elements = anotherBuffer;
		current_size = elements.length;
		return flag;
	}

	// display all of the (valid) elements in the buffer
	void println() 
	{

		for (int i = 0; i < current_size; i++) {
			System.out.println(IntBuffer.wrap(elements).get(i));

		}

	}
	

	// Performing a linear search for the value of v in the buffer.
		public boolean linearSearch(final int v)
		{
			//IntBuffer ibb1 = IntBuffer.wrap(elements, 0, current_size1);

			int counter;
			
			for (counter = 0; counter < current_size1; counter++)
		      {
		         if (elements1[counter] == v) 
		         {
		           System.out.println(v+" is present at location "+(counter+1));
		          
		           break;
		         }
		      }
		      if (counter == current_size1)
		        System.out.println(v + " doesn't exist in array"); 
		        	        
		        return false;  
		        	}

	
		// Performing a binary search for the value of v in the buffer.
		public boolean binarySearch(final int v)
		{
			
			Arrays.sort(elements1);
 			System.out.println("After sorting");
 			for(int i=0; i < current_size1; i++)
 			{
 			 
 			System.out.print(elements1[i]+" ");
 			}
			
			int first, last, middle;
			first = 0;
		      last = current_size1 - 1;
		      middle = (first + last)/2;

		      while( first <= last )
		      {
		         if ( elements1[middle] < v )
		           first = middle + 1;
		         else if ( elements1[middle] == v )
		         {
		        	 System.out.println("\nElement "+v + " found at location " + (middle + 1));
		             break;
		         }
		         else
		         {
		             last = middle - 1;
		         }
		         middle = (first + last)/2;
		      }
		      
		      if ( first > last )
		          System.out.println("\nElement "+v + " is not found");
		      return true;		 			
		}
		

		// Sorting the elements (ascending order) in the buffer using insertion sort.
		public void insertionSort()
		{
			
			int i,j,p,temp;
			for (i = 1;i < current_size1; i++) 
			{ 
			 
			for (j=i-1; j >=0 && elements1[j+1]< elements1[j]; j--)
			{ 
			temp=elements1[j+1];
			elements1[j+1]=elements1[j];
			elements1[j]=temp;
			 
			} 
			 
			} 
			
			for(i=0; i < current_size1; i++)
			{
			 
			System.out.print(elements1[i]+" ");
			}
		}
	
	


}
