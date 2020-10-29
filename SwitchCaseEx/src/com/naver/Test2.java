package com.naver;

public class Test2 {
	public void day	(int day) {
		switch (day) {
		case 4:
		case 11:
		case 18:
		case 25:
			System.out.println("일요일");
			break;
		case 5:
		case 12:
		case 19:
		case 26:
			System.out.println("월요일");
			break;
		case 6:
		case 13:
		case 20:
		case 27:
			System.out.println("화요일");
			break;
		case 7:
		case 14:
		case 21:
		case 28:
			System.out.println("수요일");
			break;
		case 1:
		case 8:
		case 15:
		case 22:
		case 29:
			System.out.println("목요일");
			break;
		case 2:
		case 9:
		case 16:
		case 23:
		case 30:
			System.out.println("금요일");
		default:
			System.out.println("토요일");
			break;
		}
	}
}
