package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("������ id�� ������ �ּ���.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		if(b) {
			System.out.println("���� ����");
		}else {
			
		}
		
	}

	
	

}
