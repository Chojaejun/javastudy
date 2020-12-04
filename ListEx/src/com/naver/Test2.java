package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public void me6() {
		// list 객체를 만드시오. 단, Map<String, Object>를 담을 수 있음.
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());

		// 모든 객체를 삭제할 때 사용.
		list.clear();

	}

	public void me5() {
		// list 객체를 만드시오. 단, Thread를 담을 수 있음.
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());

		// list에 있는 객체를 모두 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			Thread th = list.get(i);
			System.out.println(th);
		}

	}

	public void me4() {
		// list 객체를 만드세요. 단, new StringPuffer()를 담을 수 있음.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());

		// list에 들어 있는 모든 데이터를 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			StringBuffer stb = list.get(i);
			System.out.println(stb);
		}

	}

	public void me3() {
		// list 객체를 만드세요. 단, 3.5, 4.1, 9.8을 입력할 수 있는 객체입니다.
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);

		// 4.1d을 꺼내서 출력하시오.
		list.get(1);
		System.out.println(list);
		
		//list의 모든 요솟값을 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			Double db = list.get(i);
			System.out.println(db);
		}

		// list에 들어있는 마지막 요소값을 1.1로 변경하고 싶습니다.
		list.set(list.size()-1, 1.1);

		// list에 있는 데이터를 반복문을 이용해서 전부 삭제하시오.
		for(int i = list.size()-1; i >=0; i--) {
			list.remove(i);
		}

	}

	public void me2() {
		// list 객체를 만들어 주세요. 단, 제네릭 타임은 3, 4, 5, 6입력할 수 있게
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		// 5를 꺼내서 출력하시오.
		Integer it = list.get(2);
		System.out.println(it);

		// list에 들어있는 모든 요소값을 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			Integer it1 = list.get(i);
			System.out.println(it1);
		}

		// list의 5를 100으로 바꾸고 싶다.
		list.set(2, 100);
		System.out.println(list);

//		list.remove(1);
//		list.remove(2);

		// 3, 6만 남기고 삭제하고싶다. **인덱스는 삭제하면 값이 앞으로 당겨짐 **뒤에서부터 삭제할 것.
		list.remove(2);
		list.remove(1);

	}

	public void me1() {
		// list 객체를 만드시오. 단, new Apple()을 담을 수 있음.
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		Apple apple = list.get(0);
		System.out.println(apple);

		// list에 들어있는 모든 요소값을 출력하시오.
		for (int i = 0; i < list.size(); i++) {
			Apple apple1 = list.get(i);
			System.out.println(apple1);
		}
		

	}
}
