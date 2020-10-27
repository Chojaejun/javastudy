package kr.co.ezen;

import com.naver.Bow;
import com.naver.Hero;
import com.naver.Monster;

public class MainEx {
	public static void main(String[] args) {
		
		Monster mon = new Monster();
		
		Bow bow = new Bow();
		
		Hero here = new Hero(bow);
		
		here.attack(mon);
	}

}
