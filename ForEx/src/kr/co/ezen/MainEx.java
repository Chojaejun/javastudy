package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t1 = new Test();
		t1.me1();
		System.out.println(":::::::::::::::");
		t1.me2();
		
		System.out.println(">>>>>>>>>>>>>>>");
		t1.me3();
		
		System.out.println(":::::::::::::::::");
		t1.me6();
		
		System.out.println("##############");
		t1.me4();
		t1.dan(3);
		t1.issosu(3);
		t1.issosu(15);
		t1.me5();
		t1.me5(5);
		t1.gugudan();
		t1.printstar();
		
		System.out.println(">>>>>>>>>>>>>>>");
		
		Test2 t2 = new Test2();
		t2.me4();
		t2.me3();
		
		Test t3 = new Test();
		t3.me7(3);
		t3.me71();
		t3.me8();

	}

}
