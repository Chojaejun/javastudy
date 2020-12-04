package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {
		a = 4;
		b = 11;
		
	}
	
	//���� c�� a�� b���� ũ�ų� ������ 'a'
	//�׷��� ������ 'z'�� ���´�.
	//���� c�� �����Ͻÿ�.
	public void cond1() {
		char c = a >= b? 'a':'z';
		System.out.println(c);
	}
	
	//���� c��
	//a�� b���� ���� ������ new String("hello")
	//�׷��� ������ new String("no")
	//�� ���´� ���� c�� �����Ͻÿ�
	public void cond2() {
		String c = a != b ? new String("hello") : new String("no");
		System.out.println(c);
	}
	
	//���� c��
	//a�� b���� �۰ų� ������ new StringBuffer("hello")
	//�׷��� ������ new StringBuffer("no")
	//�� ���´� ���� c�� �����Ͻÿ�
	public void cond3() {
		StringBuffer c = a <= b ? new StringBuffer("hello") : new StringBuffer("no");
		System.out.println(c);
		
	}
	
	public int me1() {
		return 3;
	}
	
	public void me2() {
		System.out.println(44);
	}
	
	public void cond4() {
		int c = a > b*2 ? me1() : a;
		System.out.println(c);
	}
	
	public void cond5(int score) {
		//������ ����� ���� �� ���
		char c = score >= 90 ? 'A' : score>=80? 'B' : score>=70? 'c' : score >= 60? 'D' : 'F';
		System.out.println(c);
	}

}
