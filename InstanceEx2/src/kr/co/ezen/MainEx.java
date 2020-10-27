package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.Spear;
import com.naver.Sword;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster mon = new Monster();
		
		Bow bow = new Bow();
		
		Hero hero = new Hero(bow);
		
		hero.attack(mon);
		
		
		Spear spear  = new Spear();
		hero.attack(mon, spear);
		
		Sword sword = new Sword();
		hero.attack(mon, sword);
		
	}

}
