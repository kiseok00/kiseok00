package com.itbank.tutorial.eclipse;

//Ŭ���� �޼ҵ�:static??
class C1{
	//static�� ���(����,�޼ҵ�)�տ� ���̸� Ŭ������ ����� ��.
	static int base=10;
	int a,b;
	
	public void setNum(int a, int b) {
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
	
	

	public static int multiply(int c, int d) {
		return c*d;
		
	}
	
	
	//Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� �����Ѱ�?
	public static void static_multiply() {
		System.out.println(b + base);
	}
	//���: Ŭ���� �޼ҵ�� �ν��Ͻ� ����� ������ �� ����.
	//����? �ν��Ͻ� ������ �ν��Ͻ��� ��������鼭  �����Ǵµ�, Ŭ���� �޼ҵ�� �ν��Ͻ��� �����Ǳ� ���� ��������� ������ Ŭ���� �޼ҵ尡 �ν��Ͻ� ����� �����Ѵٴ� ���� �������� �ʴ� �ν��Ͻ� ������ �����ϴ� �Ͱ� ����.
}



public class StaticDemo {
	
	//static:�ڹٰ� ������ �Ǵ� ���� ����
	//void: return�� �������� ����
	//public:���� ������. ��� �������� �ش� ��ü�� ������ �� �ִ�.
	//main:���α׷��� ����
	public static void main(String[] args) {
		C1 c = new C1();
		c.setNum(3, 4);
		System.out.println(c.sum());//7
		System.out.println(c.avg());//3
		
		//��� ->����(field), �޼ҵ�(method)
		//Ŭ���� ��� vs �ν��Ͻ� ���
		//�ν��Ͻ����� ���� �ٸ� ���� ������ ������ �ν��Ͻ� ���
		//Ŭ���� ����� ��� �ν��Ͻ����� ���� ���� ����
		
		
		
		//Ŭ���� ����: �ν��Ͻ��� �������� �ʰ� Ŭ������ ���� �����ؼ� Ŭ������ �ҼӵǾ��ִ� ������ ���� ����
		System.out.println(c.base); //10
		
		
		C1 c2 =new C1();
		System.out.println(c2.base);//10
		System.out.println(C1.base);//10
		C1.base=20; //Ŭ���� ������ ����
		
		//���� ��������� ��� �ν��Ͻ��� ����
		System.out.println(c.base);//20
		System.out.println(c2.base);//20
		
		//Ŭ���� �޼ҵ带 Ŭ������ ���� �����ؼ� ȣ��
		//��ȸ��ó�� �ѹ��� ����ϰ� ������
		System.out.println(C1.multiply(4, 2));//8
		
		//�޼ҵ尡 �ν��Ͻ� ������ �������� �ʴ´ٸ�, Ŭ���� �޼ҵ带 ���.
		//���� ���ʿ��� �ν��Ͻ��� ������ ���� �� ����.
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		
		//Ŭ���� ���(����,�޼ҵ�)�� ȿ�밡ġ: ���ʿ��� �ν��Ͻ��� ������ ���� ����
		//������ �Ǵ� ���� Ŭ���� ����� ���ǵ�.
		
	}


}
