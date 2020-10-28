package com.naver;

public class Test4 {
	
	private int a;
	private int b;
	
	public Test4() {
		a = 4;
		b = 11;
		
	}
	
	//변수 c는 a가 b보다 크거나 같으면 'a'
	//그렇지 않으면 'z'를 갖는다.
	//변수 c를 선언하시오.
	public void cond1() {
		char c = a >= b? 'a':'z';
		System.out.println(c);
	}
	
	//변수 c는
	//a가 b보다 같지 않으면 new String("hello")
	//그렇지 않으면 new String("no")
	//를 같는다 변수 c를 선언하시오
	public void cond2() {
		String c = a != b ? new String("hello") : new String("no");
		System.out.println(c);
	}
	
	//변수 c는
	//a가 b보다 작거나 같으면 new StringBuffer("hello")
	//그렇지 않으면 new StringBuffer("no")
	//를 같는다 변수 c를 선언하시오
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
		//점수로 등급을 나눌 때 사용
		char c = score >= 90 ? 'A' : score>=80? 'B' : score>=70? 'c' : score >= 60? 'D' : 'F';
		System.out.println(c);
	}

}
