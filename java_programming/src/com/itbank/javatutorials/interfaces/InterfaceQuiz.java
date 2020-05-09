package com.itbank.javatutorials.interfaces;

interface Meter{
	public abstract void start();
	public abstract int stop(int distance);
}

class Taxi implements Meter {
	public void start() {
		System.out.println("������ �����մϴ�.");
	}
	public int stop(int distance) {
		int fee;
		fee=distance*2;
		return fee;
	}
}

public class InterfaceQuiz {

	public static void main(String[] args) {
		/*
		 * Meter(�ý� ���ͱ�) �������̽��� start�� stop�̶�� �߻� �޼ҵ带 ������ ����
		 * start�޼ҵ�� "������ �����մϴ�"�޽��� ���
		 * stop�޼ҵ�� ����Ÿ�(distance)���� �Ű������� �޾� ���(fee)�� int������ ��ȯ
		 * 
		 * Meter�������̽��� �����ϴ� Taxi Ŭ���� �����
		 * �� ��, ����� ����Ÿ�*2�� ���
		 * 
		 */
		
		Taxi tx=new Taxi();
		tx.start();
		System.out.println(tx.stop(30));
		
		
	}

}
