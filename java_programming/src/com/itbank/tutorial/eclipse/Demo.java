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

//monster Ŭ���� ������
		//1) �� ���ʹ� ü��(health),�̸�(name),����(level),�ֽ�(food) �Ӽ��� ������ �ִ�.
		//2) ü�°� �̸��� �½��͸��� �ٸ�����, �ʱ� ������ 0���� ����, ��� ������ �ֽ��� �����ϴ�.
		// �ֽ��� �޶�����, ��� ������ ������ �ֽĵ� �޶�����.
		//3)������ �̸��� ü���� �������ִ� �޼ҵ带 ����
		//4) ������ �Ŀ�(power)�� ����+ü������ ���ȴ�. �Ŀ����� ��� �޼ҵ带 �����ϱ�
		//5)������ ü���� ��ȭ�����ִ� �޼ҵ带 �����ϱ�
		//  ���� ���ӿ��� �̰�ٸ� ->level�� 1 ���, ü�� 2�� ���
		//				���ٸ�->level�� 1 ����, ü�� 2�� ����
		//���� ���� ���� ���� �� ü���� ����������
		//6) ������ �ֽ��� �����ϴ� �޼ҵ� �����