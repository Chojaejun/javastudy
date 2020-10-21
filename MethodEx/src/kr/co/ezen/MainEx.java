package kr.co.ezen;

import com.naver.MethodTest2;
import com.naver.MethodTest3;

public class MainEx {
	public static void main(String[] args) {
		
		
		MethodTest mt1 = new MethodTest();
		
		MethodTest mt2 = new MethodTest();
		
		MethodTest mt3 = new MethodTest();
		
		MethodTest mt4 = new MethodTest();
		
		
		mt1.stand();
		mt1.sleep();
		mt1.sayHello();
		
		mt2.sitDown();
		mt2.callName("조재준");
		
		mt1.printBan(3);
		
		
		
		mt1.printScore("홍길동", 100);
		mt2.printScore("김유신", 100);
		
		mt1.sayHello();
		
		mt2.printdan(3, 45);
		
		
		mt1.jaeJun("노민호", 97.8);
		mt1.jaeJun("조재준", 97.5);
		
		mt3.jaeJun("조재준", 97.7);
		mt4.jaeJun("노민호", 99.8);
		
		mt1.jun("조재준");
		mt2.jun("노민호");
		
		mt2.chojaejun("조재준", "노민호");
		
		mt1.jojaejun(5);
		
		mt3.joon(32);
		
		mt4.noon(60);
		
		
		mt3.ezen("조재준");
		mt3.ezen("노민호");
		mt3.ezen("김영원");
		
		mt1.stay(2020, 1);
		
		mt2.cat("김치");
		mt1.cat("감자");
		mt2.cat("김치");
		
		
		Test12 jjj = new Test12();
		jjj.sayHello();
		jjj.printScore("김유신", 100);
		
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = mt5.giveMeTheMoney();
		
		MethodTest3 mt7 = new MethodTest3();
		long re4 = mt7.f();
		
		
				
		
		
		
		
	}
	
	
	
	

}
