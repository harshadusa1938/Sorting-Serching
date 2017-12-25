
package com.sorting;

public class SortingAlgorithm1 
{

	public void Selection(int array[])
	{
		int n=array.length;
		
		for(int i=0;i<array.length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
				if(array[j]<array[min_index])
					min_index=j;
			
			int temp=array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
					
		}
	}  

	public void PrintSelection(int array[])
	{
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.println(array[i]);
	    }
	 }
	
 

	/*public void DisplaySelectionsort(int j)
	{
		int n=j.length;
		for(int i=0;i<n;i++)
			System.out.println(j[i]+" ");
		System.out.println();		
	} 
	*/

	public void Insertion(int array[])
	{
		int n=array.length;
		
		for(int i=0;i<array.length-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
				if(array[j]<array[min_index])
					min_index=j;
			
			int temp=array[min_index];
			array[min_index]=array[i];
			array[i]=temp;
					
		}
	}
	   
	public void PrintInserttion(int array[])
	{
	    for(int i=0;i<array.length;i++)
	    {
	    	System.out.println(array[i]);
	    }
	 }
	
	
/*
	public void DisplayInsertion(int array[])
	{
		int n=array.length;
		for(int i=0;i<n;i++)
			System.out.println(array[i]+" ");
		System.out.println();		
	}
	
*/
	
	public static void main(String[] args) 
	{
	    int array[] = {2,18,10,58,25,62,12,55,22};
		SortingAlgorithm1 sortingAlgo = new SortingAlgorithm1();
		sortingAlgo.Selection(array);
		sortingAlgo.Insertion(array);
	
		sortingAlgo.PrintInserttion(array);
		//sortingAlgo.PrintSelection(array);
		//sortingAlgo.printArray(array);
		//sortingAlgo.PrintInserttion(array);
		//System.out.println(sortingAlgo);
		
	  }	
	//}

}
