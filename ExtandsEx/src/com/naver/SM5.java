package com.naver;

import java.util.StringTokenizer;

public class SM5 extends Car {
	
	public SM5() {
		super();
		run();
	}

	public SM5(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
		
		System.out.println(getModel());
		System.out.println(getCompany());
		System.out.println(getPrice());
	}

	@Override
	public void run() {
		System.out.println("SM5ÀÇ run()");
	}
	
	
	
	
	
}
