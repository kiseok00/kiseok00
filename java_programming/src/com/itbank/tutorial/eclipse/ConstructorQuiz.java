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
		 * �ǽ�
		 * busŬ������ carŬ������ �ڽ�Ŭ����
		 * carŬ������ �����ڴ� name(�̸�)�� �Է¹ް�,
		 * busŬ������ �����ڴ�  name(�̸�),number(������ȣ),fee(���)�� �Է¹���
		 * �θ�Ŭ������ �����ڸ� �̿��� name,number�� �ʱ�ȭ�� ��
		 * fee�� ���� �ʱ�ȭ�ϴ� bus�� ������ ������
		 * 
		 */
		
		Bus bus = new Bus(1050,"����",3000);
		System.out.println(bus.name);
		System.out.println("���� ��ȣ�� "+bus.number);
		System.out.println("���� ����� "+bus.fee);
		Car car = new Car(2020,"Ʈ��");
		System.out.println("�� �̸��� "+car.name);
		System.out.println("�� ��ȣ�� " +car.number);
		

	}

}
