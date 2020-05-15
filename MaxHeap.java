//We are going to implement a class for the maximum binary heaps based on integer arrays. 
//defining a class for the heaps such that it has only one member variable which is the reference to an array which keeps the content.

import java.util.Arrays;

class MaxHeap 
{ 
 private int[] Heap; 
 private int size; 
 private int max; 

 // Constructor  
 public MaxHeap(int maxsize) 
 { 
     this.max = maxsize; 
     this.size = 0; 
     Heap = new int[this.max + 1]; 
     Heap[0] = Integer.MAX_VALUE; 
 } 
 
 // To returns true if it is a leaf node 
 private boolean isLeaf(int position) 
 { 
     if (position >= (size / 2) && position <= size)
     { 
         return true; 
     } 
     return false; 
 } 
 
 //Parent node
 private int parent(int position) 
 { 
     return position / 2; 
 } 
 
 //Left and right children. 
 private int leftChild(int position) 
 { 
     return (2 * position); 
 } 
 private int rightChild(int position) 
 { 
     return (2 * position) + 1; 
 } 

 
 private void swap(int position1, int position2) 
 { 
     int tmp; 
     tmp = Heap[position1]; 
     Heap[position1] = Heap[position2]; 
     Heap[position2] = tmp; 
 } 

 // A recursive function to find max heap. 
 private void maxHeap(int position) 
 { 
     if (isLeaf(position)) 
     {
         return;
     }

     if (Heap[position] < Heap[leftChild(position)] ||   Heap[position] < Heap[rightChild(position)]) 
     { 

         if (Heap[leftChild(position)] > Heap[rightChild(position)])
         { 
             swap(position, leftChild(position)); 
             maxHeap(leftChild(position)); 
         } 
         
         else 
         { 
             swap(position, rightChild(position)); 
             maxHeap(rightChild(position)); 
         } 
     } 
 } 

 // Inserting a new element to max heap 
 public void insert(int element) 
 { 
	 Capacity();
     Heap[++size] = element; 

     int current = size; 
     while (Heap[current] > Heap[parent(current)]) 
     { 
         swap(current, parent(current)); 
         current = parent(current); 
     } 
 } 
 
 //Ensuring the max capacity of the Heap
 private void Capacity() 
 {
	    if (size == max) 
	    {
	      Heap = Arrays.copyOf(Heap, max * 2);
	      max = max * 2;
	    }
	  }

 //Displaying all of the element in the heap
 public void display() 
 { 
     for (int i = 1; i <= size / 2; i++) 
     { 
         System.out.print(" Parent : " + Heap[i] + " Left child : " + Heap[2 * i] + " Right child :" + Heap[2 * i + 1]); 
         System.out.println(); 
     } 
 } 

 //Deleting the maximum value from the heap  
 public int delete() 
 { 
	 Capacity();
     int delete = Heap[1]; 
     Heap[1] = Heap[size--]; 
     maxHeap(1); 
     return delete; 
 } 
 
 public void sort(int arr[]) 
 {
     int size = arr.length;
     for (int i = size / 2 - 1; i >= 0; i--)
         heap(arr, size, i);

     for (int i=size-1; i>=0; i--)
     {
         int x = arr[0];
         arr[0] = arr[i];
         arr[i] = x;
         heap(arr, i, 0);
     }
  }
 
 void heap(int arr[], int heapSize, int i) 
 {
     int largest = i; 
     int leftChild  = 2*i + 1; 
     int rightChild  = 2*i + 2; 

     if (leftChild  < heapSize && arr[leftChild ] > arr[largest])
         largest = leftChild ;

     if (rightChild  < heapSize && arr[rightChild ] > arr[largest])
         largest = rightChild ;

     if (largest != i) 
     {
         int swap = arr[i];
         arr[i] = arr[largest];
         arr[largest] = swap;
         heap(arr, heapSize, largest);
     }
 }

 public static void main(String[] args) 
 { 
	 //Finding the max value in the heap
     System.out.println("\nFinding the max value in the Heap for the set {5,3,17,10,84,19,6,22,9} is\n"); 
     MaxHeap maxHeap = new MaxHeap(15); 
     maxHeap.insert(5); 
     maxHeap.insert(3); 
     maxHeap.insert(17); 
     maxHeap.insert(10); 
     maxHeap.insert(84); 
     maxHeap.insert(19); 
     maxHeap.insert(6); 
     maxHeap.insert(22); 
     maxHeap.insert(9); 

     maxHeap.display(); 
     System.out.println("\nThe max value in the heap is " + maxHeap.delete()); 
     
     System.out.println("\nTest Case 1 for the heap sort");
     int arr[] = {6, 45, 57, 3, 11, 22, 34};

     System.out.println("Original array is: " + Arrays.toString(arr));
      maxHeap.sort(arr);

     System.out.println("Sorted array after Heap Sort is: " + Arrays.toString(arr));
     
     System.out.println("\nTest Case 2 for the heap sort");
     int arr1[] = {97, 106, 58, 35, 123, 002, 64};

     System.out.println("Second Original array is: " + Arrays.toString(arr1));
     maxHeap.sort(arr1);

     System.out.println("Sorted array after Heap Sort is: " + Arrays.toString(arr1));
     
 } 
} 
