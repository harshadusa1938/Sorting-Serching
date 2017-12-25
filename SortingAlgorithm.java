/* Author Name: Harshad Patel
   Due Date: 12/07/2017
   Description:- Sorting Algorithm
   
   Create a class called SortingAlgorithms that takes an unsorted array and sorts it using
	selection sort and insertion sort. The program should include methods to sort using
	the selection sort and insertion sort algorithms. The array should be contain 10 int
	values. The program should output the array unsorted and then the array sorted with
	each method. The program should also include comments about how the sorting
	methods are sorting the array. This assignment is an exercise to understand how the
	algorithms work, therefore, it should be heavily commented.
*/

package com.sorting;

public class SortingAlgorithm
{
	//=========Start-Selection Sort===================
	public static int[] selectionSort(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[min_index]) 
                	min_index = j;
      
            int temp = array[min_index];  
            array[min_index] = array[i];
            array[i] = temp;
        }
        return array;
    }
	
	//=========Start-Insertion Sort===================
	
	 public static void insertionSort(int array[]) 
	    {
	        int n = array.length;
	        for (int j = 1; j < n; j++)
	        {
	            int key = array[j];
	            int i = j-1;
	            while ( (i > -1) && ( array [i] > key ) )
	            {
	                array [i+1] = array [i];
	                i--;
	            }
	            array[i+1] = key;
	            showInsertion(array);
	        }
	    }
	 
		private static void showInsertion(int[] arr1)
	    {    
	        for (int i = 0; i < arr1.length; i++) 
	        {
	            System.out.print(arr1[i] + ", ");
	        }
	        System.out.println("\n");
	    }
 
		
	 // Main Method for Both Algorithm like Selection Sort and Insertion Sort
    public static void main(String a[])
    {
    	System.out.print("-----------Selection Sort--------------- \n\n");
        int[] arr1 = {4, 2, 9, 6, 23, 12, 34, 0, 1};
       
        // Display Insertion Sort    
        insertionSort(arr1);
        System.out.print("\n-----------Insertion Sort--------------- \n\n");
        
        int[] arr2 = selectionSort(arr1);
        for(int i:arr2)
        {
            System.out.print(i);
            System.out.print(" | ");
            
        }      
        	System.out.print("\n\n---------------------------------------- \n");
    }
}