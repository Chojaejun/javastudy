package com.naver;

import java.util.Scanner;

public class Endcommand implements Command {

	@Override
	public void execute(Scanner sc) {
		sc.close();
		System.exit(0);

	}

}
