package com.naver;

public class Test2 {

	public void me1() {
		// 자료형[] 변수명 = new 자료형[배열의 크기];
		int[] arrInt = new int[4];
		// length는 배열의 속성으로 반복문을 틀릴 때, 직접적인 배열의 크기 대신 사용한다.
		System.out.println(arrInt.length);

	}

	// 배열의 크기가 100인 StringBuffer형의 1차원 배열 arrSb를 생성하시고
	// arrSb의 배열 크기를 출력하시오.
	public void me11() {
		StringBuffer[] arrSb = new StringBuffer[100];
		System.out.println(arrSb.length);

	}

	// 1. Test clss의 me12()에서 파라미터로 넘어온 배열 데이터의 크기를 출력하시오.
	// 2. main()에 가서 me12()를 호출하시오.
	public void me12(Dog[] dogs) {
		System.out.println(dogs.length);

	}

	// 1. data.split("#")의 반환값을 arrData로 받고
	// 2. arrData의 크기를 출력하시오.
	public void me13() {
		String data = "teacheryo#1#seoul#226#-1";
		// data.split("#"); -> 반환 값을 arrData로
		String[] arrData = data.split("#");

		System.out.println(arrData.length);
	}

	public void me2() {
		// 자료형[] 배열명 = {자료형에 맞는 값1, 값2, 값3...};
		int[] arrInt = { 1, 4, 6 };

		// arrInt의 배열 크기를 출력하시오.
		System.out.println(arrInt.length);
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
	}

	// 1. arrStr의 크기를 출력하시오.
	// 2. main()에서 me22() 호출하시오.
	public void me22(String[] arrStr) {
		System.out.println(arrStr.length);
	}

	public void me3() {
		int[] arrInt = new int[] { 1, 3, 5, 7 };
		System.out.println(arrInt.length);
	}

	// 1. 배열 생성 세 번째 방법으로 arrFloat 객체를 만듦.
	// 2. 배열에 들어가는 값은 3.14, 4.2, 9.8 입니다.
	// 3. arrFloat의 배열 크기를 출력하시오.
	public void me31() {
		float[] arrFloat = new float[] { 3.14f, 4.2f, 9.8f };
		System.out.println(arrFloat.length);
	}

	// 1. dogs의 배열 크기를 출력하시오.
	// 2. main()에서 me32()메서드를 호출하시오.
	// 단, 데이터가 필요하면 new Dog(), new Dog(), new Dog(), new Dog()를 모두 이용
	public void me32(Dog[] dogs) {
		int size = dogs.length;
		System.out.println(size);

	}

}
