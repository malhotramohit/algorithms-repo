package com.rms.geeks.arrayQ;

public class equib1 {

	public static void main(String[] args) {
		int[] array= {1,2,5,4,3,5};
		for(int i=1;i<array.length-1;i++)
		{
		  int sum1=calSum(array,i,0);
		  int sum2=calSum(array, i, 1);
		  if(sum1==sum2) {
			  System.out.println(array[i]);
			  break;
		  }
		}
	}

	private static int calSum(int[] array, int i, int j) {
		int sum=0;
		if(0==j)
		{
			for(int k=0;k<=i;k++)
			{
				sum=sum+array[k];
			}
			
		}
		else if (1==j)
		{
			for(int k=i;k<array.length;k++)
			{
				sum=sum+array[k];
			}
		}
		return sum;
	}
}
