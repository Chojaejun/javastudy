package com.naver;

public class Test2 {
	
	//�ϱ��ؾ� �� �͵�
	
	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("�������.");
		}
	}
	
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	
	public void me3() {
		for (int i = 0; i < 51; i++) {
			int a = i * 2;
			System.out.println(a);
		}
	}
	
	public void me4() {
		for (int i = 0; i < 52; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}
	}
	
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("��>>>>>>>>>>");
			dan(i);
		}
	}
	

}
