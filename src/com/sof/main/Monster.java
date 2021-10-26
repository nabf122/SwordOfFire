package com.sof.main;

public class Monster extends Character {

	/*
	 * 몬스터 생성
	 */
	public void m1()
	{
		super.setName("m1");
		super.setLevel(1);
		super.setMaxHp(20);
		super.setCurrentHp(20);
		super.setSpeed(1);
		super.setAttackDamage(3);
		super.setDefense(1);
	}
	
	public void m2()
	{
		super.setName("m2");
		super.setLevel(3);
		super.setMaxHp(60);
		super.setCurrentHp(60);
		super.setSpeed(2);
		super.setAttackDamage(9);
		super.setDefense(3);
	}
	
	/*
	 * 공격하다.
	 */
	public int attack()
	{
		
		return 0;
	}
	
	/*
	 * 공격을 받아 데미지를 입다.
	 */
	public void attacked(int damage)
	{
		
	}
	
	/*
	 * 경험치를 레벨 따라 차등하여 리턴한다.
	 */
	public int giveExp()
	{
		if(super.getLevel() == 1)
		{
			return 3;
		}
		if(super.getLevel() == 3)
		{
			return 10;
		}
		else
			return 0;
	}
	
	/*
	 * 돈을 레벨에 따라 차등하여 리턴한다.
	 */
	public int giveMoney()
	{
		if(super.getLevel() == 1)
		{
			return 10;
		}
		if(super.getLevel() == 3)
		{
			return 40;
		}
		else
			return 0;
	}
}
