package com.naver;

public class Test {
	
	//0 ~ 100 순서로 출력
	public void me1() {
		int i = 0;
		
		while(i<101) {
			System.out.println(i);
			i++;
		}
	}
	
	//100 ~ 0 순서로 출력
	public void me11() {
		int i = 100;
		
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}
	
	//0, 2, 4, 6, 8, 10....46 출력
	public void me2() {
		int i = 0;
		while(i<47) {
			System.out.println(i);
			
			i = i + 2;
		}
	}
	
	//99, 97, 95,93, 91, 89,....21
	public void me21() {
		int i = 99;
		while(i>=21) {
			System.out.println(i);
			
			i = i -2;//i - = 2;
		}
	}
	
	//특정 단 짓기
	//3X1=3...........
	public void dan(int dan) {
		int i = 1;
		while(i<10) {
			
			System.out.println(dan + " X " + i + " = " + (dan*i) );
			i++;
			/*StringBuffer sb = new StringBuffer();
			sb.append(dan);
			sb.append(" X ");
			sb.append(i);
			sb.append(" = ");
			sb.append(dan*i);
			String msg = sb.toString();
			System.out.println(msg);*/
			
		}
	}
	
	//**********
	//while문 이용..print( ) Vs println( )
	public void star() {
		int i = 0;
		while(i<10) {
			System.out.print('*');
			i++;
		}
		System.out.println();//줄바꿈
	}
	
	//*모양 n번 찍어주기
	public void me31(int n) {
		int i = 0;
		while(i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
	}
	
	//99단 전체 다 찍기
	public void gugudan() {
		int i = 2;
		while(i<10) {
			System.out.println(i+"단:::::::::::::");
			dan(i);
			i++;
			
		}
	}
	
	//*
	//**
	//***
	//****
	//~~~~~~~~
	public void printstar(int n) {
		int i = 0; //1
		while(i<n) {
			me31(i+1); //(i);
			i++;
		}
	}
	
	//1,1,2,3,5,8,13,.....
	//15달이 지나면 몇 일까요?
	//피보나치수
	public void printpibo() {
		int a = 1;
		int b = 1;
		
		for (int i = 0; i < 15; i++) {
			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
	
	//0,3,6,9,.......,27336
	//위 수열을 출력하려면
	//for문과 while문 중 어떤 것을 사용하는 게 유리한가?
	//답 : while문
	
	
	public void me4() {
		int i = 0;
		while(i<10) {
			if(i != 0 && i % 5 == 0) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("me4() 끝");
	}
	
	public void me5() {
		int i = 0;
		while(i<10) {
			if(i !=0 && i % 5 ==0) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
