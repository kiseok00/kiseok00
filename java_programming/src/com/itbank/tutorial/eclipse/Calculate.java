package com.itbank.tutorial.eclipse;

public class Calculate {
	int a, b;
	
	//1.����� �޼ҵ�
	public int sum(int num1,int num2) {
		return num1+num2;
	}
	
	public int sum1() {
		return a+b;
	}
	
	public void setNum (int a, int b) {
		this.a= a;
		this.b=b;
	}
	
	//2.�Է°� ���� �޼ҵ�
	public int multiply() {
		return a*b;
	}
	
	//3.return���� ���� �޼ҵ� --> void
	public void sum2() {
		System.out.println("a�� b�� ����"+(a+b)+"�Դϴ�.");
	}
	
	//4.void�޼ҵ� -> return;
	//return���� �̿��� �޼ҵ带 ��������
	//�Ϲ� �޼ҵ忡���� return���� �޼ҵ� ���������� �� �Ұ���
	public void matchVersion(String version) {
		if("V1".equals(version)) {
			return;
		}
		System.out.println(" ���� ������?"+version);
	}

	public static void main(String[] args) {
		int c=1;
		int d=2;
		Calculate calc = new Calculate();
		calc.sum(c, d);
		System.out.println(calc.sum(c, d));
		calc.setNum(3, 4);   // a=3,b=4
		System.out.println(calc.multiply()); //12
		System.out.println(calc.sum1()); //7
		
		Calculate calc2 = new Calculate();
		calc2.setNum(5,2);
		System.out.println(calc2.sum1());
		System.out.println(calc2.multiply());
		calc2.sum2();
		
		
		calc2.matchVersion("V1");
		calc2.matchVersion("V2");
		
		
		
		//calc2��� ���ο� ��ü �����ؼ� �� ���� ���Ƿ� ������ �� �� �޼ҵ� ȣ���ϱ�
		
		

	}

}
