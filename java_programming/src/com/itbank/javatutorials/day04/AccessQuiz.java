package com.itbank.javatutorials.day04;


class Car{
	private int number;
	private String name;
	
	// ���1: ���� �ʱ�ȭ�� ������ ��� -> ������
	public Car(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//���2: getter & setter 
	public int getNum() {
		return number;
	}
	public void setNum(int number) {
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
	
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}
	private void stop() {
		System.out.println("���� ����ϴ�.");
	}
	public void warning() {
		stop();
	}
}




public class AccessQuiz {

	public static void main(String[] args) {
		Car c = new Car("BUS",10);
		c.warning();

	}

}
