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
		
		
		//zombie.chase(); ��� �Ұ�  Monster zombie = new Zombie(150);���� �ڵ带 �ۼ��߱� ����
		//dracula.hunt(); ��� �Ұ�  Monster dracula = new Dracula(200);���� �ڵ带 �ۼ��߱� ����
		
		Zombie z = new Zombie(150);
		Dracula d = new Dracula(200);
		z.chase();
		d.hunt();

	}

}




//User:	������ �����ϴ� Ŭ����
//* 			������ ������ ��ɸ� ����
//* 			play �޼ҵ�(void) ��ȭ �޼ҵ� ����
//* 			fight �޼ҵ�(void) ������ ü�� �ٲ�� �޼ҵ� ����, health ��ȸ�ϴ� �޼ҵ� ����