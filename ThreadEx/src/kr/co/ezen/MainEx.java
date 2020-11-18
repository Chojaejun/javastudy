package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;

public class MainEx {

	public static void main(String[] args) { //���ÿ� ���𰡰� �����̸� Thread ����.***********
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name); // main�� ���� --> main Thread��� �̾߱�.
		
		//1. Test Ŭ������ Thread Ŭ������ �������.
		//2. Test Ŭ������ �̿��ؼ� Thread ��ü�� �������.
		//3. Test Ŭ������ �̿��ؼ� Thread�� �������. //t1.start();
		
		System.out.println("main start");
		
		
		Test t1 = new Test();
		Test2 t2 = new Test2();
		
		Test3 r3 = new Test3();
		Test4 r4 = new Test4();
		
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("main end");
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("��� ���� ������ ��, ���� ���� ������");
				
			}
		}).start();
		
	}

}