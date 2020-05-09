package com.itbank.tutorial.eclipse;


class OverrideCalc2 extends Calculator7{
	@Override
	public int avg() {
		
		return (this.left+this.right) + super.avg();
	}
}

public class OverridingDemo4 {

	public static void main(String[] args) {
		/*
		 * Calculator7클래스 가져다 쓸 것.
		 * Calculator7클래스를 상속받는 OverrideCalc2 클래스 생성
		 * avg()메소드 오버라이딩
		 * 두 수의 평균 + 두 수의 합 리턴
		 * 
		 * 
		 */
		OverrideCalc2 c1 = new OverrideCalc2();
		c1.setOprands(10, 20);
		System.out.println(c1.avg());

	}

}
