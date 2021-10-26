package com.sof.main;

public class GameServer {

	public static void main(String[] args)
	{
		String name = null;
		String action = null;
		Warrior warrior = new Warrior();
		Monster monster = new Monster();
		PlayerAction pa = new PlayerAction();
		
		name = warrior.createName();
		
		// warrior의 이름으로 생성
		warrior = new Warrior(name);
		
		while(true)
		{
			action = pa.lobbyAction();
			if(action.equals("1"))
			{
				// 던전을 탐험하다.
				action = pa.Dungeon();
				if(action.equals("1"))
				{
					monster.m1();
				}
				if(action.equals("2"))
				{
					monster.m2();
				}
				if(action.equals("3"))
				{
					return;
				}
				
				//전투를 하다.
				while(true)
				{
					action = pa.bettleAction();
					if(action.equals("1"))
					{
						if(warrior.getSpeed() >= monster.getSpeed())
						{
							monster.attacked(warrior.attack());
							warrior.attacked(monster.attack());
						}else
						{
							warrior.attacked(monster.attack());
							monster.attacked(warrior.attack());
						}
						
						if(monster.getCurrentHp() <= 0)
						{
							System.out.println("몬스터를 잡았다.");
							warrior.setExp(warrior.getExp() + monster.giveExp());
							warrior.setMoney(warrior.getMoney() + monster.giveMoney());
							break;
						}
						
						if(warrior.getCurrentHp() <= 0)
						{
							System.out.println("체력이 0이 되었다.");
							warrior.setCurrentHp(warrior.getMaxHp());
							break;
						}
					}
					if(action.equals("2"))
					{
						if(warrior.getSpeed() >= monster.getSpeed())
						{
							warrior.spell();
							warrior.attacked(monster.attack());
						}else
						{
							warrior.attacked(monster.attack());
							warrior.spell();
						}
						
						if(monster.getCurrentHp() <= 0)
						{
							System.out.println("몬스터를 잡았다.");
							warrior.setExp(warrior.getExp() + monster.giveExp());
							warrior.setMoney(warrior.getMoney() + monster.giveMoney());
							break;
						}
						
						if(warrior.getCurrentHp() <= 0)
						{
							System.out.println("체력이 0이 되었다.");
							warrior.setCurrentHp(warrior.getMaxHp());
							break;
						}
					}
					if(action.equals("4"))
					{
						break;
					}
					else
						break;
				}
			}
			if(action.equals("2"))
			{
				// 상태를 확인하다.
				warrior.status();
			}
			if(action.equals("6"))
			{
				// 게임을 끝냅니다.
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
}
