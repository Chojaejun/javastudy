package com.naver;

public class Test2 {
	
	//�ϱ��ؾ� �� �͵�
	
	//for�� ����Ͽ� �ȳ��ϼ��� 10�� ���
	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������.");
		}
	}
	
	//for�� ����Ͽ� 0 ~ 100 ������ ���
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	
	//for�� ����Ͽ� 0,2,4,6,8,...100���� ���
	public void me3() {
		for (int i = 0; i < 51; i++) {
			int a = i * 2;
			System.out.println(a);
		}
	}
	
	//for�� ����Ͽ� 1,3,5,7,9,..������ 52������ ���
	public void me4() {
		for (int i = 0; i < 52; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}
	}
	
	//for�� ����Ͽ� 0~10 ������ ���
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	//for�� ����Ͽ� �� ���
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	//for�� ����Ͽ� ������ ���
	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("��>>>>>>>>>>");
			dan(i);
		}
	}
	

}
