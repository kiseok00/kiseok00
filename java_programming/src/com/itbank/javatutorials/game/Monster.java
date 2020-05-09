package com.itbank.javatutorials.game;

interface Monster {
	public void getHealth();
	public void doEvolve();
	public int changeHealth(boolean isWin);
	
	
	/*
	 * Monster: health 값 조회해 출력하는 함수(void) 
	 * evolve(진화)시키는 함수(void) 
	 * 게임 승패여부(boolean)에 따라 health 바뀌는 함수(int)
	 */

}
