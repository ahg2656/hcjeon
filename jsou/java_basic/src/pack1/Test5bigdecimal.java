package pack1;

import java.math.BigDecimal;

public class Test5bigdecimal {

	public static void main(String[] args) {
		//double a = 1.5;
		//double b = 1.2;
		double a = 2.0;
		double b = 1.1;
		System.out.println(a + b); // 결과값 3.1
		System.out.println(a - b); // 결과값 0.899999999
		
		System.out.println();
		BigDecimal d1 = new BigDecimal("2.0"); // 정확한 실수 정수 사칙연산 계산. 원래 실수로 하면 정확한 값이 나오지 않음. 그래서 bigdecimal을 사용 하는 것.
		BigDecimal d2 = new BigDecimal("1.1");
		System.out.println(d1.subtract(d2));
		
		System.out.println();
		BigDecimal no1 = new BigDecimal("123456789123456789123456789");
		BigDecimal no2 = new BigDecimal("123456789123456789123456789");
		System.out.println(no1.add(no2)); // add : 더하기
		System.out.println(no1.subtract(no2)); // subtract : 빼기
		System.out.println(no1.multiply(no2)); // multiply : 곱하기
		System.out.println(no1.divide(no2, 2, BigDecimal.ROUND_UP)); // Round_UP : 자릿수 올림
		
		
	}

}
