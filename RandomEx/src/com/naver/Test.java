package com.naver;

import java.util.Random;

public class Test {
	
	public void ranDomFood() {
		Random rnd = new Random();
		for (int i = 0; i < 1; i++) {
			int num = rnd.nextInt(9)+1;
			switch (num) {
			case 1:
				System.out.println("������ �޴��� ������ġ");
				break;
			case 2:
				System.out.println("������ �޴��� �ʹ�");
				break;
			case 3:
				System.out.println("������ �޴��� ¥����");
				break;
			case 4:
				System.out.println("������ �޴��� ��ġ�");
				break;
			case 5:
				System.out.println("������ �޴��� �����屹");
				break;
			case 6:
				System.out.println("������ �޴��� ��������");
				break;
			case 7:
				System.out.println("������ �޴��� �߱���");
				break;
			case 8:
				System.out.println("������ �޴��� ������");
				break;
			case 9:
				System.out.println("������ �޴��� ����б�");
				break;
			}
		}
		
	}
	
	public void me6() {
		Random rnd1 = new Random(3);
		Random rnd2 = new Random(3);
		
		int num1 = rnd1.nextInt(100000);
		int num2 = rnd2.nextInt(100000);
		
		System.out.println(num1);
		System.out.println(num2);
	}
	

	public void me5(int start, int end) {
		// start~end ������ �ִ� ���ڰ� ���Ƿ� �������� �����׷��� �ϼ���.
		Random rnd = new Random();
		int num = rnd.nextInt(end - start + 1) + start;// start ~ end
		System.out.println(num);

	}

	public void me4() {
		// ������ ���� ������ 3~10������ ���ڰ� �ǵ��� ���α׷����ϼ���.
		Random rnd = new Random();
		int num = rnd.nextInt(8) + 3;// 0+3 ~ n-1+3 //3 ~ 10 // n-1+3 = 10 // n = 10-3+1
		System.out.println(num);

	}

	public void me3() {
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			int num = rnd.nextInt(2);
			System.out.println(num);
		}

	}

	public void me2() {
		Random rnd = new Random(System.currentTimeMillis());
	}

	public void me1() {
		Random rnd = new Random();

	}

}
