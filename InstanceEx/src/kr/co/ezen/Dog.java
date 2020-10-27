package kr.co.ezen;

import java.util.Date;

public class Dog {
	private int did;
	private String name;
	private String gender;
	private java.util.Date birth;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public Dog(int did, String name, String gender, Date birth) {
		super();
		this.did = did;
		this.name = name;
		this.gender = gender;
		this.birth = birth;
	}





	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public java.util.Date getBirth() {
		return birth;
	}


	public void setBirth(java.util.Date birth) {
		this.birth = birth;
	}
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String sleep(String where) {
		String msg = where + "ø°º≠ ¿‹¥Ÿ.";
		return msg;
	}
	
	

}
