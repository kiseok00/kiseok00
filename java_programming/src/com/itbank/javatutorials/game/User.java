package com.itbank.javatutorials.game;

public class User {
	
	public static void play(Monster mon) {
		mon.doEvolve();
	}
	
	public static void fight(Monster mon,boolean isWin) {
		mon.changeHealth(isWin);
		mon.getHealth();
	}

	public static void main(String[] args) {
		Monster zombie = new Zombie(150);
		Monster dracula = new Dracula(200);
		
		fight(zombie,true);
		fight(dracula,false);
		
		play(zombie);
		play(dracula);
		
		
		//zombie.chase(); 사용 불가  Monster zombie = new Zombie(150);으로 코드를 작성했기 때문
		//dracula.hunt(); 사용 불가  Monster dracula = new Dracula(200);으로 코드를 작성했기 때문
		
		Zombie z = new Zombie(150);
		Dracula d = new Dracula(200);
		z.chase();
		d.hunt();

	}

}




//User:	게임을 실행하는 클래스
//* 			몬스터의 공통적 기능만 수행
//* 			play 메소드(void) 진화 메소드 동작
//* 			fight 메소드(void) 몬스터의 체력 바뀌는 메소드 동작, health 조회하는 메소드 동작