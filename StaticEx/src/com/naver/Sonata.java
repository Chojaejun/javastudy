package com.naver;

public class Sonata {
	
	/*
	 Sonata
	 com.naver
	 ----------------------
	 +company(<-밑줄):String
	 -modelname:String
	 ----------------------
	 << constructor >>
	 << get/set >>
	 */
	
	public static String company;
	private String modelname;
	
	static { //static 초기화(블럭)
		company = "hyundai";
	}
	
	public Sonata() {
		// TODO Auto-generated constructor stub
	}

	public Sonata(String modelname) {
		super();
		this.modelname = modelname;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Sonata.company = company;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	
	

}
