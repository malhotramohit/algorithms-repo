package com.rms.generics;

public class UseGenericBasic {
	public static void main(String[] args) {
		Parcel<Book> parcel=new Parcel<Book>();
		parcel.setT(new Book());
		Book book=parcel.getT();
	}
}
