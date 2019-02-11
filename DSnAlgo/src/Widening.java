
public class Widening {
	public static void main(String[] args) {
		printInt(5);
		Integer i=new Integer(100000);
		System.out.println(i);
	}
	private static void  printInt(Integer i)
	{
		System.out.println(i);
	}
	private static void printInt(double d)
	{
		System.out.println(d);
	}
}
