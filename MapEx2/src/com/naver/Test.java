package com.naver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public void me5(String filename) {
		
	}

	public void me4() {
		
	}

	public void me3() {
		
	}

	public void me2() {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "kim");
		map.put(0, "lee");
		map.put(2, "park");
		
	}

	public void me1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
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
		
		System.out.println(">>>>>>>>>>>>");
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int val = map.get(key);
			System.out.println(key + " : " + val);
			
			
		}
		
		System.out.println("::::::::::::::");
		Collection<Integer> col = map.values();
		Iterator<Integer> cit = col.iterator();
		while (cit.hasNext()) {
			Integer valu = cit.next();
			System.out.println(valu);
		}
		
	}

}
