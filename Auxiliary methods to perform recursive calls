//The following methods is an implementation of previous "Buffer of integers" class.
//Notice that you need auxiliary methods for internal use to perform recursive calls.

import java.util.Arrays;
import java.util.Scanner;

class IntBuff {

	int[] elements; // the content of the buffer
	int current_size; // the number of valid elements
	
	IntBuff() // initialize an empty buffer of maximum size 0
	{
		current_size=0;
	}

	// initialize an empty buffer of maximum size n
	IntBuff(final int n)
	{
		elements= new int[n];
		current_size=0;
		
	}
	// initialize a buff which is a copy of buff
	IntBuff(IntBuff buff) 
	{
		elements=Arrays.copyOf(buff.elements, buff.elements.length);
		current_size=buff.current_size;
	}

	// append the value v to the buffer
	// return true if the operation is successful otherwise false
	boolean append(final int v) 
	{

		elements[current_size]=v;
		current_size++;
        
		return true;
	}

	// insert the value v to the buffer at the position of index
	// return true if the operation is successful otherwise false
	boolean insert(final int index, final int v) 
	{
		int[] result = new int[elements.length+1];
	    for(int i = 0; i < index; i++)
	    {
	    result[i] = elements[i];
	    }
	   
	    result[index] = v;
	    
	    for(int i = index + 1; i <= elements.length; i++) 
	    {
	        result[i] = elements[i - 1];
	    }
	    
	    System.out.print("\nAfter Inserting "+ v  +"\n");
	    for(int j=0; j <= elements.length; j++)
		{
		 
		System.out.print(result[j]+" ");
		}
	    
	    return true;
	}

	// delete the element at the position of index in the buffer
	// return true if the operation is successful otherwise false
	boolean delete(final int index) 
	{
		boolean flag = false;
		
		int[] anotherBuffer = new int[current_size - 1];
		for (int i = 0, k = 0; i < current_size; i++) 
		{
				if (i == index)
				{
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
		for(int i=0; i < current_size; i++)
		{
			System.out.print(elements[i]+" ");
		}
		System.out.println();
	}
	

	// Performing a linear search for the value of v in the buffer.
		public boolean linearSearch(final int v)
		{
			
			int counter;
			
			for (counter = 0; counter <= current_size; counter++)
		      {
		         if (elements[counter] == v) 
		         {
		           System.out.println(v+" is present at location "+(counter));
		          
		           break;
		         }
		      }
		      if (counter == current_size)
		        System.out.println(v + " doesn't exist in array"); 
		        	        
		        return false; 
		}
		        	
		// Performing a binary search for the value of v in the buffer.
		public boolean binarySearch(final int v)
		{
			Arrays.sort(elements);
 			System.out.println("After sorting");
 			for(int i=0; i <current_size; i++)
 			{
 			 
 			System.out.print(elements[i]+" ");
 			}
			
			int first, last, middle;
			first = 0;
		      last = current_size - 1;
		      middle = (first + last)/2;

		      while( first <= last )
		      {
		         if ( elements[middle] < v )
		           first = middle + 1;
		         else if ( elements[middle] == v )
		         {
		        	 System.out.println("\nElement "+v + " found at location " + (middle));
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
			
			int i,j,temp;
			for (i = 1;i < current_size; i++) 
			{ 
			 
			for (j=i-1; j >=0 && elements[j+1]< elements[j]; j--)
			{ 
				temp=elements[j+1];
				elements[j+1]=elements[j];
				elements[j]=temp;
			}
			}
	
			for(i=0; i < current_size; i++)
			{
				System.out.print(elements[i]+" ");
			}
		}
		
		
		// Sorting the elements (ascending order) in the buffer using quicksort.
		
			int partition(int elements2[], int low, int high) 
		    { 
		        int pivot = elements2[high];  
		        int index = (low-1);  
		        for (int j=low; j<high; j++) 
		        {  
		            if (elements2[j] <= pivot) 
		            { 
		            	index++; 
		  
		                int temp = elements2[index]; 
		                elements2[index] = elements2[j]; 
		                elements2[j] = temp; 
		            } 
		        } 
		  
		        int temp = elements2[index+1]; 
		        elements2[index+1] = elements2[high]; 
		        elements2[high] = temp; 
		  
		        return index+1; 
		    } 
			
			public void quicksort(int elements2[], int low, int high) 
		    { 
		        if (low < high) 
		        {
		            int pi = partition(elements2, low, high); 
		  
		            quicksort(elements2, low, pi-1); 
		            quicksort(elements2, pi+1, high); 
		        } 
		    } 
			
		

		// Sorting the elements (ascending order) in the buffer using merge sort.
		void merge(int elements2[], int l, int m, int r) 
		    { 
		     
		        int n1 = m - l + 1; 
		        int n2 = r - m;
		        int L[] = new int [n1]; 
		        int R[] = new int [n2]; 
		  
		        for (int i=0; i<n1; ++i) 
		            L[i] = elements2[l + i]; 
		        for (int j=0; j<n2; ++j) 
		            R[j] = elements2[m + 1+ j]; 
		        
		        int i = 0, j = 0;  
		        int k = l; 
		        while (i < n1 && j < n2) 
		        { 
		            if (L[i] <= R[j]) 
		            { 
		            	elements2[k] = L[i]; 
		                i++; 
		            } 
		            else
		            { 
		            	elements2[k] = R[j]; 
		                j++; 
		            } 
		            k++; 
		        } 
		  
		        
		        while (i < n1) 
		        { 
		        	elements2[k] = L[i]; 
		            i++; 
		            k++; 
		        } 
		        while (j < n2) 
		        { 
		        	elements2[k] = R[j]; 
		            j++; 
		            k++; 
		        } 
		    } 
		   
		    public void mergesort(int elements2[], int l, int r) 
		    { 
		        if (l < r) 
		        {  
		            int m = (l+r)/2; 
		            mergesort(elements2, l, m); 
		            mergesort(elements2 , m+1, r); 
		  
		            merge(elements2, l, m, r); 
		        } 
		    }
		  
		}

class Assignment7
{
	public static void main(String args[])  
	{
		IntBuff intBuff = new IntBuff(7);
		
		intBuff.append(51);
        intBuff.append(7);
        intBuff.append(89);
        intBuff.append(106);
        intBuff.append(2);
        intBuff.append(0);
        intBuff.append(-18);
        		
		
		intBuff.current_size = intBuff.elements.length;
		System.out.println("Before Deletion");
		intBuff.println();
		intBuff.delete(3);
		System.out.println("\nAfter Deletion");
		intBuff.println();
		System.out.println("\nBefore Insertion");
		intBuff.println();
		intBuff.insert(5, -50);
		IntBuff intBuff1 = new IntBuff(10);
		
		intBuff1.append(64);
        intBuff1.append(5);
        intBuff1.append(97);
        intBuff1.append(101);
        intBuff1.append(2);
        intBuff1.append(0);
        intBuff1.append(-18);
        intBuff1.append(13);
        intBuff1.append(2008);
			
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n{ 64, 5, 97, 101, 2, 0, -18, 13, 2008 }");
		intBuff1.current_size = intBuff1.elements.length;
		System.out.println("\nEnter the search value for Linear search from the above set:");
	    int b = input.nextInt();
	    intBuff1.linearSearch(b);
	    
	    System.out.println("\nEnter the search value for Binary search from the above set:");
	    int l = input.nextInt();
	    intBuff1.binarySearch(l);
	    
	    System.out.println("\nElements after Insertion sort for another set is");
	    intBuff1.insertionSort();
	    IntBuff intbuff = new IntBuff(8);
		

 		intbuff.append(6);
 		intbuff.append(5);
 		intbuff.append(7);
 		intbuff.append(10);
 		intbuff.append(0);
 		intbuff.append(1);
 		intbuff.append(-1);
 		intbuff.append(3);

		intbuff.current_size = intbuff.elements.length;
	    
	    System.out.println("\n\nElements before Quick sort for third set is");
	    intbuff.println();
	    System.out.println("\nElements after Quick sort for third set is");
	    
	    intbuff.quicksort(intbuff.elements, 0, intbuff.current_size-1) ;
	    intbuff.println(); 
	    
	    IntBuff intbuff2 = new IntBuff(intBuff);          //copy constructor
	    
	    intbuff2.mergesort(intbuff.elements, 0, intbuff.elements.length-1); 
  
        System.out.println("\nElements after Merge sort for third set is"); 
        intbuff.println();
        }

	
}




