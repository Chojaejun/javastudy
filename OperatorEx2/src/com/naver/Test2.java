package com.naver;

public class Test2 {
	private int a = 0;
	private	boolean b = false;
	
	public void k1(boolean a, boolean b) {
		boolean result = a && b;
		System.out.println(result);
	}
	
	public void k2(boolean a, boolean b) {
		boolean result = a || b;
		System.out.println(result);
	}
	
	public void k3(boolean a) {
		System.out.println(!a);
		System.out.println(a);
	}
	
	public void switchInt() {
		a = 1 - a;
		System.out.println(a);
		
	}
	
	public void switchBoolean() {
		b = !b;
		System.out.println(b);
	}
	


}
