package com.itbank.tutorial.eclipse;

class Car {
	int number;
	String name;
	
	public Car(int number,String name) {
		this.number=number;
		this.name = name;
		
	}
}

class Bus extends Car{
	int fee;
	public Bus(int number, String name, int fee) {
		super(number, name);
		this.fee=fee;
	}
}

public class ConstructorQuiz {

	public static void main(String[] args) {
		/*
		 * 실습
		 * bus클래스는 car클래스의 자식클래스
		 * car클래스의 생성자는 name(이름)을 입력받고,
		 * bus클래스의 생성자는  name(이름),number(차량번호),fee(요금)을 입력받음
		 * 부모클래스의 생성자를 이용해 name,number를 초기화한 후
		 * fee를 직접 초기화하는 bus의 생성자 만들어보기
		 * 
		 */
		
		Bus bus = new Bus(1050,"버스",3000);
		System.out.println(bus.name);
		System.out.println("버스 번호는 "+bus.number);
		System.out.println("버스 요금은 "+bus.fee);
		Car car = new Car(2020,"트럭");
		System.out.println("차 이름은 "+car.name);
		System.out.println("차 번호는 " +car.number);
		

	}

}
