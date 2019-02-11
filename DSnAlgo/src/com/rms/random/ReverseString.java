package com.rms.random;

public class ReverseString {
	public static void main(String[] args) {
		String s="mohit";
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		//non recursive solution
		String r=StringReverse(s);
		System.out.println(r);
		r=RecSrtingRev(s);
		System.out.println(r);
	}

	private static String StringReverse(String s) {
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+Character.toString(s.charAt(i));
		}
		return r;
		
	}
	private static String RecSrtingRev(String s)
	{
		String r="";
		if(s.length()==1)
		{
			return s;
		}
		else
		{
			return r=Character.toString(s.charAt(s.length()-1))+RecSrtingRev(s.substring(0, s.length()-1));
		}
		
	}
}
