package kr.co.ezen;

import com.naver.AccountDAO;

public class MainEx {
	public static void main(String[] args) {
		
		AccountDAO dao = new AccountDAO();
		
		dao.order("kim", "kim", "kim");
	}

}
