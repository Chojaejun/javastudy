package com.naver;

public class Sonata extends Car {
	private String model = "sonata";
	
	public Sonata() {
		run();
		
		
		
	}
	

	public Sonata(String model, String company, int price) {
		super(model, company, price);
		// TODO Auto-generated constructor stub
	}
	
	public void me1() {
		System.out.println(getModel());
		System.out.println(getPrice());
		System.out.println(getCompany());
		
		
	}


	@Override
	public void run() {
		System.out.println(":::::::::::::");
		System.out.println("Sonata Ŭ������ run()");
		System.out.println(":::::::::::::::");
	}
	
	public void only() {
		System.out.println("�θ�Ŭ�������� ����, �ҳ�ŸŬ�������� �ִ� �޼���");
	}
	
	
	
	
	
}
