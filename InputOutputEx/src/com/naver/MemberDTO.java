package com.naver;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; // 한번 정해 놓으면 바꾸면 안된다.(바꾸면 뜨는 에러는 InvalidClassException)
	
	private transient String id; // transient : 너무 중요해서 외부로 유출되는 것을 막을 때 사용 --> 출력시 값은 null
	private String name;
	private int age;
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
	

}
