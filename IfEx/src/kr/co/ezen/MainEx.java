package kr.co.ezen;

import com.naver.Person;
import com.naver.TV;
import com.naver.Test;

public class MainEx {
	public static void main(String[] args) {
		Test t1 = new Test();
		
		t1.me1();
		t1.me2(60);
		t1.me3(3);
		String msg = t1.me4(5);
		System.out.println(msg);
		t1.me5(2);
		t1.me6(6);
		char c = t1.me7(71);
		System.out.println(c);
		
		TV tv1 = new TV(10, 15, false);
		tv1.powerOn();
		System.out.println(tv1.getVol());
		tv1.volUp();
		System.out.println(tv1.getVol());
		tv1.powerOff();
		tv1.volUp();
		System.out.println(tv1.getVol());
	
		Person p1 = new Person(tv1);
		
		Person kim = new Person(tv1);
		// kim �� tv�� ��ϴ�.
		kim.tvOn();
		//tv�� ���ϴ�.
		kim.tvOff();
		
		//kim�� tv ä���� +1 ��Ű�ÿ�.
		TV tv = kim.getTv1();
		tv.chUp();
		System.out.println(tv.getCh());
		tv.chUp();
		
		System.out.println("################");
		
		//kim�� tv ������ -1 ��Ű�ÿ�
		kim.getTv1().volDouwn();
		System.out.println(tv.getVol());
		
		//kim�� tv ������ 50���� �����Ͻÿ�
		kim.getTv1().setVol(50);
		System.out.println(tv.getVol());
		
		
	}

}
