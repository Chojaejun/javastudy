package com.naver;

public class Sum { //++num �� 1 ����
	
	private int num;
	
	private int tes;
	
	Object key1 = new Object();
	Object key2 = new Object();
	
	public Sum() {
		// TODO Auto-generated constructor stub
	}

	public Sum(int num) {
		super();
		this.num = num;
	}
	public  void subTes(int n) {
		synchronized (key1) { //�ڹ��谡 tes�ϱ� key = key1
			tes -= n; // tes = tes - n 
		} 
	}
	
	public  void addNum(int n) { //synchronized ����ȭ ��Ű��(����ȭ�޼���) /�Ӱ迵��,critical section 
		synchronized (this) { //�ڹ��谡 num�̴ϱ� key �� this
			num += n; //num = num + n
		}
	}
	
	public void subNum(int n) {
		synchronized (this) { //�ڹ��谡 ���� num�� �����ϱ� key �� num�� Ű�� ���� this
			num -= n;
		}
		
	}
	
	public void addTes(int n) {
		synchronized (key1) { //�ڹ��谡 ���� tes�� �����ϱ� key �� tes�� Ű�� ���� key1
			tes += n;
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getTes() {
		return tes;
	}

	public void setTes(int tes) {
		this.tes = tes;
	}
	
	
	
	

}
