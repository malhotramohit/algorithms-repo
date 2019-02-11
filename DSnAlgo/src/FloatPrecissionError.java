import java.math.BigDecimal;

public class FloatPrecissionError {
	public static void testWithFloat() {
		float a=0.1f;
		float b=0.1f;
		float c=0.1f;
		
		float d=a+b+c;
		float e=d*3;
		float f=d*100000;
		
		System.out.println("d "+d);
		System.out.println("e "+e);
		System.out.println("f "+f);
		
		
	}
	public static void testWithDouble() {
		double a=0.1;
		double b=0.1;
		double c=0.1;
		
		double d=a+b+c;
		double e=d*3;
		double f=d*100000;
		
		System.out.println("d "+d);
		System.out.println("e "+e);
		System.out.println("f "+f);
		
		
	}
	
	public static void testWithBigDecimal() {
		BigDecimal a=new BigDecimal("0.1");
		BigDecimal b=new BigDecimal("0.1");
		BigDecimal c=new BigDecimal("0.1");
		
		BigDecimal d=a.add(b).add(c);
		BigDecimal e=d.multiply(new BigDecimal("3"));
		BigDecimal f=d.multiply(new BigDecimal("100000"));
		
		System.out.println("d "+d);
		System.out.println("e "+e);
		System.out.println("f "+f);
		
		
	}
	
	public static void main(String[] args) {
		testWithFloat();
		testWithDouble();
		testWithBigDecimal();
	}
}
