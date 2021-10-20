package com.sof.main;

import java.util.Scanner;

public class PlayerAction {
	
	static Scanner scan = new Scanner(System.in);
	
	/*
	 * 메인 로비 액션
	 */
	public String selectAction()
	{
		@SuppressWarnings("unused")
		String str1 = null;
		
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("┌─────────────────────┐");
		System.out.println("│ 1. 던전을 탐험하다.     │");
		System.out.println("│ 2. 상태를 확인하다.     │");
		System.out.println("│ 3. 상점을 방문하다.     │");
		System.out.println("│ 4. 용병단 방문하다.     │");
		System.out.println("│ 5. 대장간 방문하다.     │");
		System.out.println("│ 6. 게임을 끝냅니다.     │");
		System.out.println("└─────────────────────┘");
		str1 = scan.nextLine();
		
		return str1;
	}
}
