package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

//	스레드의 영역
//	main( ) : main
//	run( ) : 사용자 스레드 영역
//	====================
//	join( ): 이 메서드를 호출한 
//	스레드는 현재의 영역을
//	관리하는 스레드보다 
//	먼저 dead 상태로 빠진다.
//	t1.join( );
//	====================
//	t1 스레드가
//	mian 스레드보다
//	먼저 dead 상태가
//	되게 하려면?
//	t1.join( );
//	mian( )메서드에 코딩

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		System.out.println(name);

		System.out.println("main start");

		Test t1 = new Test("문도");
		Test t2 = new Test("로봇");
		ZZZ t3 = new ZZZ(t1, "미니언");

		t1.start();
		t2.start();
		t3.start();

		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main end");

	}

}
