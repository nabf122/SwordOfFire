package com.sof.main;

import java.util.Scanner;

public class Warrior extends Character {

	/*
	 * 캐릭터 추가 스텟
	 */
	private int criticalHit;
	private int exp;
	private int money;
	private String job;
	static Scanner scan = new Scanner(System.in);
	
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
	
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public Warrior()
	{
		
	}
	
	public Warrior(String name)
	{
		super.setName(name);
		super.setLevel(1);
		super.setMaxHp(40);
		super.setCurrentHp(40);
		super.setSpeed(1);
		super.setAttackDamage(5);
		super.setDefense(2);
		this.criticalHit = 5;
		this.exp = 0;
		this.money = 0;
		this.job = "Warrior";
	}
	
	/*
	 * 캐릭터 이름 생성하기
	 */
	public String createName()
	{
		@SuppressWarnings("unused")
		String str1, str2;
		
		while(true)
		{
			System.out.print("이름을 입력해주세요 :");
			str1 = scan.nextLine();
		
			System.out.print(str1 + "으로 시작할까요? 'y' or 'n' :");
			str2 = scan.nextLine();
		
			if(str2.equals("y"))
			{
				System.out.println("캐릭터 생성 완료..!"
						+ "\n");
				System.out.println("게임을 시작합니다.");
				return str1;
			}
		}
	}
	
	/*
	 * 캐릭터 상태 보여주기
	 */
	public void status()
	{
		System.out.println("┌─────────────────────┐");
		System.out.println("│    캐릭터 현황         │");
		System.out.println("└─────────────────────┘");
		System.out.println("[[ " + super.getName() + " ]]");
		System.out.println("┌─────────────────────────┐");
		System.out.println("│직업		: "+ getJob());
		System.out.println("│레벨		: "+ super.getLevel());
		System.out.println("│경험치		: "+ getExp());
		System.out.println("│HP 		: "+ super.getCurrentHp() + " / " + super.getMaxHp());
		System.out.println("│스피드 		: "+ super.getSpeed());
		System.out.println("│공격력 		: "+ super.getAttackDamage());
		System.out.println("│방어력 		: "+ super.getDefense());
		System.out.println("│치명타 확률 	: "+ getCriticalHit() +"%");
		System.out.println("│소지금액 		: "+ getMoney());
		System.out.println("└─────────────────────────┘");
		System.out.println("\n");
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
	 * 마법을 사용하다.
	 */
	public String spell()
	{
		return "spell";
	}
	
	/*
	 * 레벨업에 필요한 경험치를 체크하다.
	 */
	public int levelUpCheck()
	{
		
		return 0;
	}
	
	/*
	 * 레벨업 시 스텟 상승을 시켜준다.
	 */
	public void levelUpStatUp(int level, int levelupCheck)
	{
		if(level >= 2 && level <= 5 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 5);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 1);
		}else if(level >= 6 && level <= 10 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 5);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 2);			
		}else if(level >= 11 && level <= 15 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 7);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 2);			
		}else if(level >= 16 && level <= 20 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 7);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 3);
		}else if(level >= 21 && level <= 25 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 10);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 3);
		}else if(level >= 26 && level <= 30 && levelupCheck == 1)
		{
			super.setMaxHp(getMaxHp() + 10);
			super.setCurrentHp(getMaxHp());
			super.setAttackDamage(getAttackDamage() + 4);
			super.setDefense(getDefense() + 1);
		}
	}
}
