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
		mt2.callName("������");
		
		mt1.printBan(3);
		
		
		
		mt1.printScore("ȫ�浿", 100);
		mt2.printScore("������", 100);
		
		mt1.sayHello();
		
		mt2.printdan(3, 45);
		
		
		mt1.jaeJun("���ȣ", 97.8);
		mt1.jaeJun("������", 97.5);
		
		mt3.jaeJun("������", 97.7);
		mt4.jaeJun("���ȣ", 99.8);
		
		mt1.jun("������");
		mt2.jun("���ȣ");
		
		mt2.chojaejun("������", "���ȣ");
		
		mt1.jojaejun(5);
		
		mt3.joon(32);
		
		mt4.noon(60);
		
		
		mt3.ezen("������");
		mt3.ezen("���ȣ");
		mt3.ezen("�迵��");
		
		mt1.stay(2020, 1);
		
		mt2.cat("��ġ");
		mt1.cat("����");
		mt2.cat("��ġ");
		
		
		Test12 jjj = new Test12();
		jjj.sayHello();
		jjj.printScore("������", 100);
		
		
		MethodTest2 mt5 = new MethodTest2();
		int re1 = mt5.giveMeTheMoney();
		
		MethodTest2 mt6 = new MethodTest2();
		int re2 = mt6.giveMeTheMoney();
		
		int re3 = mt5.giveMeTheMoney();
		
		MethodTest3 mt7 = new MethodTest3();
		long re4 = mt7.f();
		
		
				
		
		
		
		
	}
	
	
	
	

}
