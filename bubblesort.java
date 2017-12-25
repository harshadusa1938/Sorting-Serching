package com.sorting;

public class bubblesort 
{

	public int[] bubblesort(int[] list)
	{
		
		int i,j,temp=0;
		for(i=0;i<list.length-1;i++)
			for(j=i;j<list.length-1-i;j++)
				
				if(list[j]>list[j+1])
				{
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
					
				}
		return list;
	}
}
