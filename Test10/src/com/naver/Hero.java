package com.naver;


public class Hero {
	private Bow bow;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Bow bow) {
		super();
		this.bow = bow;
	}

	public Bow getBow() {
		return bow;
	}

	public void setBow(Bow bow) {
		this.bow = bow;
	}
	
	public void attack(Monster mon) {
		bow.attack(mon);
	}


}


