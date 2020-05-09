package com.itbank.javatutorial.abstracts;

abstract class Machine {
	public abstract void turnOn();
	public abstract void turnOff();
	
}
class Car extends Machine {
	//�������̵�
	public void turnOn() {
		System.out.println("turnOn");
	}
	public void turnOff() {
		System.out.println("turnOff");
	}
	
}




public class AbstractQuiz {

	public static void main(String[] args) {
		Car s = new Car();
		s.turnOn();
		s.turnOff();
		/*
		 * �߻�Ŭ���� Machine ->�߻�޼ҵ� turnOn,turnOff
		 * 
		 * CarŬ������ �����,
		 * CarŬ������ turnOn,turnOff�޼ҵ� �����غ���
		 * 
		 */
	}

}
