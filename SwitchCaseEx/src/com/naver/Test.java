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
	
	/* 이렇게도 가능하다
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
	
	
	
	/* 스위치와 케이스 사이에 변수 선언하면 안된다.
	 * public void me4(int a) {
		switch (key) {
		
		int a= 10;
		
		case value:
			
			break;

		default:
			break;
		}
	}*/
	
	/* 스위치의 값에 Long형은 들어갈 수 없다.
	 * 들어갈 수 있는 값은 int, String, enum
	 * public void me5(long a) {
		switch (a) {
		case 10L:
			
			break;

		default:
			break;
		}
	}*/
	
	public void me6(int month) {
		//달력(브레이크 사용법)
		//1,3,5,7,8,10,12:31일
		//sysout("31일까지 있습니다")
		//2:28
		//sysout("28일까지 있습니다")
		//나머지는:30일
		//sysout("30일까지 있습니다.
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일까지 있습니다.");
			break;
		case 2:
			System.out.println("28일까지 있습니다.");
			break;

		default:
			System.out.println("31일까지 있습니다.");
			break;
		}
		
	}
	
	public void me7(int score) {
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("수");
			break;
		case 8:
			System.out.println("우");
			break;
		case 7:
			System.out.println("미");
			break;
		case 6:
			System.out.println("양");
			break;
		default:
			System.out.println("가");
			break;
		}
	}
	
	//a 변수에 b의 값을 넣고
	//b 변수에는 a의 값을 넣으려고 합니다.
	
	//치환 알고리즘
	public void me8(String a, String b) {
		String c = a;
		a = b;
		b = c;
	}
	
	//멤버변수 sum을 int a값에 1을 넣었을 때 
	//1씩 증가하게 만들기
	public void me9(int a) {
		sum = sum + a;
		//sum += a;
		System.out.println(sum);
		
	}
	
	public void tt() {
		System.out.println("hello world");
		System.out.println("안녕하세요.");
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
