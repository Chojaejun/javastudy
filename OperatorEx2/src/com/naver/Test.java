package com.naver;

public class Test {
	
	//me1( ): �ΰ��� ������ �Ķ���͸� �Ѱ� �޾Ƽ�,
	//ù ��° �Ķ���Ͱ� �� ��° �Ķ���ͺ��� ũ�ų� ������ ���θ� ��ȯ�ϴ� ���
	
	public boolean me1(int a, int b) {
		return a > b;
		
	}
	
	//me2( ): �ΰ��� long�� �Ķ���͸� �Ѱ� �޾Ƽ�,
	//ù ��° �Ķ���Ͱ� �� ��° �Ķ���ͺ��� ũ�ų� ������ ���θ� ��ȯ�ϴ� ���
	
	public boolean me2(long a, long b) {
		return a >= b;
	}
	
	
	//me2( ): �ΰ��� float�� �Ķ���͸� �Ѱ� �޾Ƽ�,
    //ù ��° �Ķ���Ͱ� �� ��° �Ķ���ͺ��� ������ ���θ� Ȯ���ϰ�
	//���� ������ "ok" �׷��� ������ "No"�� ��ȯ�ϴ� ���
	
	public String me3(float a, float b) {
		boolean result = a < b;
		// a = 3.0, b = 9.0 result = true;
		// a = 9.0, b = 3.0 result - false;
		
		if(result) {
			return "ok";
		}else {
			return "No";
		}
		
		
	}
	
	//me2( ): �ΰ��� int�� �Ķ���͸� �Ѱ� �޾Ƽ�,
    //ù ��° �Ķ���Ͱ� �� ��° �Ķ���ͺ��� ������ ���θ� Ȯ���ϰ�
	//���� ������ "a" �׷��� ������ "z"�� ��ȯ�ϴ� ���
	
	public char me31(int a, int b) {
		 boolean result = a > b;
		 
		 if(result) {
			 return 'a';
		 }else {
			return 'z';
		}
		 
	}
	
	public boolean me4(byte a, byte b) {
		 return a <= b;
	}
	
	public void me5(short a, short b) {
		System.out.println(a == b);
		
	}
	
	public void me51(boolean a, boolean b) {
		System.out.println(a == b);
	}
	
	public void me6(boolean a, boolean b) {
		boolean result = a != b;
		System.out.println(result);
	}

}
