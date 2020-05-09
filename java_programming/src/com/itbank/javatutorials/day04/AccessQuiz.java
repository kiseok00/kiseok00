package com.itbank.javatutorials.day04;


class Car{
	private int number;
	private String name;
	
	// 방법1: 변수 초기화를 강제한 경우 -> 생성자
	public Car(String name, int number) {
		this.name=name;
		this.number=number;
	}
	
	//방법2: getter & setter 
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
		System.out.println("차가 달립니다.");
	}
	private void stop() {
		System.out.println("차가 멈춥니다.");
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
