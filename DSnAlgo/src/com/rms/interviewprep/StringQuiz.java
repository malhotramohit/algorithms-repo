package com.rms.interviewprep;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringQuiz {
	public static void main(String[] args) {
		String s1="abcdefbmnb";
		String s2="abc";
		System.out.println("s1==s2"+s1==s2);
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.replaceAll("b", ""));
		
		System.out.println("subseq==substr :"+(s1.substring(0, 4)==s1.subSequence(0, 4)));
		
		char[] cArray=s1.toCharArray();
		System.out.println(cArray);
		char[] nn=new char[6];
		s1.getChars(2, 6, nn, 1);
		System.out.println(nn);
		
		//lets get the bytes from the string 
		String b1="aAMohit";
		byte[] byteArray=b1.getBytes();
		System.out.println(Arrays.toString(byteArray));
		
		//let's get by providing the charset
		byte[] byteArray2;
		byteArray2 = b1.getBytes(StandardCharsets.UTF_8);
		System.out.println(Arrays.toString(byteArray2));
		
		//convert byte array to string
		byte[] bstr1= {97,110,65,89};
		String str1=new String(bstr1);
		String str2=new String(bstr1, 1, 1);
		System.out.println(str2);
	}
}
