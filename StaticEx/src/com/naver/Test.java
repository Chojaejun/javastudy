package com.naver;

public class Test {
	/*static 변수, 상수, 메서드 == class 변수, 상수, 메서드
	---------------------------------------------
	프로그램이 실행되면 곧 바로 static 영역에 로딩이 되어 실행 가능한 상태가 됩니다.
	=============================================
    인스턴스 변수: 객체 생성 시마다 만들어지기 때문에 인스턴스
	static 변수/상수: 객체 생성 개수와 상관 없이 무조건 1개만 생성됨.
	어떻게 만들까?
	static 변수는 어떻게 만들까?
	public static type 변수명; 
	public static int a;
	class명.변수명
	class명.상수명
	class명.메서드명
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
