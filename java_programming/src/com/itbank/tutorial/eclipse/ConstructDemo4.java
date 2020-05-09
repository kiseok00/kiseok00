package com.itbank.tutorial.eclipse;

class Calculator4 {
	int left, right;
	
	public Calculator4() {}
	
	public Calculator4(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("현재 합은?"+(this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class AddSubstractCalculator4 extends Calculator4{
	public AddSubstractCalculator4(int left, int right) {
		super(left,right);
		//super : 부모클래스를 의미
		//super(left,right): 부모클래스의 생성자에게 left, right값을 전달
		//부모클래스의 생성자를 자식 클래스의 생성자에서 호출해서 실행시키고 있음.
		// 자식클래스 초기화코드...
		//주의사항
		//자식클래스의 초기화코드가 super구문보다 먼저 등장해서는 안됨.
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class ConstructDemo4 {

	public static void main(String[] args) {
		

	}

}
