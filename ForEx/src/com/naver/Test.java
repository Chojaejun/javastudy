package com.naver;

public class Test {
	
	public void me1() { //암기
		for (int i = 0; i < 10; i++) {
			
			System.out.println("hello world");
		}
		
	}
	
	public void me2() { //암기
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
	}
	public void me3() { //암기
		for (int i = 0; i < 51; i++) {
			int a= i * 2;
			System.out.println(a);
		}
	}
	
	public void me4() { //암기
		for (int i = 0; i < 52 ; i++) {
			int a = i * 2 + 1;
			System.out.println(a);
			
		}
	}
	
	public void me4(int n) {
		for (int i = 0; i < n; i++) {
			int a = i* 2 + 1;
			System.out.println(a);
			
		}
	}
	
	public void dan(int dan) {//면접 때 가끔 나옴.암기
		for (int i = 1; i < 10; i++) { 
			System.out.println(dan + " X " + i + " = " +(dan*i));
		}
	}
	
	public void issosu(int num) {
		//num이 소수면 sysout("소수입니다.")
		//num이 소수가 아니면, sysout("소수가 아닙니다")
		
		for (int i = 2; i < num+1; i++) {
			if (num % i == 0) {
				//1. i가 num의 약수이지만 num은 아닌 상황
				//2. i == num : num : 소수
				
				if(i == num)
					System.out.println("소수입니다.");
			}else {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
	}
	
	public void me5() {
		for (int i = 0; i < 10; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	public void me5(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}System.out.println();
	}
	
	public void gugudan() { //면접 때 가끔 나옴,암기
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단>>>>>>>>>>>>>");
			dan(i);
		}
			
		}
	
	public void printstar() {
		for (int i = 0; i < 5; i++) {
			me5(i+1);
		}
	}
	public void printstar(int n) {
		for (int i = 0; i < n; i++) {
			me5(i + 1);
		}
	}
	
	public void me6() { //암기
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
		}
	}
	
	public void halfDiamond() {
		int n = 10;
		for (int i = 0; i < n; i++) {
			if(i< n/2) {
				me5(i+1);
			}else {
				me5(n-i-1);
			}
		}
		
	}
		
	

}
