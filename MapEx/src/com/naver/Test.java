package com.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	
	public void me5(String filename) {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("txt", "��������");
		map.put("png", "�̹�������");
		map.put("gif", "�̹�������");
		map.put("jpeg", "�̹�������");
		map.put("jpg", "�̹�������");
		// �� �ܴ� "�ý�������"
		//filename = "aaa.abb.c.de.png"
		int idx = filename.lastIndexOf(".");//������ . �� ã�� ����(png)
		String key = filename.substring(idx+1);// . �� ���� �� �������� �߶󳻱� ���ؼ�(. �� �����ϱ� ���ؼ�)
		String msg = map.get(key.toLowerCase());// key.toLowerCase ��,�ҹ��ڸ� �������� �ʰ� ã�� �� �ְ� �ϱ�
		if(msg == null) {//map�� ���� key�� �Է��ϸ� value�� null�� ��ȯ��.
			System.out.println("�ý�������");
		}else {//�׷��� ���� ����
			System.out.println(msg);
		}
	}
	
	public void me4() {
		Map<String, List<Dog>> map = new HashMap<String, List<Dog>>();
		
		List<Dog> list1 = new ArrayList<Dog>();
		list1.add(new Dog("d001", "������", "������", 3));
		list1.add(new Dog("d002", "�鱸", "������2", 4));
		
		List<Dog> list2 = new ArrayList<Dog>();
		list2.add(new Dog("d003", "happy", "������1", 1));
		list2.add(new Dog("d004", "Ÿũ", "������2", 2));
		
		map.put("������", list1);
		map.put("���۵�", list2);
		
		List<Dog> dog1 = map.get("������");
		System.out.println(dog1);
		
		for (int i = 0; i < dog1.size(); i++) {
			Dog dog= dog1.get(i);
			String id = dog.getId();
			System.out.println(id);
		}	
		
		List<Dog> dog2 = map.get("���۵�");
		System.out.println(dog2);
		
		for (int i = 0; i < dog2.size(); i++) {
			Dog dog = dog2.get(i);
			String id = dog.getId();
			System.out.println(id);
		}
		
	}
	
	public void me3() {
		//1.map ��ü ����
		//��, K: String, V: List<String>
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
		list2.add("����");
		
		map.put("������", list1);
		map.put("�����", list2);
		
		List<String> hc = map.get("������");
		System.out.println(hc);
		for (int i = 0; i < hc.size(); i++) {
			System.out.println(hc.get(i));
		}
		List<String> kc = map.get("�����");
		System.out.println(kc);
		for (int i = 0; i < kc.size(); i++) {
			System.out.println(kc.get(i));
		}
		
	}
	
	public void me2() {
		//1.map ��ü�� ����ÿ�.
		//��, K: Integer, V: String
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		map.put(1, "kang");//���� Value 1,kim�� --> 1,kang���� ����
		
		String name = map.get(1);
		System.out.println(name);
		String name1 = map.get(0);
		System.out.println(name1);
		String name2 = map.get(2);
		System.out.println(name2);
	}
	
	public void me1() {
		//1. Map, HashMap
		//2. map ��ü�� ���弼��.
		//��, key: String, Value: Integer
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//map�� ������ �Է�
		map.put("�߷°��ӵ�", 9);
		map.put("�츮�� ��й�ȣ", 12345);
		map.put("����� �λ갣�� �Ÿ�", 300);
		
		System.out.println(map);
		
		int g = map.get("�߷°��ӵ�");
		System.out.println(g);
		int password = map.get("�츮�� ��й�ȣ");
		System.out.println(password);
		int leng = map.get("����� �λ갣�� �Ÿ�");
		System.out.println(leng);
		
	}

}
