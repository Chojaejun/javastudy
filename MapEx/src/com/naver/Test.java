package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "문서파일");
		map.put("png", "이미지파일");
		map.put("gif", "이미지파일");
		map.put("jpeg", "이미지파일");
		map.put("jpg", "이미지파일");
		// 그 외는 "시스템파일"
		//filename = "aaa.abb.c.de.png"
		int idx = filename.lastIndexOf(".");//마지막 . 을 찾기 위함(png)
		String key = filename.substring(idx+1);// . 을 빼고 그 다음부터 잘라내기 위해서(. 을 제외하기 위해서)
		String msg = map.get(key.toLowerCase());// key.toLowerCase 대,소문자를 구별하지 않고 찾을 수 있게 하기
		if(msg == null) {//map에 없는 key를 입력하면 value로 null을 반환함.
			System.out.println("시스템파일");
		}else {//그렇지 않을 때는
			System.out.println(msg);
		}
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "누렁이", "진도인", 3));
		list1.add(new Dog("d002", "백구", "진도인2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "독일인1", 1));
		list2.add(new Dog("d004", "타크", "독일인2", 2));
		
		map.put("진돗개", list1);
		map.put("세퍼드", list2);
		
		List<Dog> dog1 = map.get("진돗개");
		System.out.println(dog1);
		
		for (int i = 0; i < dog1.size(); i++) {
			Dog dog= dog1.get(i);
			String id = dog.getId();
			System.out.println(id);
		}	
		
		List<Dog> dog2 = map.get("세퍼드");
		System.out.println(dog2);
		
		for (int i = 0; i < dog2.size(); i++) {
			Dog dog = dog2.get(i);
			String id = dog.getId();
			System.out.println(id);
		}
		
	}
	
	public void me3() {
		//1.map 객체 생성
		//단, K: String, V: List<String>
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		List<String> list1 = new ArrayList<String>();
		list1.add("sonata");
		list1.add("exel");
		list1.add("genesis");
		list1.add("grandure");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("k7");
		list2.add("k5");
		list2.add("pride");
		list2.add("지프");
		
		map.put("현대차", list1);
		map.put("기아차", list2);
		
		List<String> hc = map.get("현대차");
		System.out.println(hc);
		for (int i = 0; i < hc.size(); i++) {
			System.out.println(hc.get(i));
		}
		List<String> kc = map.get("기아차");
		System.out.println(kc);
		for (int i = 0; i < kc.size(); i++) {
			System.out.println(kc.get(i));
		}
		
	}
	
	public void me2() {
		//1.map 객체를 만드시오.
		//단, K: Integer, V: String
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");//기존 Value 1,kim을 --> 1,kang으로 변경
		
		String name = map.get(1);
		System.out.println(name);
		String name1 = map.get(0);
		System.out.println(name1);
		String name2 = map.get(2);
		System.out.println(name2);
	}
	
	public void me1() {
		//1. Map, HashMap
		//2. map 객체를 만드세요.
		//단, key: String, Value: Integer
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map에 데이터 입력
		map.put("중력가속도", 9);
		map.put("우리집 비밀번호", 12345);
		map.put("서울과 부산간의 거리", 300);
		
		System.out.println(map);
		
		int g = map.get("중력가속도");
		System.out.println(g);
		int password = map.get("우리집 비밀번호");
		System.out.println(password);
		int leng = map.get("서울과 부산간의 거리");
		System.out.println(leng);
		
	}

}
