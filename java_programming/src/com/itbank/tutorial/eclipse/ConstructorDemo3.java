package com.itbank.tutorial.eclipse;

class Calculator3 {
	int left, right;
	
	public Calculator3() {}
	
	public Calculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
//	public void setOprands(int left, int right) {
//		this.left = left;
//		this.right = right;
//	}
	
	public void sum() {
		System.out.println("현재 합은?"+(this.left + this.right));
	}
	
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}

class AddSubstractCalculator3 extends Calculator3{
	public AddSubstractCalculator3(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}


public class ConstructorDemo3 {

	public static void main(String[] args) {
		/*
		 * 생성자 이해해보기!
		 * 1.부모클래스에 생성자가 있는데 자식클래스에 생성자가 없는 경우
		 * 2.부모클래스에 생성자가 없고 자식클래스에 생성자가 없는 경우
		 * 3. 부모클래스, 자식클래스 각각에 생성자가 있는 경우
		 * 
		 * 에러가 발생한다면-> 에러 해결 방법 
		 * 제대로 실행이 된다면, 그 이유가 무엇인지
		 */
		
		
		AddSubstractCalculator3 c1 = new AddSubstractCalculator3();
	}

}
