package com.rms.geeks.arrayQ;

public class RemoveDupFromSortedArray {
	public static void main(String[] args) {
		int[] array= {1,2,2,3,3,3,4,4,5,5,5,6,7,90,99};
		
		int j=0;
		for (int i = 0; i < array.length-1; i++) {
			
			//compare adjacent
			if(array[i]!=array[i+1])
			{
				 array[j++]=array[i];
				
			}
		}
		array[j++]=array[array.length-1];
		for (int i = 0; i < j; i++) {
			System.out.println(array[i]);
		}
		
		
	}

}
