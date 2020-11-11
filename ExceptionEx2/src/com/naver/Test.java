package com.naver;

import java.io.Serializable;
import java.util.ArrayList;

public class Test {
	
	public void me1() {
		String msg = "hello";
		System.out.println(msg.length());
	}
	
	public void me2() {
		int[] arr = {3,6,9};
		System.out.println(arr[2]);
	}
	
	public void me3() {
		Serializable t1 = new String("hello");
		Serializable t2 = new ArrayList<Object>();
		
		try {
			String msg = (String) t2;
		} catch (Exception e) {
			System.out.println("뭔가가 문제가 있지만 무시하겠음.");
		}
		
	}
	public void me4(int weaponIdx) {
		String[] arr = {"활","검","총"};
		
		try {
			System.out.println(arr[weaponIdx]);
		} catch (Exception e) {
			System.out.println("사용자가 잘못된 값을 입력했습니다.");
		}
	}
	
	public void me5(int idx) throws Exception {
		String msg = "hi";
		
		System.out.println(msg.charAt(idx));
	}
}
