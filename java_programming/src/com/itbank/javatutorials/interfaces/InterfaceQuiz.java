package com.itbank.javatutorials.interfaces;

interface Meter{
	public abstract void start();
	public abstract int stop(int distance);
}

class Taxi implements Meter {
	public void start() {
		System.out.println("운행을 시작합니다.");
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
		 * Meter(택시 미터기) 인터페이스는 start와 stop이라는 추상 메소드를 가지고 있음
		 * start메소드는 "운행을 시작합니다"메시지 출력
		 * stop메소드는 주행거리(distance)값을 매개변수로 받아 요금(fee)을 int형으로 반환
		 * 
		 * Meter인터페이스를 구현하는 Taxi 클래스 만들기
		 * 이 때, 요금은 주행거리*2로 계산
		 * 
		 */
		
		Taxi tx=new Taxi();
		tx.start();
		System.out.println(tx.stop(30));
		
		
	}

}
