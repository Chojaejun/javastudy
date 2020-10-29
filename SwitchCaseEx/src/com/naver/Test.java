package com.naver;

public class Test {
	private int sum = 0;
	
	public void me1(int a) {
		
		switch (a) {
		case 3:
			System.out.println(3333);
			System.out.println(1111);
			break;
		case 4:
			System.out.println(4444);
			System.out.println("end");
			break;

		default:
			System.out.println("fine");
			break;
		}
		
	}
	
	public void me2(int a) {
		
		switch (a) {
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);	

		default:
			System.out.println(999);
			break;
		}
	}
	
	public void me3(int a) {
		switch (a/10) {
		case 1:
			System.out.println("10~19");	
			break;
		case 2:
			System.out.println("20~29");
			break;
		default:
			System.out.println("end");
			break;
		}
	}
	
	/* �̷��Ե� �����ϴ�
	 * public void me31(int a) {
	 * 
		int data = a/10;
		
		switch (data) {
		case 1:
			
			break;

		default:
			break;
		}
	}*/
	
	
	
	/* ����ġ�� ���̽� ���̿� ���� �����ϸ� �ȵȴ�.
	 * public void me4(int a) {
		switch (key) {
		
		int a= 10;
		
		case value:
			
			break;

		default:
			break;
		}
	}*/
	
	/* ����ġ�� ���� Long���� �� �� ����.
	 * �� �� �ִ� ���� int, String, enum
	 * public void me5(long a) {
		switch (a) {
		case 10L:
			
			break;

		default:
			break;
		}
	}*/
	
	public void me6(int month) {
		//�޷�(�극��ũ ����)
		//1,3,5,7,8,10,12:31��
		//sysout("31�ϱ��� �ֽ��ϴ�")
		//2:28
		//sysout("28�ϱ��� �ֽ��ϴ�")
		//��������:30��
		//sysout("30�ϱ��� �ֽ��ϴ�.
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println("28�ϱ��� �ֽ��ϴ�.");
			break;

		default:
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
			break;
		}
		
	}
	
	public void me7(int score) {
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("��");
			break;
		case 8:
			System.out.println("��");
			break;
		case 7:
			System.out.println("��");
			break;
		case 6:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
	}
	
	//a ������ b�� ���� �ְ�
	//b �������� a�� ���� �������� �մϴ�.
	
	//ġȯ �˰���
	public void me8(String a, String b) {
		String c = a;
		a = b;
		b = c;
	}
	
	//������� sum�� int a���� 1�� �־��� �� 
	//1�� �����ϰ� �����
	public void me9(int a) {
		sum = sum + a;
		//sum += a;
		System.out.println(sum);
		
	}
	
	public void tt() {
		System.out.println("hello world");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("gooten tag");
	}
	
	public void func1() {
		tt();
		sum += 3;
		System.out.println(sum);
	}
	
	public void func2() {
		tt();
		sum *= 3;
	}
	
	public void func3() {
		tt();
		sum -= 3;
		
	}
	
	
	
	
	

	
	

}
