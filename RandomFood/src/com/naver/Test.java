package com.naver;

import java.util.Random;

public class Test {
	
	public void randomFood() {
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

}
