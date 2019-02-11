import java.io.IOException;

public class StringTest {
	
	
	//java call the one which is more specific i.e string and string is child of object class
	public void foo(Object o)
	{
		System.out.println("object");
	}
	public void foo(String s)
	{
		System.out.println("string");
	}
	
	
	//
	public void foo(Integer i)
	{
		System.out.println(i);
	}
	
	public void testExp(Object o)
	{
		System.out.println("obj");
	}
	public void testExp(Exception e) {
		System.out.println("Exception");
	}
	public void testExp(NullPointerException np)
	{
		System.out.println("NullPointerException");
	}
	
//	public void testExp(IOException ie)
//	{
//		System.out.println("IO");
//	}
	public static void main(String[] args) {
		StringTest test=new StringTest();
		test.testExp(null);
		//test.foo(null);
	}

}
