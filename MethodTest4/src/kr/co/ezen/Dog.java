package kr.co.ezen;

public class Dog {
	private String name;
	private int age;
	
	public Dog() {
		name = "∏€∏€¿Ã";
		age = 23;
	}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(int age) {
		this.age = age;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public Dog(int age, String name) {
		this.name = name;
		this.age = age;
		
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
	
	public void me1() {
		
	}
	
	public void me2(String name, int age) {
		
	}
	
	public Dog me3() {
		int a = 3;
		int b = 4;
		int c = a + b;
		System.out.println(c);
		return new Dog();
		
	}
	
	public int me4(String name) {
		int size = name.length();
		return size;
		
	}
	
	

}
