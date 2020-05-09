package com.itbank.javatutorial.abstracts;

abstract class Machine {
	public abstract void turnOn();
	public abstract void turnOff();
	
}
class Car extends Machine {
	//오버라이딩
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
		 * 추상클래스 Machine ->추상메소드 turnOn,turnOff
		 * 
		 * Car클래스를 만들고,
		 * Car클래스에 turnOn,turnOff메소드 구현해보기
		 * 
		 */
	}

}
