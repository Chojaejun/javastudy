package com.naver;

import java.util.Random;

public class Test {
	
	public void randomFood() {
		Random rnd = new Random();
		for (int i = 0; i < 1; i++) {
			int num = rnd.nextInt(9)+1;
			switch (num) {
			case 1:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â ¸¾½ºÅÍÄ¡");
				break;
			case 2:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â ÃÊ¹ä");
				break;
			case 3:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â Â¥±ÛÀÌ");
				break;
			case 4:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â ±èÄ¡Âî°³");
				break;
			case 5:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â »ÀÇØÀå±¹");
				break;
			case 6:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â µÅÁö±¹¹ä");
				break;
			case 7:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â Áß±¹Áı");
				break;
			case 8:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â ÆíÀÇÁ¡");
				break;
			case 9:
				System.out.println("¿À´ÃÀÇ ¸Ş´º´Â ¶ó¸éÇĞ±³");
				break;

			
			}
		}
	}

}
