package kr.co.ezen;

import com.naver.Test;
import com.naver.ZZZ;

public class MainEx {

//	�������� ����
//	main( ) : main
//	run( ) : ����� ������ ����
//	====================
//	join( ): �� �޼��带 ȣ���� 
//	������� ������ ������
//	�����ϴ� �����庸�� 
//	���� dead ���·� ������.
//	t1.join( );
//	====================
//	t1 �����尡
//	mian �����庸��
//	���� dead ���°�
//	�ǰ� �Ϸ���?
//	t1.join( );
//	mian( )�޼��忡 �ڵ�

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		System.out.println(name);

		System.out.println("main start");

		Test t1 = new Test("����");
		Test t2 = new Test("�κ�");
		ZZZ t3 = new ZZZ(t1, "�̴Ͼ�");

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