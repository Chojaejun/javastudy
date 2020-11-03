package com.naver;

public class Test {

	public void me1() {
		// �ڷ���[] ������ = new �ڷ���[�迭�� ũ��];
		int[] arrInt = new int[4];

		// arrInt�� 0,1,2,3�� �Է��Ͻÿ�.
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}

		// arrInt�� 0,2,4,6
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2;
		}

		// arrInt�� 1,3,5,7
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2 + 1;
		}

		// length�� �迭�� �Ӽ����� �ݺ����� Ʋ�� ��, �������� �迭�� ũ�� ��� ����Ѵ�.
		System.out.println(arrInt.length);
		System.out.println(">>>>>>>>>>");

		arrInt[0] = 100;
		System.out.println(arrInt[0]); // 0

		arrInt[1] = 200;
		System.out.println(arrInt[1]); // 0

		arrInt[2] = 300;
		System.out.println(arrInt[2]); // 0

		arrInt[3] = 400;
		System.out.println(arrInt[3]); // 0
		System.out.println(">>>>>>>>>>>>");

		// arrInt�� ���� �ִ� ��� ��ڰ��� for���� �̿��ؼ� ���� ����ϼ���.
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);

		}

	}

	public void me0() {
		// �迭�� ����ϴ� ����
		// 1. �ݺ��� ����� ���ؼ�
		// 2. �������� �����͸� ��ȯ�ϱ� ���ؼ�

		int a0 = 3;
		int a1 = 6;
		int a2 = 3;
		int a3 = 7;

		for (int i = 0; i < 4; i++) {
			System.out.println('a' + i);
		}

	}

	public int[] me01() {
		int[] arr = { 3, 6, 3, 7 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		return arr;
	}

	// �迭�� ũ�Ⱑ 100�� StringBuffer���� 1���� �迭 arrSb�� �����Ͻð�
	// arrSb�� �迭 ũ�⸦ ����Ͻÿ�.
	public void me11() {
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println("::::::::::::::");

		// arrSb�� 51��° ��ڰ��� ����ϼ���.
		System.out.println(arrSb[50]);

		StringBuffer sb1 = new StringBuffer();
		// arrSb�� �ε����� 1���� ���� sb1 ��ü�� �����϶�
		arrSb[1] = sb1;

		// arrSb�� ���� �ִ� ��� ��ڰ��� ����� ��.
		// ��, ��� ������ �ε����� ū ������ ����մϴ�.
		for (int i = arrSb.length - 1; i >= 0; i--) {
			System.out.println(arrSb[i]);

		}

	}

	// 1. Test clss�� me12()���� �Ķ���ͷ� �Ѿ�� �迭 �������� ũ�⸦ ����Ͻÿ�.
	// 2. main()�� ���� me12()�� ȣ���Ͻÿ�.
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);
		// dogs�� ���� ū �ε��� ��ڰ��� null�� �����Ͻÿ�.

		dogs[dogs.length - 1] = null;

		// dogs �迭�� �ִ� ��� dog ��ü�� ����Ͻÿ�.
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}

		// dogs �迭�� �ִ� ��� dog ��ü�� �̸��� ����Ͻÿ�.
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];

			if (dog != null) {
				String name = dog.getName();
				System.out.println(name);
			}

			// System.out.println(dogs[i].getName());
		}

	}

	// 1. data.split("#")�� ��ȯ���� arrData�� �ް�
	// 2. arrData�� ũ�⸦ ����Ͻÿ�.
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		// data.split("#"); -> ��ȯ ���� arrData��
		String[] arrData = data.split("#");

		System.out.println(arrData.length);

		// arrData�� ���� ū �ε����� ��ڰ��� 100���� �����Ͻÿ�.
		arrData[arrData.length - 1] = "100";

		// arrData�� ���� ���� �ε����� ��ڰ��� "ezen"���� ��û�Ͻÿ�.
		arrData[0] = "ezen";

		// 1. arrData�� ��� ��ڰ��� ����Ͻÿ�.
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}

		// 2. arrData�� ��� ��ڰ��� ù ���ڸ� ����Ͻÿ�.
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i].charAt(0));
		}

	}

	public void me2() {
		// �ڷ���[] �迭�� = {�ڷ����� �´� ��1, ��2, ��3...};
		int[] arrInt = { 1, 4, 6 };

		// arrInt�� �迭 ũ�⸦ ����Ͻÿ�.
		System.out.println(arrInt.length);

		// arrInt �迭�� 2��° ��ڰ��� ����Ͻÿ�.
		System.out.println(arrInt[1]);

		// arrInt �迭�� �ε����� 1�� ��ڰ��� 333���� �����Ͽ���.
		arrInt[1] = 333;

		// 1.arrInt�� ������ �ִ� ��� ��ڰ� ����ϱ�
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// 2. arrInt�� ������ �ִ� ��� ��ڰ� ����ϱ� ��, �ε����� 1�� ��ڰ��� ��� ����.
		for (int i = 0; i < arrInt.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(arrInt[i]);
		}

		// 3. arrInt�� ������ �ִ� ��� ��ڰ� ����ϱ� ��, ��ڰ��� 6�̸� ��� ����.
		for (int i = 0; i < arrInt.length; i++) {
			int num = arrInt[i];
			if (num == 6) {
				continue;
			}
			System.out.println(num);
		}
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

		// arrDog�� ���� ū �ε����� ��ڰ��� null�� �����Ͻÿ�
		arrDog[arrDog.length - 1] = null;

		// 1. arrDog�� ��� ��ڰ��� ����Ͻÿ�
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}

		// 2. arrDog�� �ε����� 1�� ��ڰ��� name�� ����Ͻÿ�.
		// ��, �ش� ��ڰ��� null�� �ƴ� ��쿡��
		Dog dog = arrDog[1];

		if (arrDog != null) {
			System.out.println(dog.getName());
		}

	}

	// 1. arrStr�� ũ�⸦ ����Ͻÿ�.
	// 2. main()���� me22() ȣ���Ͻÿ�.
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);

		// arrStr�� index�� 1�� ���� ���� "12"�� �����Ͻÿ�.
		arrStr[1] = "12";

		// arrStr�� index�� 1�� ���� ���� ����Ͻÿ�.
		String s1 = arrStr[1];
		System.out.println(s1);

		System.out.println(arrStr[1]);

		int[][] arr2Int = { { 1, 3, 5, 7 }, { 0, 2, 4, 6 } };

		int[] arr0Int = arr2Int[0];
		int i1 = arr0Int[1];

		// int a = arr2Int[0][1];
	}

	public void me3() {
		int[] arrInt = new int[] { 1, 3, 5, 7 };
		System.out.println(arrInt.length);

		// arrInt�� �ε��� ���� 2�� ���� ����Ͻÿ�.
		System.out.println(arrInt[2]);
		// arrInt�� �� ��° �ε��� ���� 100���� �����Ͻÿ�.
		arrInt[1] = 100;
	}

	// 1. �迭 ���� �� ��° ������� arrFloat ��ü�� ����.
	// 2. �迭�� ���� ���� 3.14, 4.2, 9.8 �Դϴ�.
	// 3. arrFloat�� �迭 ũ�⸦ ����Ͻÿ�.
	public void me31() {
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);

		// arrFloat�� ù ��° �ε��� ���� ����Ͻÿ�.
		System.out.println(arrFloat[0]);

		// arrFloat�� ������ �ε��� ���� 10.5���� �����Ͻÿ�.
		arrFloat[2] = 10.5F;
	}

	// 1. dogs�� �迭 ũ�⸦ ����Ͻÿ�.
	// 2. main()���� me32()�޼��带 ȣ���Ͻÿ�.
	// ��, �����Ͱ� �ʿ��ϸ� new Dog(), new Dog(), new Dog(), new Dog()�� ��� �̿�
	public void me32(Dog[] dogs) {
		int size = dogs.length;
		System.out.println(size);

	}

}
