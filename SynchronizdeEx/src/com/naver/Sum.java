package com.naver;

public class Sum { //++num 은 1 증가
	
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
		synchronized (key1) { //자물쇠가 tes니까 key = key1
			tes -= n; // tes = tes - n 
		} 
	}
	
	public  void addNum(int n) { //synchronized 동기화 시키기(동기화메서드) /임계영역,critical section 
		synchronized (this) { //자물쇠가 num이니까 key 는 this
			num += n; //num = num + n
		}
	}
	
	public void subNum(int n) {
		synchronized (this) { //자물쇠가 위의 num과 같으니까 key 는 num의 키와 같은 this
			num -= n;
		}
		
	}
	
	public void addTes(int n) {
		synchronized (key1) { //자물쇠가 위의 tes와 같으니까 key 는 tes의 키와 같은 key1
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
