package kr.co.ezen;

import java.util.Date;

public class Dog {
	private String id;
	private String dogName;
	private Date birth;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public Dog(String id, String dogName, Date birth) {
		super();
		this.id = id;
		this.dogName = dogName;
		this.birth = birth;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	

}
