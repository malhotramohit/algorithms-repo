package com.rms.geeks.arrayQ;

public class equib2 {
	public static void main(String[] args) {
		int[] arr= {1,2,5,4,3,5};
		//1,3,8,12,15,20
		int[] prefix=sum(arr,0);
		//20,19,17,12,8,5
		int[] suffix=sum(arr,1);
		for(int i=0;i<arr.length;i++)
		{
			if(prefix[i]==suffix[i])
			{
				System.out.println(arr[i]);
				break;
			}
		}
		
	}

	private static int[] sum(int[] arr,int j) {
		int[] retArray=arr.clone();
		if(0==j)
		{
			for (int i = 1; i < retArray.length; i++) {
				retArray[i]=retArray[i]+retArray[i-1];
			}
		}
		else
		{
			for (int i = retArray.length-2; i >= 0; i--) {
				retArray[i]=retArray[i]+retArray[i+1];
			}
		}
		return retArray;
	}
}
