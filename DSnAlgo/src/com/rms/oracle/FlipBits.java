package com.rms.oracle;

public class FlipBits {

	public static void main(String[] args) {
		String str = "0001010111";// 001--010-101
		System.out.println(Math.min(getMinFlipCount(str, '0'), getMinFlipCount(str, '1')));
	}

	private static int getMinFlipCount(String str, char expected) {
		int flipCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != expected) {
				flipCount++;
			}
			expected = flip(expected);
		}

		return flipCount;
	}

	private static char flip(char expected) {
		return expected == '0' ? '1' : '0';
	}

}
