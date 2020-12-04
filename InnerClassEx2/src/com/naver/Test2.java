package com.naver;

public class Test2 {

	private String msg;

	public class MemberClass {
		private int age;

		public void mc1() {
			me1();;
			System.out.println(msg);
			System.out.println("mc1");
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

	}

	public void me1() {

	}

}
