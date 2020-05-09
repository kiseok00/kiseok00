package com.itbank.tutorial.eclipse;

// ���: �����شٴ� �ǹ�
// � ��ü�� ������ �� ��ü�� �ʵ�(����)�� �޼ҵ带 �ٸ� ��ü�� �������� �� �ִ� ���

//class Calculator (extends Object)
//Object: ��� Ŭ������ ����� ����
// �ƹ��͵� ��ӹ��� �ʰ� �ִٸ� �Ϲ������� ObjectŬ������ ��ӹްԵ�.
//https://docs.oracle.com/javase/7/docs/api/java/lang/Object.html
//����  Object  Ŭ������ �޼ҵ���� ��ӹ޾Ƽ� �� �� �ִٴ� �ǹ�

class Calculator {
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left =left;
		this.right = right;
	}
}


class C3{
	
	static int base=10;
	int a,b;
	
	//������
	//� �޼ҵ庸�ٵ� ���� �����
	//��ü�� ���� ���� �ؾ��� ��, �� �ʱ�ȭ�� �����ϰ� ��
	//�������� �̸��� �ݵ�� Ŭ������ �̸��� �����ؾ���.
	public C3(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public int sum()
	{
		return a+b;
	}
	public int avg() {
		return(a+b)/2;
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		/*C3 calc = new C3();
		calc.setNum(3, 5);
		System.out.println(calc.sum());
		System.out.println(calc.avg());*/
		
		
		//�̷��� ���� �ʱⰪ ������ ��ü ���� ��ÿ� ������
		//���� ��ü�� ����� �� �ݵ�� �ؾ��ϴ� ���� ��ġ�� �ʰ� ��
		C3 calc = new C3(3,5);
		System.out.println(calc.sum());
		
		
		
		//��� 
		//Ŭ���� ������ ��, �����ڰ� �������� ������ �ڵ� ��������.
		//���� ��ü ������ ��, new �� C3()ó�� ���� ���� �����ڸ� �ǹ��Ѵ�.
		
		
	}
	}


