package com.naver;

public class Test {
	/*static ����, ���, �޼��� == class ����, ���, �޼���
	---------------------------------------------
	���α׷��� ����Ǹ� �� �ٷ� static ������ �ε��� �Ǿ� ���� ������ ���°� �˴ϴ�.
	=============================================
    �ν��Ͻ� ����: ��ü ���� �ø��� ��������� ������ �ν��Ͻ�
	static ����/���: ��ü ���� ������ ��� ���� ������ 1���� ������.
	��� �����?
	static ������ ��� �����?
	public static type ������; 
	public static int a;
	class��.������
	class��.�����
	class��.�޼����
	*/
	
	public int a;
	public static int b;
	
	public void me2() {
		System.out.println(a);
		System.out.println(Test.b);
	}
	
	public static void me1() { 
		Test t1 = new Test();
		System.out.println(t1.a);
		System.out.println(Test.b);
	}
	
}
