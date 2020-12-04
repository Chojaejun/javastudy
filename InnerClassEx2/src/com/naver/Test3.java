package com.naver;

public class Test3 {
	
	private String msg;
	
	public static class StaticInnerClass{
		private int age;
		public static String name;
		
		public void sic() {
			Test3 t3 = new Test3();
			
			System.out.println(t3.msg);
			System.out.println("sic");
		
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public static String getName() {
			return name;
		}

		public static void setName(String name) {
			StaticInnerClass.name = name;
		}
		
	}
	public void me1() {
		
	}
	
}
