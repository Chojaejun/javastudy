package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		t1.me1(3);
		t1.me1(4);
		t1.me1(0);
		
		System.out.println("###########");
		
		t1.me2(3);
		t1.me2(4);
		
		System.out.println("#############");
		
		t1.me3(100);
		t1.me3(24);
		
		System.out.println("############");
		
		t1.me6(5);
		t1.me6(2);
		t1.me6(7);
		t1.me6(6);
		t1.me7(88);
		
		t1.me9(1);
		t1.me9(1);
		t1.me9(1);
		t1.me9(1);
		t1.me9(1);
		
		Test2 t2 = new Test2();
		t2.day(3);
		t2.day(18);
		t2.day(31);
		

	}

}
