package com.naver;

public class Test {
	
	public void me1() {
		//����� ��ü ������
		String msg = new String("hello");
	}
	
	public void me2() {
		//�Ͻ��� ��ü ������
		String msg = "hello";
	}
	
	public void me3() {
		String msg1 = new String("a");
		String msg2 = new String("a");
		String msg3 = "a";
		String msg4 = "a";
		
		System.out.println(msg1 == msg2);
		System.out.println(msg1 == msg3);
		System.out.println(msg3 == msg4);
		
		System.out.println(">>>>>>>>>>>");
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		
		//String Ŭ������ ��ü ���� �� ���� ��� �н�
		//1. ����� ��ü ������
		//2. �Ͻ��� ��ü ������
		//�� �� ����� �޸� ���鿡�� ��� �ٸ����� �н�
		//�� �����Ͱ� ���� ���, ���� ��ü�� �ν��ϰ� �ϴ� ���(equals)
		//�� �����ڷ��������� == �� ��.
		//�� �����ڷ������� �񱳿����� ������ ���� �̷������? equals()
		// ���ϼ� �� Vs ��� ��
		// == Vs equals()
	}
	
	public void me4() {
		StringBuffer sb = new StringBuffer();
		//String Ŭ������ �Һ��� ����...
		
		String msg = "hello";
		msg = "good";
		
		//���ڿ��� ����ؼ� ���� �Ǵ� ��쿡��
		//String Ŭ������ ����ϸ�
		//���� ���ϰ� �߻��Ѵ�.
		//StringBuffer�� ����ϼ���.
		/*
		msg = "";
		msg += "�ȳ��ϼ���";
		msg += "���� ȫ�浿�Դϴ�.";
		msg += "���� ���� ������� �ô뿡 ��� �ֽ��ϴ�.";
		*/
		
		sb.append("�ȳ��ϼ���");
		sb.append("���� ȫ�浿�Դϴ�.");
		sb.append("���� ���� ������� �ô뿡 ��� �ֽ��ϴ�.");
		msg = sb.toString();
	}

}
