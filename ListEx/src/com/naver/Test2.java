package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

	public void me6() {
		// list ��ü�� ����ÿ�. ��, Map<String, Object>�� ���� �� ����.
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		list.add(new HashMap<String, Object>());

		// ��� ��ü�� ������ �� ���.
		list.clear();

	}

	public void me5() {
		// list ��ü�� ����ÿ�. ��, Thread�� ���� �� ����.
		List<Thread> list = new ArrayList<Thread>();
		list.add(new Thread());

		// list�� �ִ� ��ü�� ��� ����Ͻÿ�.
		for (int i = 0; i < list.size(); i++) {
			Thread th = list.get(i);
			System.out.println(th);
		}

	}

	public void me4() {
		// list ��ü�� ���弼��. ��, new StringPuffer()�� ���� �� ����.
		List<StringBuffer> list = new ArrayList<StringBuffer>();
		list.add(new StringBuffer());

		// list�� ��� �ִ� ��� �����͸� ����Ͻÿ�.
		for (int i = 0; i < list.size(); i++) {
			StringBuffer stb = list.get(i);
			System.out.println(stb);
		}

	}

	public void me3() {
		// list ��ü�� ���弼��. ��, 3.5, 4.1, 9.8�� �Է��� �� �ִ� ��ü�Դϴ�.
		List<Double> list = new ArrayList<Double>();
		list.add(3.5);
		list.add(4.1);
		list.add(9.8);

		// 4.1d�� ������ ����Ͻÿ�.
		list.get(1);
		System.out.println(list);
		
		//list�� ��� ��ڰ��� ����Ͻÿ�.
		for (int i = 0; i < list.size(); i++) {
			Double db = list.get(i);
			System.out.println(db);
		}

		// list�� ����ִ� ������ ��Ұ��� 1.1�� �����ϰ� �ͽ��ϴ�.
		list.set(list.size()-1, 1.1);

		// list�� �ִ� �����͸� �ݺ����� �̿��ؼ� ���� �����Ͻÿ�.
		for(int i = list.size()-1; i >=0; i--) {
			list.remove(i);
		}

	}

	public void me2() {
		// list ��ü�� ����� �ּ���. ��, ���׸� Ÿ���� 3, 4, 5, 6�Է��� �� �ְ�
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		// 5�� ������ ����Ͻÿ�.
		Integer it = list.get(2);
		System.out.println(it);

		// list�� ����ִ� ��� ��Ұ��� ����Ͻÿ�.
		for (int i = 0; i < list.size(); i++) {
			Integer it1 = list.get(i);
			System.out.println(it1);
		}

		// list�� 5�� 100���� �ٲٰ� �ʹ�.
		list.set(2, 100);
		System.out.println(list);

//		list.remove(1);
//		list.remove(2);

		// 3, 6�� ����� �����ϰ�ʹ�. **�ε����� �����ϸ� ���� ������ ����� **�ڿ������� ������ ��.
		list.remove(2);
		list.remove(1);

	}

	public void me1() {
		// list ��ü�� ����ÿ�. ��, new Apple()�� ���� �� ����.
		List<Apple> list = new ArrayList<Apple>();
		list.add(new Apple());
		Apple apple = list.get(0);
		System.out.println(apple);

		// list�� ����ִ� ��� ��Ұ��� ����Ͻÿ�.
		for (int i = 0; i < list.size(); i++) {
			Apple apple1 = list.get(i);
			System.out.println(apple1);
		}
		

	}
}
