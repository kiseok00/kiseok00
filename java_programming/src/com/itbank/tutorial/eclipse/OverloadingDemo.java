package com.itbank.tutorial.eclipse;

//Overloading(�����ε�)
//�Ȱ��� ���� ���, �Ȱ��� ������ ������ ������, �Ű������� �޶����� ����
//�ٸ� �̸��� ���� �� �ۿ� ���� ������ �ذ��ϱ� ���� ���
class Calculator8{
	int one,two;
	int three=0;
	
	
	public void setOprands() {
		System.out.println("setOprands()");
	}
	
	public void setOprands(int one) {
		this.one = one;
	}
	
	public void setOprands(int one,int two) {
		this.one = one;
		this.two=two;
		System.out.println("setOprands(int one,two)");
		
	}
	//���� �̸�, ���� ���۹���� ���� �޼ҵ带 ��������
	//�ڹٿ����� �޼ҵ��� �̸��� ���ٰ� �ϴ��� �޼ҵ��� �Ű������� ������Ÿ���̳�
	//Ȥ�� �Ű������� ������ �޶����� �ٸ� �޼ҵ�� �ν��ϰ� ��
	public void setOprands(int one,int two,int three) {
		//this.one = one;
		//this.two=two;
		//this�� ����� ����
		this.setOprands(one, two);
		//������ ��Ȱ�뼺, �ߺ��� ����, ���������� ���Ǽ� ���ÿ� �޼�
		this.three=three;
		System.out.println("setOprands2(int one,int two,int three)");
	}
	
	public void sum() {
		System.out.println(this.one +this.two+ this.three);
	}
	
}
public class OverloadingDemo {

	public static void main(String[] args) {
		Calculator8 c1 = new Calculator8();
		c1.setOprands(10,20);      //setOprands(int one,two)
		c1.sum(); 	// 30 ->10+20+0
		c1.setOprands(10,20,30);     //setOprands2(int one,int two,int three)
		c1.sum(); // 60-> 10+20+30
		
		
		//���� �ڵ�ó��, �Ű������� ���� ���� �޼ҵ��� �̸��� �޶����°� ->  bad
		//����ڰ� �޼ҵ带 ȣ���� ������ �ش� �޼ҵ��� �Ű������� ������ ����ߴٰ� 
		// �ùٸ� �޼ҵ带 ȣ���ؾ��ϴ� �������� �߻�
		
		//�����ε�: ���� �̸��� �޼ҵ带 ������ �����ϴ� ���
		
		//�ڹ� -> �޼ҵ峻�� ��¹��� �ִ� ���� �ش� �޼ҵ尡 ȣ��Ǿ����� Ȯ���ϴ� �뵵�� ���
		
		
	}

}