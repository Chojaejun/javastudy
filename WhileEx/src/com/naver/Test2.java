package com.naver;

public class Test2 {
	
	//0 ~ 100 ������ ���
	public void me1() {
		int i = 0;
		while (i < 101) {
			System.out.println(i);
			i++;
		}
		
	}
	
	//100 ~ 0 ������ ���
	public void me11() {
		int i = 100;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		
	}
	
	//0, 2, 4, 6, 8, 10....46 ���
	public void me2() {
		int i = 0;
		while (i < 47) {
			System.out.println(i);
			i = i + 2;
		}
		
	}
	
	//99, 97, 95,93, 91, 89,....21
	public void me21() {
		int i = 99;
		while (i >= 21) {
			System.out.println(i);
			i = i - 2;
		}
		
	}
	
	//Ư�� �� ����
	//3X1=3...........
	public void dan(int dan) {
		int i = 2;
		while (i < 10) {
			System.out.println(dan + " X " + i + " = " + (dan*i));
			i++;
		}
		
	}
	
	//**********
	//while�� �̿�..print( ) Vs println( )
	public void star() {
		int i = 0;
		while (i < 10) {
			System.out.print('*');
			i++;
		}
		
	}
	
	//*��� n�� ����ֱ�
	public void me31(int n) {
		int i = 0;
		while (i < n) {
			System.out.print('*');
			i++;
		}
		System.out.println();
		
	}
	
	//99�� ��ü �� ���
	public void gugudan() {
		int i = 2;
		while (i < 10) {
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
		int i = 0;
		while (i < n) {
			me31(i + 1);
			i++;
		}
		
	}
	
	//1,1,2,3,5,8,13,.....
	//15���� ������ �� �ϱ��?
	//�Ǻ���ġ��
	public void printpibo() {
		
		
	}
	
	//0,3,6,9,.......,27336
	//�� ������ ����Ϸ���
	//for���� while�� �� � ���� ����ϴ� �� �����Ѱ�?
	//�� : while��
	
	
	public void me4() {
		
		
	}
	
	public void me5() {
		
		
	}

}
