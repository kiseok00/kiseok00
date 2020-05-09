package com.itbank.tutorial.eclipse;

class Calculator7{
	int left,right;
	public void setOprands(int left, int right) {
		this.left=left;
		this.right= right;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public int avg() {
		return(this.left+this.right)/2;
	}
	
}
class OverrideCalc extends Calculator7{
	public void dev() {
		System.out.println(this.left/this.right);
	}
	@Override
	public int avg() {
		//�θ�޼ҵ忡 ���ǵǾ� �ִ� �޼ҵ带 ȣ��
		return super.avg();
		//���� �߰� ����
		
	}
	
}

public class OverridingDemo3 {

	public static void main(String[] args) {
		/*
		 * Calculator7 Ŭ���� ����
		 * left,right ���� �ʿ�
		 * left,right ���� �ʱ�ȭ���ִ� �޼ҵ���  SetOprands �޼ҵ� �ʿ�
		 * �� ���� ��, ��� ���ϴ� �޼ҵ� �ۼ�
		 * 
		 * Calculator7Ŭ������ ��ӹ޴� OverrideCalc Ŭ���� ����
		 * ��ӹ��� �� ���� left,right ������ �������ִ� �޼ҵ� �ʿ�
		 * ��� ���ϴ� �޼ҵ� �������̵�(��, ��ձ��ϴ� ������ �ٲ��� ����)
		 * 
		 */
		
		//super Ű���� Ȱ���� �������̵�
		//super Ű���� �ؿ� ���� �߰��ϸ� �߰� ��� ���� ����
		
		//1.�޼ҵ��� ����(Signature)�� �����ؾ���
		//--> 1)�޼ҵ��� �̸� 2) �޼ҵ��� �Ű������� ����, ������Ÿ��,����
		//	  3) �޼ҵ��� ����Ÿ��
		//��� : �������̵��� �θ�Ŭ������ �������ִ� ����� �ʿ信 ���� �����ϴ� ��
		// 	   �ڽĸ޼ҵ尡 �θ�޼ҵ带 ȣ���ϱ� ���ؼ��� super Ű���带 ����Ѵ�.

	}

}
