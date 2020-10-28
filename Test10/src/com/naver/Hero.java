package com.naver;


public class Hero {
	private Bow bow;
	private Spear spear;
	private Sword sword;
	
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
	
	public Spear getSpear() {
		return spear;
	}

	public void setSpear(Spear spear) {
		this.spear = spear;
	}
	

	public Sword getSword() {
		return sword;
	}

	public void setSword(Sword sword) {
		this.sword = sword;
	}

	public void attack(Monster mon) {
		bow.attack(mon);
	}
	
	public void attack(Monster mon, Spear spear) {
		spear.attack(mon);
	}
	public void attack(Monster mon, Sword sword) {
		sword.attack(mon);
	}


}


