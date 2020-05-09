package com.itbank.tutorial.eclipse;


class Monster{
	int health;
	int level=0;
	String name,food;
	
	
	public int power() {
		return level+health;
	}
	public int change(int a, int b) {
		if(health==0 )
		{
			a+=1;
			b=b*2;	
		}
		else
		{
			a-=1;
			b=b/2;
		}
		return a&b;
	}
	public void setNum(String c,int d) {
		c=name;
		d=health;
	}
	
	
	
}

public class Demo {

	public static void main(String[] args) {
		Monster zombie = new Monster();
		zombie.setNum("zombie", 100);
		
		Monster dracula = new Monster();

	}

}

//monster 클래스 만들어보기
		//1) 각 몬스터는 체력(health),이름(name),레벨(level),주식(food) 속성을 가지고 있다.
		//2) 체력과 이름은 온스터마다 다르지만, 초기 레벨은 0으로 설정, 모든 몬스터의 주식은 동일하다.
		// 주식이 달라지면, 모든 종류의 몬스터의 주식도 달라진다.
		//3)몬스터의 이름과 체력을 세팅해주는 메소드를 생성
		//4) 몬스터의 파워(power)는 레벨+체력으로 계산된다. 파워값을 얻는 메소드를 생성하기
		//5)레벨과 체력을 변화시켜주는 메소드를 생성하기
		//  만약 게임에서 이겼다면 ->level은 1 상승, 체력 2배 상승
		//				졌다면->level은 1 감소, 체력 2배 감소
		//게임 이후 현재 레벨 및 체력을 출력해줘야함
		//6) 몬스터의 주식을 변경하는 메소드 만들기