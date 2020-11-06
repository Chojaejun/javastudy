package kr.co.ezen;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		
		Monster mon = new Monster(100);
		System.out.println(mon);
		
		Weapon[] weapons = {new Bow("Ȱ",1),
				new Sword("��", 5),
				new Gun("��", 10)};
		
		Weapon w = weapons[2];
		
		Hero spydeman = new Hero(weapons, w);
		
		spydeman.attack(mon);
		spydeman.attack(mon);
		spydeman.changeWeapon(0);

	}

}
