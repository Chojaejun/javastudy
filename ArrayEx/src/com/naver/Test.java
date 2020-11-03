package com.naver;

public class Test {

	public void me1() {
		// 자료형[] 변수명 = new 자료형[배열의 크기];
		int[] arrInt = new int[4];

		// arrInt에 0,1,2,3을 입력하시오.
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}

		// arrInt에 0,2,4,6
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2;
		}

		// arrInt에 1,3,5,7
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i * 2 + 1;
		}

		// length는 배열의 속성으로 반복문을 틀릴 때, 직접적인 배열의 크기 대신 사용한다.
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

		// arrInt가 갖고 있는 모든 요솟값을 for문을 이용해서 전부 출력하세요.
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);

		}

	}

	public void me0() {
		// 배열을 사용하는 이유
		// 1. 반복문 사용을 위해서
		// 2. 여러개의 데이터를 반환하기 위해서

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

	// 배열의 크기가 100인 StringBuffer형의 1차원 배열 arrSb를 생성하시고
	// arrSb의 배열 크기를 출력하시오.
	public void me11() {
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println("::::::::::::::");

		// arrSb의 51번째 요솟값을 출력하세요.
		System.out.println(arrSb[50]);

		StringBuffer sb1 = new StringBuffer();
		// arrSb의 인덱스가 1번인 곳에 sb1 객체를 대입하라
		arrSb[1] = sb1;

		// arrSb가 갖고 있는 모든 요솟값을 출력을 함.
		// 단, 출력 순서는 인덱스가 큰 값부터 출력합니다.
		for (int i = arrSb.length - 1; i >= 0; i--) {
			System.out.println(arrSb[i]);

		}

	}

	// 1. Test clss의 me12()에서 파라미터로 넘어온 배열 데이터의 크기를 출력하시오.
	// 2. main()에 가서 me12()를 호출하시오.
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);
		// dogs의 가장 큰 인덱스 요솟값을 null로 설정하시오.

		dogs[dogs.length - 1] = null;

		// dogs 배열에 있는 모든 dog 객체를 출력하시오.
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i]);
		}

		// dogs 배열에 있는 모든 dog 객체의 이름을 출력하시오.
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];

			if (dog != null) {
				String name = dog.getName();
				System.out.println(name);
			}

			// System.out.println(dogs[i].getName());
		}

	}

	// 1. data.split("#")의 반환값을 arrData로 받고
	// 2. arrData의 크기를 출력하시오.
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		// data.split("#"); -> 반환 값을 arrData로
		String[] arrData = data.split("#");

		System.out.println(arrData.length);

		// arrData의 가장 큰 인덱스의 요솟값을 100으로 설정하시오.
		arrData[arrData.length - 1] = "100";

		// arrData의 가장 작은 인덱스의 요솟값을 "ezen"으로 설청하시오.
		arrData[0] = "ezen";

		// 1. arrData의 모든 요솟값을 출력하시오.
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i]);
		}

		// 2. arrData의 모든 요솟값의 첫 글자를 출력하시오.
		for (int i = 0; i < arrData.length; i++) {
			System.out.println(arrData[i].charAt(0));
		}

	}

	public void me2() {
		// 자료형[] 배열명 = {자료형에 맞는 값1, 값2, 값3...};
		int[] arrInt = { 1, 4, 6 };

		// arrInt의 배열 크기를 출력하시오.
		System.out.println(arrInt.length);

		// arrInt 배열의 2번째 요솟값을 출력하시오.
		System.out.println(arrInt[1]);

		// arrInt 배열의 인데스가 1인 요솟값을 333으로 수정하여라.
		arrInt[1] = 333;

		// 1.arrInt가 가지고 있는 모든 요솟값 출력하기
		for (int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		// 2. arrInt가 가지고 있는 모든 요솟갑 출력하기 단, 인덱스가 1인 요솟값은 출력 금지.
		for (int i = 0; i < arrInt.length; i++) {
			if (i == 1) {
				continue;
			}
			System.out.println(arrInt[i]);
		}

		// 3. arrInt가 가지고 있는 모든 요솟값 출력하기 단, 요솟값이 6이면 출력 금지.
		for (int i = 0; i < arrInt.length; i++) {
			int num = arrInt[i];
			if (num == 6) {
				continue;
			}
			System.out.println(num);
		}
	}

	// 1. 자료형이 Dog인 1차원 배열 arrDog를 배열생성 두 번째 방법으로 생성하시오.
	// 단, 크기는 2로 하시오.
	// 2. arrDog의 배열 크기를 출력하시오.
	public void me21() {
		Dog[] arrDog = { new Dog(), new Dog() };
		System.out.println(arrDog.length);

		// Dog a = new Dog();
		// Dog b = new Dog();
		// Dog[] arrDog = {a,b};

		// arrDog의 가장 큰 인덱스의 요솟값을 null로 수정하시오
		arrDog[arrDog.length - 1] = null;

		// 1. arrDog의 모든 요솟값을 출력하시오
		for (int i = 0; i < arrDog.length; i++) {
			System.out.println(arrDog[i]);
		}

		// 2. arrDog의 인덱스가 1인 요솟값의 name을 출력하시오.
		// 단, 해당 요솟값이 null이 아닌 경우에만
		Dog dog = arrDog[1];

		if (arrDog != null) {
			System.out.println(dog.getName());
		}

	}

	// 1. arrStr의 크기를 출력하시오.
	// 2. main()에서 me22() 호출하시오.
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);

		// arrStr의 index가 1인 곳의 값을 "12"로 변경하시오.
		arrStr[1] = "12";

		// arrStr의 index가 1인 곳의 값을 출력하시오.
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

		// arrInt의 인덱스 값이 2인 값을 출력하시오.
		System.out.println(arrInt[2]);
		// arrInt의 두 번째 인덱스 값을 100으로 변경하시오.
		arrInt[1] = 100;
	}

	// 1. 배열 생성 세 번째 방법으로 arrFloat 객체를 만듦.
	// 2. 배열에 들어가는 값은 3.14, 4.2, 9.8 입니다.
	// 3. arrFloat의 배열 크기를 출력하시오.
	public void me31() {
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);

		// arrFloat의 첫 번째 인덱스 값을 출력하시오.
		System.out.println(arrFloat[0]);

		// arrFloat의 마지막 인덱스 값을 10.5으로 변경하시오.
		arrFloat[2] = 10.5F;
	}

	// 1. dogs의 배열 크기를 출력하시오.
	// 2. main()에서 me32()메서드를 호출하시오.
	// 단, 데이터가 필요하면 new Dog(), new Dog(), new Dog(), new Dog()를 모두 이용
	public void me32(Dog[] dogs) {
		int size = dogs.length;
		System.out.println(size);

	}

}
