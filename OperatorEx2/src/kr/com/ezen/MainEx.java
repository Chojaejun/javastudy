package kr.com.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;
import com.naver.Test5;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		boolean result = t1.me1(3, 4);
		System.out.println(result);
		
		boolean result1= t1.me2(30000000L, 2000000L);
		System.out.println(result1);
		
		
		//바이트형에 값을 넣을 때는 밑에처럼 인트형과 다르다.
		byte a = 1;
		byte b = 1;
		t1.me4(a, b);
		
		t1.me4((byte)3, (byte)-5);
		
		//바이트형에 값을 넣을 때는 밑에처럼 인트형과 다르다.
		t1.me5((short)3, (short)3);
		
		t1.me51(false, true);
		t1.me6(true, false);
		
		Test2 t2 = new Test2();
		
		System.out.println("#######################and and");
		
		t2.k1(true, true);
		t2.k1(true, false);
		t2.k1(true, true);
		t2.k1(false, false);
		
		System.out.println("#####################or or");
		
		t2.k2(true, true);
		t2.k2(true, false);
		t2.k2(false, false);
		t2.k2(true, true);
		
		System.out.println("#########################");
		
		t2.k3(false);
		
		boolean e = false;
		t2.k3(e);
		
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		t2.switchInt();
		
		System.out.println("#####################");
		t2.switchBoolean();
		t2.switchBoolean();
		t2.switchBoolean();
		
		System.out.println("####################");
		
		
		Test3 t3 = new Test3();
		
		t3.plus1();
		
		t3.plus11();
		
		System.out.println("#####################");
		t3.plus2();
		t3.plus21();
		System.out.println(t3.getB());
		
		t3.minus1();
		
		System.out.println("#######################");
		
		Test4 t4 = new Test4();
		t4.cond1();
		t4.cond2();
		t4.cond3();
		t4.cond4();
		t4.cond5(98);
		
		System.out.println("##################");
		
		Test5 t5 = new Test5();
		
		t5.h1();
		t5.h2();
		t5.h3();
		t5.h4();
		t5.h5(0);
		t5.h5(1);
		t5.h5(2);
		t5.h5(3);
		t5.h5(4);
		
		System.out.println("####################");
		
		t5.h6(0);
		t5.h6(1);
		t5.h6(2);
		t5.h6(3);
		t5.h6(4);
		
	}

}
