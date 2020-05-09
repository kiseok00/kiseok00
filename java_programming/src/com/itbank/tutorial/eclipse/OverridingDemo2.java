package com.itbank.tutorial.eclipse;

//오버라이딩 위한 제약사항(조건)
class Calculator6 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("현재 합은?"+this.left + this.right);
	}
	
	public int avg() {
		return ((this.left + this.right)/2);
	}
}

class SubstractCalc extends Calculator6{
	@Override 
	public int avg() {
		return((this.left+this.right)/4);
	}
	public void substract() {
		System.out.println(this.left-this.right);
	}
}

public class OverridingDemo2 {

	public static void main(String[] args) {
		SubstractCalc c = new SubstractCalc();
		c.setOprands(10, 20);
		c.sum();
		c.avg();
		
		
		//The return type is incompatible with Calculator6.avg()
		//자식클래스의 avg메소드의 리턴타입이 부모클래스의 avg메소드의 리턴타입과 호환되지 않는다.
		//따라서 오버라이딩을 할 때, 리턴 타입이 달라지는 것은 불가능함.
		
		
		//오버라이딩의 충족 조건
		//1.메소드의 이름
		//2. 메소드 매개변수의 개수와 데이터 타입, 그리고 순서
		//3. 메소드의 리턴 타입
		// 즉, 메소드의 서명이 동일해야 함.
		

	}

}
