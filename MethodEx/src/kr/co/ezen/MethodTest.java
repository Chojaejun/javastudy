package kr.co.ezen;

public class MethodTest {
	
	
	public void sitDown() {
		System.out.println("�� �ڸ��� ��� ����");
		sayHello();
		
		
	}
	
	public void sayHello() {
		System.out.println("�ȳ��̶�� ����");
		
		
	}
	
	int a;
	boolean b = true;
	
	
	public MethodTest() {
		
	}
	
	public void stand() {
		
		System.out.println("����ȯ ���Ķ�");
		
	}
	
	
	
	public void sleep() {
		System.out.println("public: ���������ڷ� ������Ʈ ��ü���� sleep�޼��尡 ȣ��� �� ������ �ǹ���.");
		System.out.println("void: ��ȯ���̶� �ϰ�, �̴� ��ȯ�Ǵ� �������� �ڷ����� �ǹ��Ѵ�.void�� ��ȯ�Ǵ� �����Ͱ� ���ٴ� ���� �ǹ��Ѵ�.");
		System.out.println("sleep: �޼����� �̸��̰�, ���߿� �޼��带 ȣ���� �� �� �̸��� ���� �����ν� �޼��� ���� �ȿ� �ִ� �ڵ带 �����ϰ� ��.");
		System.out.println("(): �Ķ����, �Ű����� �����ϴ� ������ ��ġ ������ �����ϵ� �ۼ��ϸ� ��. �Ķ���Ͱ� �� �� �̻��� ���� ,�� �����ڷ� �ؼ� ������ ����.");
		System.out.println("{}: �޼����� ����..�޼��� ȣ�� �� �����ϰ� ���� �ڵ带 �ۼ�����.");
		
		System.out.println("�޼��� ȣ��: �޼��带 ����ϴ� ���� �ǹ�. ������ �޼������ ���� �Ұ�ȣ�� Ĩ�ϴ�. �׸��� �� �Ұ�ȣ �ȿ� �Ķ������ �ڷ����� �´� ���� �־��ݴϴ�.");
		
		
	}
	
	
	public void callName(String c) {
		System.out.println("�ȳ��ϼ���, "+ c);
		
		
		
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
		System.out.println(a + " " + b + "��");
		
		
	}
	
	public void printdan(int a, int b) {
		System.out.println(a + "��" + " " + b + "��");
		
	}
	
	public void jaeJun(String a, double b) {
		System.out.println(a + " " + b + "��");
		
		
	}
	
	public void jun(String a) {
		System.out.println(a + "��" + " " + "�ٺ���.");
	}
	
	
	public void a() {
		System.out.println("�����");
	}
	public void b() {
		System.out.println("��ġ�");
	}
	
	public void c() {
		System.out.println("���κ��");
		
	}
	
	public void chojaejun(String a, String b) {
		System.out.println(a + " " + "��" +" " + b);
		
		
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
		System.out.println(a + "�Դϴ�.");
		
	}
	
	public void stay(int a, int b) {
		
		System.out.println(a + "��" + " " + b + "��" + " " + 1 + "��");
		System.out.println(a + "��" + " " + b + "��" + " " + 2 + "��");
		System.out.println(a + "��" + " " + b + "��" + " " + 3 + "��");
		
		
	}
	
	public void cat(String a) {
		System.out.println(a + "�����");
	}
	
	
	

}
