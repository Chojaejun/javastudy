package com.naver;

public class Test2 {

	public void me1() {
		// �ڷ���[] ������ = new �ڷ���[�迭�� ũ��];
		int[] arrInt = new int[4];
		// length�� �迭�� �Ӽ����� �ݺ����� Ʋ�� ��, �������� �迭�� ũ�� ��� ����Ѵ�.
		System.out.println(arrInt.length);

	}

	// �迭�� ũ�Ⱑ 100�� StringBuffer���� 1���� �迭 arrSb�� �����Ͻð�
	// arrSb�� �迭 ũ�⸦ ����Ͻÿ�.
	public void me11() {
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(arrSb.length);

	}

	// 1. Test clss�� me12()���� �Ķ���ͷ� �Ѿ�� �迭 �������� ũ�⸦ ����Ͻÿ�.
	// 2. main()�� ���� me12()�� ȣ���Ͻÿ�.
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);

	}

	// 1. data.split("#")�� ��ȯ���� arrData�� �ް�
	// 2. arrData�� ũ�⸦ ����Ͻÿ�.
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		// data.split("#"); -> ��ȯ ���� arrData��
		String[] arrData = data.split("#");

		System.out.println(arrData.length);
	}

	public void me2() {
		// �ڷ���[] �迭�� = {�ڷ����� �´� ��1, ��2, ��3...};
		int[] arrInt = { 1, 4, 6 };

		// arrInt�� �迭 ũ�⸦ ����Ͻÿ�.
		System.out.println(arrInt.length);
	}

	// 1. �ڷ����� Dog�� 1���� �迭 arrDog�� �迭���� �� ��° ������� �����Ͻÿ�.
	// ��, ũ��� 2�� �Ͻÿ�.
	// 2. arrDog�� �迭 ũ�⸦ ����Ͻÿ�.
	public void me21() {
		Dog[] arrDog = { new Dog(), new Dog() };
		System.out.println(arrDog.length);

		// Dog a = new Dog();
		// Dog b = new Dog();
		// Dog[] arrDog = {a,b};
	}

	// 1. arrStr�� ũ�⸦ ����Ͻÿ�.
	// 2. main()���� me22() ȣ���Ͻÿ�.
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);
	}

	public void me3() {
		int[] arrInt = new int[] { 1, 3, 5, 7 };
		System.out.println(arrInt.length);
	}

	// 1. �迭 ���� �� ��° ������� arrFloat ��ü�� ����.
	// 2. �迭�� ���� ���� 3.14, 4.2, 9.8 �Դϴ�.
	// 3. arrFloat�� �迭 ũ�⸦ ����Ͻÿ�.
	public void me31() {
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);
	}

	// 1. dogs�� �迭 ũ�⸦ ����Ͻÿ�.
	// 2. main()���� me32()�޼��带 ȣ���Ͻÿ�.
	// ��, �����Ͱ� �ʿ��ϸ� new Dog(), new Dog(), new Dog(), new Dog()�� ��� �̿�
	public void me32(Dog[] dogs) {
		int size = dogs.length;
		System.out.println(size);

	}

}
