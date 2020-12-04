package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.Test3;
import com.naver.Test4;

public class MainEx {

	public static void main(String[] args) { //동시에 무언가가 움직이면 Thread 구현.***********
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName();
//		System.out.println(name); // main이 나옴 --> main Thread라는 이야기.
		
		//1. Test 클래스를 Thread 클래스로 만들었음.
		//2. Test 클래스를 이용해서 Thread 객체를 만들었음.
		//3. Test 클래스를 이용해서 Thread를 만들겠음. //t1.start();
		
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
				System.out.println("통신 등을 구현할 때, 자주 쓰는 스레드");
				
			}
		}).start();
		
	}

}
