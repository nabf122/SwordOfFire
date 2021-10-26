package com.sof.main;

import java.util.Scanner;

public class PlayerAction {
	
	static Scanner scan = new Scanner(System.in);
	static String str = null;
	
	/*
	 * 메인 로비 액션
	 */
	public String lobbyAction()
	{	
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("┌─────────────────────┐");
		System.out.println("│ 1. 던전을 탐험하다.     │");
		System.out.println("│ 2. 상태를 확인하다.     │");
		System.out.println("│ 3. 상점을 방문하다.     │");
		System.out.println("│ 4. 용병단 방문하다.     │");
		System.out.println("│ 5. 대장간 방문하다.     │");
		System.out.println("│ 6. 게임을 끝냅니다.     │");
		System.out.println("└─────────────────────┘");
		str = scan.nextLine();
		
		return str;
	}
	
	public String Dungeon()
	{
		System.out.println("어떤 던전을 탐험할까요?");
		System.out.println("┌─────────────────────┐");
		System.out.println("│ 1. 슬라임 평원가다.     │");
		System.out.println("│ 2. 드래곤 협곡가다.     │");
		System.out.println("│ 3. 던전을 나갑니다.     │");
		System.out.println("└─────────────────────┘");
		str = scan.nextLine();
		
		return str;
	}
	
	/*
	 * 배틀 선택 액션
	 */
	public String bettleAction()
	{
		System.out.println("어떻게 할까요?");
		System.out.println("┌─────────────────────┐");
		System.out.println("│ 1. 공격을 사용하다.     │");
		System.out.println("│ 2. 마법을 사용하다.     │");
		System.out.println("│ 3. 도망을 가다.        │");
		System.out.println("│ 4. 도망을 가다.        │");
		System.out.println("└─────────────────────┘");
		str = scan.nextLine();
		
		return str;
	}
}
