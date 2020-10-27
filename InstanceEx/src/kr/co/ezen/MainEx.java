package kr.co.ezen;

import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.MediaSize.Other;

import com.nate.Team;
import com.naver.Car;
import com.naver.Person;

public class MainEx {

	public static void main(String[] args) {
		Car car1 = new Car("k7", "서울 34자 1234", 4000);
		//car1.showMePrice();
		Car car2 = new Car("bmw", "서울 33사 9876", 5000);
		Car car3 = new Car("sm5", "경기 31자 1234", 4000);
		Car car4 = new Car("아반떼", "경기 24서 1570", 2400);
		Car car5 = new Car("제네시스", "경기 14바 5678", 6000);
		Car car6 = new Car("폭스바겐", "서울 17자 9871", 3000);
		
		Dog dog1 = new Dog(1, "땡구", "남", new Date(13));
		Dog dog2 = new Dog(2, "종이", "여", new Date());
		Dog dog3 = new Dog(3, "백구", "남", new Date());
		Dog	dog4 = new Dog(4, "투투", "남", new Date(15));
		Dog dog5 = new Dog(5, "재롱이", "여", new Date(17));
		Dog	dog6 = new Dog(6, "티모", "남", new Date(31));
		
		Person captain = new Person("p1", "a팀주장", dog1, car1);
		Person member1 = new Person("p2", "김유신", dog2, car2);
		Person member2 = new Person("p3", "이순신", dog3, car3);
		Person captain2 = new Person("p4", "b팀주장", dog4, car4);
		Person member3 = new Person("p5", "율곡이이", dog5, car5);
		Person member4 = new Person("p6", "서애류성룡", dog6, car6);
		
		Team aTeam = new Team(captain, member1, member2);
		Team bTeam = new Team(captain2, member3, member4);
		
		aTeam.fight(bTeam);
		
		bTeam.fightMem1(aTeam);
		
		aTeam.fightMem2Dgo(bTeam);
		
		aTeam.carPrice(bTeam);
		
		aTeam.DogGender(bTeam);
		
		
		
		

	}

}
