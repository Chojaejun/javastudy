package com.naver;


public class Hero {
	
	Weapon[] weapons;
	Weapon w;
	
	public Hero() {
		// TODO Auto-generated constructor stub
	}

	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}

	public Weapon[] getWeapons() {
		return weapons;
	}

	public void setWeapons(Weapon[] weapons) {
		this.weapons = weapons;
	}

	public Weapon getW() {
		return w;
	}

	public void setW(Weapon w) {
		this.w = w;
	}
	
	public void attack(Monster mon) {
		w.attack(mon);
	}
	
	public void changeweapon(int weaponIdx) {
		if(weaponIdx >= weapons.length || weaponIdx < 0) {
			weaponIdx = weapons.length -1;
		}
		w = weapons[weaponIdx];
		System.out.println(w + "으로 변경되었습니다.");
	}
}
