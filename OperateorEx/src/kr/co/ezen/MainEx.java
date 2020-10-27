package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me4();
		t1.me41(0, 4);
		t1.me41(1, 4);
		t1.me41(2, 4);
		t1.me41(3, 4);
		t1.me41(4, 4);
		t1.me41(5, 4);
		t1.me41(6, 4);
		t1.me41(7, 4);
		//같은 숫자가 N번 반복된다?
		//무슨 연산자? /
		
		
		t1.me5();
		t1.me51(0, 3);
		t1.me51(1, 3);
		t1.me51(2, 3);
		t1.me51(3, 3);
		t1.me51(4, 3);
		//특정 범위의 숫자가 계속 반복된다?
		//무슨 연산자? %
		//반복되는 숫자 중에 가장 큰 수 + 1
		
		Test2 t2 = new Test2();
		t2.s1();
		t2.s12();
		t2.s2();
		
		t2.switchAI();
	}
	
	
	

}
