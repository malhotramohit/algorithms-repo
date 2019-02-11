package com.rms.geeks.arrayQ;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 2, 3, 4, 5, 1 }; // 1,2,3,4,5

		// method1 take auxillary space then add unique values in it
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			if (!list.contains(array[i])) {
				list.add(array[i]);
			}
		}
		//iterate
		Object[] arrayObj=list.toArray();
		for (int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}

	}

}
