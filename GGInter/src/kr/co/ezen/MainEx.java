package kr.co.ezen;

import java.util.Scanner;

import com.naver.Bow;
import com.naver.Gun;
import com.naver.Hero;
import com.naver.Monster;
import com.naver.SetUP;
import com.naver.Sword;
import com.naver.Weapon;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Monster mon = new Monster(SetUP.MONSTER_HP);
		System.out.println(mon);

		Weapon[] weapons = { new Bow("활", SetUP.BOW_POWER), new Sword("검", SetUP.SWORD_POWER), new Gun("총", SetUP.GUN_POWER) };

		Weapon w = weapons[2];

		Hero spyderman = new Hero(weapons, w);

		boolean isTrue = true;
		int menu = 0;
		int weaponIndex = 0;

		while (isTrue) {
			System.out.println("다음 중 하나를 선택하시오.");
			System.out.println("0: 공격, 1: 무기변경, 2: 종료");

			menu = sc.nextInt();
			if (menu == 2) {
				break;
			}

			if (menu == 0) {
				spyderman.attack(mon);
			} else if (menu == 1) {
				System.out.println("무기를 선택하세요.");

				for (int i = 0; i < weapons.length; i++) {
					System.out.print(i);
					System.out.print(": " + weapons[i] + " ");
				}
				System.out.println();
				
				weaponIndex = sc.nextInt();
				sc.nextLine();
				spyderman.changeWeapon(weaponIndex);
				
			}
		}

		sc.close();
	}

}
