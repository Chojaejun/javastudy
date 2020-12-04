/*     문 제
	        TV
	 << com.naver >>
	 - vol : int
	 - ch : int
	 - power : boolean
	 
	 << constructors >>
	 << getters/setters >>
	 + volUp():void
	 + volDoun():void
	 + chUp():void
	 + chDown(): void
	 + powerOn():void
	 + powerOff():void
	 
	 0 <= ch <= 100
	 ch은 순환함
	 
	 0 <= vol <= 50
	 vol은 0보다 작을 수 없으며,
	 50보다 클 수 없음.
	 */

package com.naver;

public class TV {
	private int vol;
	private int ch;
	private boolean power;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(int vol, int ch, boolean power) {
		super();
		this.vol = vol;
		this.ch = ch;
		this.power = power;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void volUp() {
		if(!power) {  //전원이 꺼져 있으면 좀 전의 코드를 실행 안한다.
			return;
		}
		++vol;
		if(vol > 100) {
			vol = 100;
		}
	}
	
	public void volDouwn() {
		
		if(power) {  //전원이 켜져 있으면 좀 전의 코드를 실행한다.
		--vol;
		if(vol < 0) {
			vol = 0;
		   }
		}
	}
	
	public void chUp() {
		
		if(!power){
			return;
		}
		++ch;
		if(ch > 999) {
			ch = 0;
		}
		
	}
	
	public void chDown() {
		if(!power) {
			return;
		}
		--ch;
		if(ch < 0) {
			ch = 999;
		}
		
	}
	
	public void powerOn() {
		power = true;
	}
	
	public void powerOff() {
		power = false;
	}

}
