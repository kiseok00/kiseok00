package com.itbank.tutorial.eclipse;
//monster 클래스 만들어보기
class Monster11{
	int health;
	String name;
	int level=0;
	static String food ="human";
	//1) 각 몬스터는 체력(health),이름(name),레벨(level),주식(food) 속성을 가지고 있다.
			//2) 체력과 이름은 온스터마다 다르지만, 초기 레벨은 0으로 설정, 모든 몬스터의 주식은 동일하다.
			// 주식이 달라지면, 모든 종류의 몬스터의 주식도 달라진다.
	
	public void setInfo(String name, int health) {
		this.name=name;
		this.health=health;
	}
	//3)몬스터의 이름과 체력을 세팅해주는 메소드를 생성
	
	public int getPower() {
		int power =level +health;
		return power;
	}
	//4) 몬스터의 파워(power)는 레벨+체력으로 계산된다. 파워값을 얻는 메소드를 생성하기
	
	public void changelevel(boolean iswin) {
		if(iswin) {
			level++;
			health*=2;
		}
		else {
			level--;
			health/=2;
		}
		System.out.println("현재체력:"+health+"레벨:"+level);
	}
	//5)레벨과 체력을 변화시켜주는 메소드를 생성하기
			//  만약 게임에서 이겼다면 ->level은 1 상승, 체력 2배 상승
			//				졌다면->level은 1 감소, 체력 2배 감소
			//게임 이후 현재 레벨 및 체력을 출력해줘야함
	public static void changefood(String newfood) {
		
		food=newfood;
		System.out.println("변경된 몬스터의 주식은:"+food+"입니다.");
	}
	//6) 몬스터의 주식을 변경하는 메소드 만들기
		
}




public class Monsteranswer {
	public static void main(String[] args) {
		Monster zombie =new Monster();
		zombie.setInfo("좀비",100);
		System.out.println(zombie.name);
		System.out.println(zombie.health);
		boolean zombiewin=true;
		zombie.changelevel(zombiewin);
		System.out.println(zombie.getPower());
		
		Monster dracula = new Monster();
		dracula.setInfo("드라큘라", 150);
		System.out.println(dracula.name);
		System.out.println(dracula.health);
		boolean draculawin =false;
		dracula.changelevel(draculawin);
		System.out.println(dracula.getPower());
		
		System.out.println(Monster.food);
		Monster.changefood("vegetable");
		System.out.println(Monster.food);
		
		
		//두 객체의 주식이 한 번에 변경된 것을 알 수 있다.
		System.out.println(zombie.food);
		System.out.println(dracula.food);
		
		//개선점:레벨이 0보다 작아질 경우 or 체력이 0보다 작아질 경우에 대한 처리
		// 		몬스터가 가진 속성 or 능력치 추가 or 메소드 추가 --> 기능 추가
		
		
	}

}



		
	
		
		