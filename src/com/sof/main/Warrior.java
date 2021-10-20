package com.sof.main;

public class Warrior extends Character {

	/*
	 * 캐릭터 추가 스텟
	 */
	private int criticalHit;
	private int exp;
	private int money;
	
	public int getCriticalHit() {
		return criticalHit;
	}
	public void setCriticalHit(int criticalHit) {
		this.criticalHit = criticalHit;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
