package com.itbank.tutorial.eclipse;

//�������̵� ���� �������(����)
class Calculator6 {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println("���� ����?"+this.left + this.right);
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
		//�ڽ�Ŭ������ avg�޼ҵ��� ����Ÿ���� �θ�Ŭ������ avg�޼ҵ��� ����Ÿ�԰� ȣȯ���� �ʴ´�.
		//���� �������̵��� �� ��, ���� Ÿ���� �޶����� ���� �Ұ�����.
		
		
		//�������̵��� ���� ����
		//1.�޼ҵ��� �̸�
		//2. �޼ҵ� �Ű������� ������ ������ Ÿ��, �׸��� ����
		//3. �޼ҵ��� ���� Ÿ��
		// ��, �޼ҵ��� ������ �����ؾ� ��.
		

	}

}