package com.naver;

public class Test4 {
	
	public void me1() {
		int a = 10;
		
		class LoclaInnerClass{
			public void lic() {
				System.out.println(a);
			}
		}
		
		LoclaInnerClass lic1 = new LoclaInnerClass();
		lic1.lic();
	}

}
