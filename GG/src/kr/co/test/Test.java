package kr.co.test;

import java.util.Scanner;

import net.daum.Child;

public class Test {
	
	private final int A_B_C = 3;
	private static final int C_D_E = 44;
	private final int D_E_F;
	
	public Test() {
		D_E_F = 55;
	}
	
	public Test(int D_E_F) {
		this.D_E_F = D_E_F;
	
	}
	
	public static void main(String[] args) {
		
		Grand g = new Child();
		
		System.out.println(g.prospect);
		
		Test t1 = new Test();
		
		//변수: 값이 바뀌는 데이터
		//t1.A_B_C = 55;
	
		System.out.println(Test.C_D_E);
		
		System.out.println(t1.A_B_C);

		Scanner sc = new Scanner(System.in);

		boolean isTrue = true;
		int a = 0;

		while (isTrue) {
			System.out.println("a 값을 입력하세요.");

			a = sc.nextInt();
			sc.nextLine();
			
			System.out.println("msg1 값을 입력하세요.");
			String msg1 = sc.nextLine();
			System.out.println(msg1);

			if (a == 4) {
				break;
			}

			System.out.println(a + "를 넘겨받았습니다.");
		}
		System.out.println("end");

		sc.close();
	}

}
