package kr.co.ezen;

import java.lang.reflect.Constructor;

import com.naver.Command;

public class MainEx2 {

	public static void main(String[] args) { //�Ϲ������� ���� �޼���� ������Ʈ�� �ϳ��ε� �׽�Ʈ�ҷ��� �ϳ� �� ����
		//full package name: ��Ű���� Ŭ������ ���� ����ϴ� ��.
		//com.name.InsertCommand
		try {
			Class<?> testClass = Class.forName("com.naver.InsertCommand");  //<�� �ȿ� ���� ���� ���� ����̹��� Ǯ��Ű������ ����.
			Constructor<?> cons = testClass.getConstructor(); // <-- �̰��� �Ķ���͸� �ְ� ������ insert.class  
			Command com = (Command)cons.newInstance(); //<-- Instance �� ��ü
			//��������� Commad com = new InsertCommad(); �̴�.
			
			com.execute(null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
