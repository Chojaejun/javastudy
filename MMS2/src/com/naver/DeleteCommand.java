package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("회원 삭제를 시작합니다.");
		System.out.println("아이디를 입력하세요.");
		String mid = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(mid, null, null, null);
		
		MemberDAO dao = new MemberDAO();
		
		dao.delete(dto);

	}

	@Override
	public String toString() {
		return "삭제";
	}
	
	

}
