package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		// TODO Auto-generated method stub
		
		System.out.println("삭제할 id를 선택해 주세요.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		if(b) {
			System.out.println("삭제 성공");
		}else {
			
		}
		
	}

	
	

}
