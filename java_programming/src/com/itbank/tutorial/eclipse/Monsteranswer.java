package com.itbank.tutorial.eclipse;
//monster Ŭ���� ������
class Monster11{
	int health;
	String name;
	int level=0;
	static String food ="human";
	//1) �� ���ʹ� ü��(health),�̸�(name),����(level),�ֽ�(food) �Ӽ��� ������ �ִ�.
			//2) ü�°� �̸��� �½��͸��� �ٸ�����, �ʱ� ������ 0���� ����, ��� ������ �ֽ��� �����ϴ�.
			// �ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶�����.
	
	public void setInfo(String name, int health) {
		this.name=name;
		this.health=health;
	}
	//3)������ �̸��� ü���� �������ִ� �޼ҵ带 ����
	
	public int getPower() {
		int power =level +health;
		return power;
	}
	//4) ������ �Ŀ�(power)�� ����+ü������ ���ȴ�. �Ŀ����� ��� �޼ҵ带 �����ϱ�
	
	public void changelevel(boolean iswin) {
		if(iswin) {
			level++;
			health*=2;
		}
		else {
			level--;
			health/=2;
		}
		System.out.println("����ü��:"+health+"����:"+level);
	}
	//5)������ ü���� ��ȭ�����ִ� �޼ҵ带 �����ϱ�
			//  ���� ���ӿ��� �̰�ٸ� ->level�� 1 ���, ü�� 2�� ���
			//				���ٸ�->level�� 1 ����, ü�� 2�� ����
			//���� ���� ���� ���� �� ü���� ����������
	public static void changefood(String newfood) {
		
		food=newfood;
		System.out.println("����� ������ �ֽ���:"+food+"�Դϴ�.");
	}
	//6) ������ �ֽ��� �����ϴ� �޼ҵ� �����
		
}




public class Monsteranswer {
	public static void main(String[] args) {
		Monster zombie =new Monster();
		zombie.setInfo("����",100);
		System.out.println(zombie.name);
		System.out.println(zombie.health);
		boolean zombiewin=true;
		zombie.changelevel(zombiewin);
		System.out.println(zombie.getPower());
		
		Monster dracula = new Monster();
		dracula.setInfo("���ŧ��", 150);
		System.out.println(dracula.name);
		System.out.println(dracula.health);
		boolean draculawin =false;
		dracula.changelevel(draculawin);
		System.out.println(dracula.getPower());
		
		System.out.println(Monster.food);
		Monster.changefood("vegetable");
		System.out.println(Monster.food);
		
		
		//�� ��ü�� �ֽ��� �� ���� ����� ���� �� �� �ִ�.
		System.out.println(zombie.food);
		System.out.println(dracula.food);
		
		//������:������ 0���� �۾��� ��� or ü���� 0���� �۾��� ��쿡 ���� ó��
		// 		���Ͱ� ���� �Ӽ� or �ɷ�ġ �߰� or �޼ҵ� �߰� --> ��� �߰�
		
		
	}

}



		
	
		
		