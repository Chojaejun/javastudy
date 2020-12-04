package com.nate;

import com.naver.Car;
import com.naver.Person;

import kr.co.ezen.Dog;

public class Team {
	private Person captain;
	private Person member1;
	private Person member2;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(Person captain, Person member1, Person member2) {
		super();
		this.captain = captain;
		this.member1 = member1;
		this.member2 = member2;
	}

	public Person getCaptain() {
		return captain;
	}

	public void setCaptain(Person captain) {
		this.captain = captain;
	}

	public Person getMember1() {
		return member1;
	}

	public void setMember1(Person member1) {
		this.member1 = member1;
	}

	public Person getMember2() {
		return member2;
	}

	public void setMember2(Person member2) {
		this.member2 = member2;
	}
	
	
	public void showCaptainCarPrice() {
		Car captainCar = captain.getK7();
		captainCar.showMePrice();
	}
	
	public void mem1Sleep(String where) {
		 String msg = member1.getHappy().sleep("¹æ");
		 System.out.println(msg);
		 
		 
	}
	public void mem2PrintCarModelName() {
		String modelName = member2.getK7().getModelName();
		System.out.println(modelName);
		
	}
	
	public char getCaptainCarModelNameFirstChar() {
		Car car = captain.getK7();
		String modelName = car.getModelName();
		
		char c = modelName.charAt(0);
		return c;
	}
	
	public void changeMem1Dog(Dog dog) {
		member1.setHappy(dog);
		
	}
	
	public void chageMem1dogNmae(String dogname) {
		Dog dog = member1.getHappy();
		dog.setName(dogname);
		
		//member1.getHappy().setName(dogName);
	}

	public void fight(Team otherTeam) {
		String aTeamCaptainName = this.captain.getName();
		String bTeamCaptainName = otherTeam.captain.getName();
		System.out.println(aTeamCaptainName+"°ú "+bTeamCaptainName+"ÀÌ ½Î¿ó´Ï´Ù.");
		
		
	}

	public void fightMem1(Team otherTeam) {
		String bTeamMemberName = this.member1.getName();
		String aTeamMemberName = otherTeam.member1.getName();
		System.out.println(bTeamMemberName+"¿Í "+aTeamMemberName+"ÀÌ ½Î¿ó´Ï´Ù.");
		
	}

	public void fightMem2Dgo(Team otherTeam) {
		 String aTeamDog = this.member2.getHappy().getName();
		 String bTeamDog = otherTeam.member2.getHappy().getName();
		 System.out.println(aTeamDog+"¿Í "+bTeamDog+"°¡ °³½Î¿òÀ» ÇÕ´Ï´Ù.");
		 
	}

	public void carPrice(Team otherTeam) {
		String aTeamPersonName = this.captain.getName();
		String aTeamCarModelName = this.captain.getK7().getModelName();
		String aTeamCarPrice = this.captain.getK7().getCarNo();
		
		String bTeamPersonName = otherTeam.captain.getName();
		String bTeamCarModelName = otherTeam.captain.getK7().getModelName();
		String bTeamCarPrice= otherTeam.captain.getK7().getCarNo();
		
		
		System.out.println(aTeamPersonName + " " + aTeamCarModelName + " " + aTeamCarPrice);
		System.out.println(bTeamPersonName + " " + bTeamCarModelName + " " + bTeamCarPrice);
		
		

		
		
	}

	public void DogGender(Team otherTeam) {
		// TODO Auto-generated method stub
		String aTeamDogName = this.member1.getHappy().getName();
		String aTeamDogGender = this.member1.getHappy().getGender();
		
		String bTeamDogName = otherTeam.member1.getHappy().getName();
		String bTeamDogGender = otherTeam.member1.getHappy().getGender();
		
		System.out.println(aTeamDogName + "´Â " + aTeamDogGender);
		System.out.println(bTeamDogName + "´Â " + bTeamDogGender);
		
		
	}
	

}
