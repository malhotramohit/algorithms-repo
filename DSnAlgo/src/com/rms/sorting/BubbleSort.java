package com.rms.sorting;

public class BubbleSort {
	
	public static void main(String[] args) {
		//Input array
		int[] inputArray=Util.getInputArrayOfSize(10,100);
			//{23,2,6,20,8,10,15};

		//Method call to sort the array passing by reference
		bubbleSort(inputArray);
		
		//Iterate over the sorted array
		for (int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i]);
		}
	}

	private static void bubbleSort(int[] inputArray) {
		
		int size=inputArray.length;
		
		//Outer loop will run O(n) i.e. the for the complete length of array
		for(int i=0;i<size;i++)
		{
			//Inner loop will n-1 for i=0 , n-2 for i=1 hence decreasing 
			for(int j=0;j<size-i-1;j++)
			{
				if(inputArray[j]>inputArray[j+1])
				{
					//Swap operation without using third variable
					inputArray[j]=inputArray[j]+inputArray[j+1]; // a=2 b=3 , --> a=5
					inputArray[j+1]=inputArray[j]-inputArray[j+1]; // b=a-b, --> 5-3=2
					inputArray[j]=inputArray[j]-inputArray[j+1]; // a=a-b, --> 5-2=3
				}
			}
		}
	}

}
