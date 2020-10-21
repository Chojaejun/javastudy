package kr.co.ezen;

public class MethodTest {
	
	
	public void sitDown() {
		System.out.println("그 자리에 즉시 앉음");
		sayHello();
		
		
	}
	
	public void sayHello() {
		System.out.println("안녕이라고 말함");
		
		
	}
	
	int a;
	boolean b = true;
	
	
	public MethodTest() {
		
	}
	
	public void stand() {
		
		System.out.println("무반환 무파람");
		
	}
	
	
	
	public void sleep() {
		System.out.println("public: 접근제한자로 프로젝트 전체에서 sleep메서드가 호출될 수 있음을 의미함.");
		System.out.println("void: 반환형이라 하고, 이는 반환되는 데이터의 자료형을 의미한다.void는 반환되는 데이터가 없다는 것을 의미한다.");
		System.out.println("sleep: 메서드의 이름이고, 나중에 메서드를 호출할 때 그 이름을 적어 줌으로써 메서드 본문 안에 있는 코드를 실행하게 함.");
		System.out.println("(): 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두 개 이상일 때는 ,를 구분자로 해서 구분을 해줌.");
		System.out.println("{}: 메서드의 본문..메서드 호출 때 실행하고 싶은 코드를 작성해줌.");
		
		System.out.println("메서드 호출: 메서드를 사용하는 것을 의미. 사용법은 메서드명을 적고 소괄호를 칩니다. 그리고 그 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
		
		
	}
	
	
	public void callName(String c) {
		System.out.println("안녕하세요, "+ c);
		
		
		
	}
	
	public void printBan(int a) {
		System.out.println(a *1);
		System.out.println(a *2);
		System.out.println(a *3);
		System.out.println(a *4);
		System.out.println(a *5);
		System.out.println(a *6);
		System.out.println(a *7);
		System.out.println(a *8);
		System.out.println(a *9);
		System.out.println(a *9);
	}
	
	
	
	

	public void printScore(String a, int b) {
		System.out.println(a + " " + b + "점");
		
		
	}
	
	public void printdan(int a, int b) {
		System.out.println(a + "시" + " " + b + "분");
		
	}
	
	public void jaeJun(String a, double b) {
		System.out.println(a + " " + b + "점");
		
		
	}
	
	public void jun(String a) {
		System.out.println(a + "은" + " " + "바보다.");
	}
	
	
	public void a() {
		System.out.println("된장찌개");
	}
	public void b() {
		System.out.println("김치찌개");
	}
	
	public void c() {
		System.out.println("순두부찌개");
		
	}
	
	public void chojaejun(String a, String b) {
		System.out.println(a + " " + "★" +" " + b);
		
		
	}
	
	public void jojaejun(int a) {
		System.out.println(a+1);
		System.out.println(a+2);
		System.out.println(a+3);
		System.out.println(a+4);
		System.out.println(a+5);
		System.out.println(a-1);
		System.out.println(a-2);
		System.out.println(a-3);
		System.out.println(a-4);
		System.out.println(a-5);
		
		
		
	}
	
	public void joon(double a) {
		System.out.println(a / 2);
		System.out.println(a / 3);
		System.out.println(a / 4);
		System.out.println(a / 5);
		System.out.println(a / 6);
		System.out.println(a / 7);
		System.out.println(a / 8);
		System.out.println(a / 9);
		
	}
	
	public void noon(int a) {
		System.out.println(a+41);
		System.out.println(a+53);
		System.out.println(a+54);
		System.out.println(a+100);
		System.out.println(a+108);
		System.out.println(a+365);
	}
	
	public void ezen(String a) {
		System.out.println(a + "입니다.");
		
	}
	
	public void stay(int a, int b) {
		
		System.out.println(a + "년" + " " + b + "월" + " " + 1 + "일");
		System.out.println(a + "년" + " " + b + "월" + " " + 2 + "일");
		System.out.println(a + "년" + " " + b + "월" + " " + 3 + "일");
		
		
	}
	
	public void cat(String a) {
		System.out.println(a + "고양이");
	}
	
	
	

}
