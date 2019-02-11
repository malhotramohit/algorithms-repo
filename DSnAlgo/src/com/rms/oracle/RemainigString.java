package com.rms.oracle;

import java.util.Scanner;

public class RemainigString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();
		String inputChar = sc.next();
		int count = sc.nextInt();
		// geeksforgeeks
		// thisisdmostring
		// i//3
		String result = getResultString(inputString, inputChar, count);
		if (null != result) {
			System.out.println(result);
		} else {
			System.out.println("Empty String");
		}

	}

	private static String getResultString(String inputString, String inputChar, int count) {
		String result = null;
		if (count == 0) {
			result = inputString;
		} else {
			int j = 0;
			int i = 0;
			for (; i < inputString.length(); i++) {
				if (inputString.charAt(i) == inputChar.charAt(0)) {
					j++;
					if (j == count) {
						break;
					}
				}
			}
			if (j == count && i <= inputString.length()) {
				result = inputString.substring(i + 1, inputString.length());
			}
		}
		return result;
	}
}
