package com.itbank.tutorial.eclipse;

public class ScopeDemo {
	public static void a() {
		int i=0;    	//i��� ������ a��� �޼ҵ� �ȿ��� ����ǰ� �����Ƿ� i�� a �޼ҵ� �ۿ��� �����ġ�� ����.
						//��ȿ����(scope)������
	}

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			a();
			System.out.println(i);
		}
		//����� ����? ->���ѷ���?
		//����� ���ѷ����� �ƴ� 0 1 2 3 4
		

	}

}