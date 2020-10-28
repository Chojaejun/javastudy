package com.naver;

public class Test {
	
	//me1( ): 두개의 정수형 파라미터를 넘겨 받아서,
	//첫 번째 파라미터가 두 번째 파라미터보다 크거나 같은지 여부를 반환하는 기능
	
	public boolean me1(int a, int b) {
		return a > b;
		
	}
	
	//me2( ): 두개의 long형 파라미터를 넘겨 받아서,
	//첫 번째 파라미터가 두 번째 파라미터보다 크거나 같은지 여부를 반환하는 기능
	
	public boolean me2(long a, long b) {
		return a >= b;
	}
	
	
	//me2( ): 두개의 float형 파라미터를 넘겨 받아서,
    //첫 번째 파라미터가 두 번째 파라미터보다 작은지 여부를 확인하고
	//만약 작으면 "ok" 그렇지 않으면 "No"를 반환하는 기능
	
	public String me3(float a, float b) {
		boolean result = a < b;
		// a = 3.0, b = 9.0 result = true;
		// a = 9.0, b = 3.0 result - false;
		
		if(result) {
			return "ok";
		}else {
			return "No";
		}
		
		
	}
	
	//me2( ): 두개의 int형 파라미터를 넘겨 받아서,
    //첫 번째 파라미터가 두 번째 파라미터보다 작은지 여부를 확인하고
	//만약 작으면 "a" 그렇지 않으면 "z"를 반환하는 기능
	
	public char me31(int a, int b) {
		 boolean result = a > b;
		 
		 if(result) {
			 return 'a';
		 }else {
			return 'z';
		}
		 
	}
	
	public boolean me4(byte a, byte b) {
		 return a <= b;
	}
	
	public void me5(short a, short b) {
		System.out.println(a == b);
		
	}
	
	public void me51(boolean a, boolean b) {
		System.out.println(a == b);
	}
	
	public void me6(boolean a, boolean b) {
		boolean result = a != b;
		System.out.println(result);
	}

}
