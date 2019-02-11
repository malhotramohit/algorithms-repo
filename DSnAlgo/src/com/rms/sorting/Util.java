package com.rms.sorting;

import java.util.Random;

public class Util {

	public static int[] getInputArrayOfSize(int n,int size) {
		int[] array = new int[n];
		Random ran = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = ran.nextInt(size);
		}
		return array;
	}

}
