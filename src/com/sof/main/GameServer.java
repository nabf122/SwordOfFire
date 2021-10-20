package com.sof.main;

public class GameServer {

	public static void main(String[] args)
	{
		String name = null;
		String action = null;
		Warrior warrior = new Warrior();
		PlayerAction pa = new PlayerAction();
		
		name = warrior.createName();
		
		// warrior의 이름으로 생성
		warrior = new Warrior(name);
		
		while(true)
		{
			action = pa.selectAction();
			if(action.equals("2"))
			{
				warrior.status();
			}
			if(action.equals("6"))
			{
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}
		
	}
}
