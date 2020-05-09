package com.itbank.tutorial.eclipse;

//오버로딩과 상속

public class OverloadingDemo3 extends OverloadingDemo2 {
	
	//오버로딩 메소드
	public void A(String arg1,String arg2) {
		System.out.println("sub class: void A(String arg1,String arg2)");
	}
	
	//부모클래스에 있는 A()메소드 재정의함
	//오버라이딩 메소드
	@Override
	public void A() {
		System.out.println("subclass: void A()");
	}
	

	public static void main(String[] args) {
		OverloadingDemo3 o1 = new OverloadingDemo3();
		o1.A();
		o1.A("hi","hi2");

	}

}


//오버로딩과 오버라이딩
//오버로딩은 같은 메소드에 매개변수가 달라질때
//오버라이딩은 같은 메소드에 매개변수도 같지만 로직은 다르게 할 때