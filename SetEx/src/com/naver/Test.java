package com.naver;

import java.util.HashSet;
import java.util.Set;

public class Test {
	
	public void me4() {//set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<MembetDTO> set = new HashSet<MembetDTO>();
		set.add(new MembetDTO("m001", "kim", 4));
		set.add(new MembetDTO("m002", "lee", 11));
		set.add(new MembetDTO("m005", "park", 32));
		set.add(new MembetDTO("m002", "kang", 43));// �ߺ�
		set.add(new MembetDTO("m005", "choi", 2));// �ߺ�
	}
	
	public void me3() {//set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<Apple> set = new HashSet<Apple>();
		set.add(new Apple("a001", "�뱸", "���1", 1500));
		set.add(new Apple("a002", "����", "���2", 2000));
		set.add(new Apple("a003", "����", "���3", 3000));
		set.add(new Apple("a002", "�λ�", "���44", 500));//�ߺ�
		set.add(new Apple("a005", "û��", "���5", 1000));
	}
	
	public void me2() {//set: �������� �ߺ��� ������� �ʽ��ϴ�. // �Է� ������ ��� ���� ���̿� ������谡 �����ϴ�.(�ε����� ����.)
		Set<String> set = new HashSet<String>();
		set.add("hello");
		set.add(new String("hello"));// �ߺ�
		set.add("hello");// �ߺ�
		set.add("Hello");
		set.add(new String("Hello"));// �ߺ�
		set.add("HELLO");
		set.add(new String("HELLO"));// �ߺ�
		
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
