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
		 * Calculator7Ŭ���� ������ �� ��.
		 * Calculator7Ŭ������ ��ӹ޴� OverrideCalc2 Ŭ���� ����
		 * avg()�޼ҵ� �������̵�
		 * �� ���� ��� + �� ���� �� ����
		 * 
		 * 
		 */
		OverrideCalc2 c1 = new OverrideCalc2();
		c1.setOprands(10, 20);
		System.out.println(c1.avg());

	}

}
