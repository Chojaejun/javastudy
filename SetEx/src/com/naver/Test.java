package com.naver;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public void me4() {// set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<MembetDTO> set = new HashSet<MembetDTO>();
		set.add(new MembetDTO("m001", "kim", 4));
		set.add(new MembetDTO("m002", "lee", 11));
		set.add(new MembetDTO("m005", "park", 32));
		set.add(new MembetDTO("m002", "kang", 43));// 중복
		set.add(new MembetDTO("m005", "choi", 2));// 중복

		// 크기 알아보기.(id가 같으면 하나 빼고 제외 된 값이 나옴)
		int size = set.size();
		System.out.println(size);
		
		//1. 배열로 arr에 set이 갖고 있는 데이터를 저장하고
		//2. 그 중 id가 m005인 MemberDTO 객체를 이용해서 
		//3. 그 객체의 age 값을 출력하시오.
		
		Iterator<MembetDTO> it = set.iterator();
		MembetDTO[] arr = new MembetDTO[set.size()];
		int idx = 0;
		while (it.hasNext()) {
			MembetDTO membetDTO = it.next();
			arr[idx] = membetDTO;
			
			idx++;
		}
		
		for(int i = 0; i<arr.length; i++) {
			MembetDTO dto = arr[i];
			if(dto.getId().equals("m005")) {
				System.out.println(dto.getAge());
			}
		}
		
		//위 문제를 list 사용해서 만들기
//		Iterator<MembetDTO> it = set.iterator();
//		List<MembetDTO> list = new ArrayList<MembetDTO>();
//		
//		while (it.hasNext()) {
//			MembetDTO membetDTO = it.next();
//			list.add(membetDTO);
//		}
//		
//		int index = list.indexOf(new MembetDTO("m005", null, 0));
//		MembetDTO dto = list.get(index);
//		System.out.println(dto.getAge());
			
		
		

		// "m001" 삭제하기
		set.remove(new MembetDTO("m001", null, 0));
		System.out.println(set);

		// 전부 삭제하기.
		set.clear();
	}

	public void me3() {// set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "대구", "사과1", 1500));
		set.add(new Apple("a002", "대전", "사과2", 2000));
		set.add(new Apple("a003", "서울", "사과3", 3000));
		set.add(new Apple("a002", "부산", "사과44", 500));// 중복
		set.add(new Apple("a005", "청송", "사과5", 1000));

		// 크기 알아보기.(id가 같으면 하나 빼고 제외 된 값이 나옴)
		int size = set.size();
		System.out.println(size);

		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>(); //while문 밖에서 a003만 출력할 때 만들기

		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple); //while문 밖에서 a003만 출력할 때 만들기
		}
		//while문 밖에서 a003만 출력하고 싶어..
		int idx = list.indexOf(new Apple("a003", null, null, 0));
		Apple ap = list.get(idx);
		System.out.println(">>>>>>>>>>>>");
		System.out.println(ap);

		// a002 삭제하기.
		set.remove(new Apple("a002", null, null, 0));
		System.out.println(set);

		// 전부 삭제하기.
		set.clear();
	}

	public void me2() {// set: 데이터의 중복을 허용하지 않습니다. // 입력 순서와 출력 순서 사이에 상관관계가 없습니다.(인덱스가 없다.)
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));// 중복
		set.add("hello");// 중복
		set.add("Hello");
		set.add(new String("Hello"));// 중복
		set.add("HELLO");
		set.add(new String("HELLO"));// 중복

		// 크기 알아보기.(id가 같으면 하나 빼고 제외 된 값이 나옴)
		int size = set.size();
		System.out.println(size);

		Iterator<String> it = set.iterator();
		List<String> list = new ArrayList<String>();// while문 밖에서 HELLO만 출력할 때 만들기.

		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
			list.add(string); // while문 밖에서 HELLO만 출력할 때 만들기
		}
		// while문 밖에서 HELLO만 출력하고 싶어..
		int idx = list.indexOf("HELLO");
		String msg = list.get(idx);
		System.out.println(">>>>>>>>>>>");
		System.out.println(msg);

		// HELLO 삭제하기.
		set.remove("HELLO");
		System.out.println(set);

		// 전부 삭제하기
		set.clear();

	}

	public void me1() {
		Set<Integer> set = new HashSet<Integer>();

		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(1);

		// 크기 알아보기.(id가 같으면 하나 빼고 제외 된 값이 나옴)
		int size = set.size();
		System.out.println(size);

		Iterator<Integer> it = set.iterator();
		List<Integer> list = new ArrayList<Integer>();// while문 밖에서 3만 출력할 때 만들기

		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			list.add(integer); // while문 밖에서 3만 출력할 때 만들기.
		}
		// data 중에서 3 만 출력하고 싶어...
		// while문 밖에서
		int idx = list.indexOf(3);
		int num = list.get(idx);
		System.out.println(">>>>>>>>>>>>>");
		System.out.println(num);

		// 4 삭제하기.
		set.remove(4);
		System.out.println(set);

		// 전부 삭제하기.
		set.clear();

	}

}

