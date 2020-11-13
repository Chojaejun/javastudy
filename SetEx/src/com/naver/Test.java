package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public void me4() {//set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<MembetDTO> set = new HashSet<MembetDTO>();
		set.add(new MembetDTO("m001", "kim", 4));
		set.add(new MembetDTO("m002", "lee", 11));
		set.add(new MembetDTO("m005", "park", 32));
		set.add(new MembetDTO("m002", "kang", 43));// 중복
		set.add(new MembetDTO("m005", "choi", 2));// 중복
	}
	
	public void me3() {//set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a002", "부산", "사과44", 500));//중복
		set.add(new Apple("a005", "청송", "사과5", 1000));
	}
	
	public void me2() {//set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));// 중복
		set.add("hello");// 중복
		set.add("Hello");
		set.add(new String("Hello"));// 중복
		set.add("HELLO");
		set.add(new String("HELLO"));// 중복
		
	}
	
	public void me1() {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);
		
	}

}
