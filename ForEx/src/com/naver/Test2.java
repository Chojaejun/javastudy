package com.naver;

public class Test2 {
	
	//암기해야 할 것들
	
	//for문 사용하여 안녕하세요 10번 출력
	public void me1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("어서오세요.");
		}
	}
	
	//for문 사용하여 0 ~ 100 순서로 출력
	public void me2() {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	
	//for문 사용하여 0,2,4,6,8,...100까지 출력
	public void me3() {
		for (int i = 0; i < 51; i++) {
			int a = i * 2;
			System.out.println(a);
		}
	}
	
	//for문 사용하여 1,3,5,7,9,..순서로 52번까지 출력
	public void me4() {
		for (int i = 0; i < 52; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
		}
	}
	
	//for문 사용하여 0~10 순서로 출력
	public void me6() {
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	//for문 사용하여 단 출력
	public void dan(int dan) {
		for (int i = 1; i < 10; i++) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
		}
	}
	
	//for문 사용하여 구구단 출력
	public void gugudan() {
		for (int i = 2; i < 10; i++) {
			System.out.println("단>>>>>>>>>>");
			dan(i);
		}
	}
	

}
