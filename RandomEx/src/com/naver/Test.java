package com.naver;

import java.util.Random;

public class Test {
	
	public void ranDomFood() {
		Random rnd = new Random();
		for (int i = 0; i < 1; i++) {
			int num = rnd.nextInt(9)+1;
			switch (num) {
			case 1:
				System.out.println("오늘의 메뉴는 맘스터치");
				break;
			case 2:
				System.out.println("오늘의 메뉴는 초밥");
				break;
			case 3:
				System.out.println("오늘의 메뉴는 짜글이");
				break;
			case 4:
				System.out.println("오늘의 메뉴는 김치찌개");
				break;
			case 5:
				System.out.println("오늘의 메뉴는 뼈해장국");
				break;
			case 6:
				System.out.println("오늘의 메뉴는 돼지국밥");
				break;
			case 7:
				System.out.println("오늘의 메뉴는 중국집");
				break;
			case 8:
				System.out.println("오늘의 메뉴는 편의점");
				break;
			case 9:
				System.out.println("오늘의 메뉴는 라면학교");
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
		// start~end 범위에 있는 숫자가 임의로 나오도록 프래그래밍 하세요.
		Random rnd = new Random();
		int num = rnd.nextInt(end - start + 1) + start;// start ~ end
		System.out.println(num);

	}

	public void me4() {
		// 임의의 값의 범위가 3~10까지의 숫자가 되도록 프로그래밍하세요.
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
