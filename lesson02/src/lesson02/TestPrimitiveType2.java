package lesson02;

import java.math.BigDecimal;
/**
 * ≤‚ ‘∏°µ„–Õ
 */

public class TestPrimitiveType2 {
	public static void main(String[] args) {
		float a=3.14F;
		double b=6.28;
		double c=628E-2;
		System.out.println(c);
		double f=0.1;
		double d=1.0/10;
		System.out.println(f==d);
		
		BigDecimal bd=BigDecimal.valueOf(1.0);
		bd=bd.subtract(BigDecimal.valueOf(0.1));
		System.out.println(bd);
		System.out.println(1.0-0.1);
		
	}
}
