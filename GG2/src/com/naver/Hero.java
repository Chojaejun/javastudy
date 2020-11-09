package com.naver;

public class Hero {
	
	Weapon[] weapons;
	
	Weapon w;
	
	public Hero(Weapon[] weapons, Weapon w) {
		super();
		this.weapons = weapons;
		this.w = w;
	}




	public void attack(Monster mon) {
		
		w.attack(mon);
		
	}
	
	public void changeWeapon(int weaponIdx) {
		
		if(weaponIdx >= weapons.length || weaponIdx < 0) {
			weaponIdx = weapons.length-1;
		}
		
		w = weapons[weaponIdx];
		System.out.println(w + "�� ����Ǿ����ϴ�.");
		
		
	}

}
