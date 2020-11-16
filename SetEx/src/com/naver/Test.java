package com.naver;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {

	public void me4() {// set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<MembetDTO> set = new HashSet<MembetDTO>();
		set.add(new MembetDTO("m001", "kim", 4));
		set.add(new MembetDTO("m002", "lee", 11));
		set.add(new MembetDTO("m005", "park", 32));
		set.add(new MembetDTO("m002", "kang", 43));// �ߺ�
		set.add(new MembetDTO("m005", "choi", 2));// �ߺ�

		// ũ�� �˾ƺ���.(id�� ������ �ϳ� ���� ���� �� ���� ����)
		int size = set.size();
		System.out.println(size);
		
		//1. �迭�� arr�� set�� ���� �ִ� �����͸� �����ϰ�
		//2. �� �� id�� m005�� MemberDTO ��ü�� �̿��ؼ� 
		//3. �� ��ü�� age ���� ����Ͻÿ�.
		
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
		
		//�� ������ list ����ؼ� �����
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
			
		
		

		// "m001" �����ϱ�
		set.remove(new MembetDTO("m001", null, 0));
		System.out.println(set);

		// ���� �����ϱ�.
		set.clear();
	}

	public void me3() {// set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
		set.add(new Apple("a002", "�λ�", "���44", 500));// �ߺ�
		set.add(new Apple("a005", "û��", "���5", 1000));

		// ũ�� �˾ƺ���.(id�� ������ �ϳ� ���� ���� �� ���� ����)
		int size = set.size();
		System.out.println(size);

		Iterator<Apple> it = set.iterator();
		List<Apple> list = new ArrayList<Apple>(); //while�� �ۿ��� a003�� ����� �� �����

		while (it.hasNext()) {
			Apple apple = it.next();
			System.out.println(apple);
			list.add(apple); //while�� �ۿ��� a003�� ����� �� �����
		}
		//while�� �ۿ��� a003�� ����ϰ� �;�..
		int idx = list.indexOf(new Apple("a003", null, null, 0));
		Apple ap = list.get(idx);
		System.out.println(">>>>>>>>>>>>");
		System.out.println(ap);

		// a002 �����ϱ�.
		set.remove(new Apple("a002", null, null, 0));
		System.out.println(set);

		// ���� �����ϱ�.
		set.clear();
	}

	public void me2() {// set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));// �ߺ�
		set.add("hello");// �ߺ�
		set.add("Hello");
		set.add(new String("Hello"));// �ߺ�
		set.add("HELLO");
		set.add(new String("HELLO"));// �ߺ�

		// ũ�� �˾ƺ���.(id�� ������ �ϳ� ���� ���� �� ���� ����)
		int size = set.size();
		System.out.println(size);

		Iterator<String> it = set.iterator();
		List<String> list = new ArrayList<String>();// while�� �ۿ��� HELLO�� ����� �� �����.

		while (it.hasNext()) {
			String string = it.next();
			System.out.println(string);
			list.add(string); // while�� �ۿ��� HELLO�� ����� �� �����
		}
		// while�� �ۿ��� HELLO�� ����ϰ� �;�..
		int idx = list.indexOf("HELLO");
		String msg = list.get(idx);
		System.out.println(">>>>>>>>>>>");
		System.out.println(msg);

		// HELLO �����ϱ�.
		set.remove("HELLO");
		System.out.println(set);

		// ���� �����ϱ�
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

		// ũ�� �˾ƺ���.(id�� ������ �ϳ� ���� ���� �� ���� ����)
		int size = set.size();
		System.out.println(size);

		Iterator<Integer> it = set.iterator();
		List<Integer> list = new ArrayList<Integer>();// while�� �ۿ��� 3�� ����� �� �����

		while (it.hasNext()) {
			Integer integer = it.next();
			System.out.println(integer);
			list.add(integer); // while�� �ۿ��� 3�� ����� �� �����.
		}
		// data �߿��� 3 �� ����ϰ� �;�...
		// while�� �ۿ���
		int idx = list.indexOf(3);
		int num = list.get(idx);
		System.out.println(">>>>>>>>>>>>>");
		System.out.println(num);

		// 4 �����ϱ�.
		set.remove(4);
		System.out.println(set);

		// ���� �����ϱ�.
		set.clear();

	}

}

